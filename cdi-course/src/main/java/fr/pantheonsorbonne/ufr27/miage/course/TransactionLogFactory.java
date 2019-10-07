package fr.pantheonsorbonne.ufr27.miage.course;

public class TransactionLogFactory {
	
	private static TransactionLog instance;

	public static void setInstance(TransactionLog tl) {
		instance = tl;
	}

	public static TransactionLog getInstance() {
		if (instance == null) {
			return new InMemoryTransactionLog();
		}
		return instance;
	}

}
