package fr.pantheonsorbonne.ufr27.miage;



import fr.pantheonsorbonne.ufr27.miage.model.User;
import fr.pantheonsorbonne.ufr27.miage.persistance.Repository;
import jakarta.inject.Inject;


public class App {
	
	
	@Inject
	Repository<User> userRepo;
	

	public Repository<User> getRepo() {
		return this.userRepo;
	}
	
	
	public void setUserRepo(Repository<User> userRepo) {
		this.userRepo = userRepo;
	}
	
	
	
}

//public class App {
//	@Inject
//	Repository<Address> addrRepo;
//	Repository<CreditCard> ccRepo;
//	Repository<User> userRepo;
//
//	@Inject
//	public App(Repository<CreditCard> ccRepo) {		this.ccRepo = ccRepo;	}
//
//	public Repository<Address> getAddrRepo() {		return addrRepo;	}
//
//	public Repository<CreditCard> getCcRepo() {		return ccRepo;	}
//	public Repository<User> getRepo() {		return this.userRepo;	}
//	public Repository<User> getUserRepo() {		return userRepo;	}
//
//	public void setAddrRepo(Repository<Address> addrRepo) {
//		this.addrRepo = addrRepo;
//	}
//
//	public void setCcRepo(Repository<CreditCard> ccRepo) {
//		this.ccRepo = ccRepo;
//	}
//
//	@Inject
//	public void setUserRepo(Repository<User> userRepo) {
//		this.userRepo = userRepo;
//	}
//
//}
