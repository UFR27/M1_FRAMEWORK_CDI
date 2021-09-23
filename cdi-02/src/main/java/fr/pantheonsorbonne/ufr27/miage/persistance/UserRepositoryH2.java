package fr.pantheonsorbonne.ufr27.miage.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.inject.Named;
import org.h2.tools.Server;

import fr.pantheonsorbonne.ufr27.miage.model.User;

@Named("h2")
public class UserRepositoryH2 implements UserRepository {

	static private Server server;
	static private Connection con;
	static {

		try {
			server = Server.createWebServer("-webAllowOthers");
			server = server.start();

			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS `user` (\n" + "	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,\n"
					+ "	`name` VARCHAR(80) NOT NULL\n" + ");");

		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("failed to start H2 server");
			e.printStackTrace();
			System.exit(-2);
		}

	}

	@Override
	public void save(User t) {

		PreparedStatement stm = null;
		try {
			stm = con.prepareStatement("INSERT INTO USER (name) VALUES ( ? )", Statement.RETURN_GENERATED_KEYS);
			stm.setString(1, t.getName());
			int rows = stm.executeUpdate();
			if (rows == 0) {
				throw new SQLException("Failed of insertion");
			}
			try (ResultSet rs = stm.getGeneratedKeys()) {

				if (rs.first()) {
					t.setId(rs.getLong(1));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		}

	}

	@Override
	public User find(Long id) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM user where id=" + id);
			if (rs.next()) {
				String name = rs.getString(2);
				User u = new User();
				u.setId(id);
				u.setName(name);
				return u;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
