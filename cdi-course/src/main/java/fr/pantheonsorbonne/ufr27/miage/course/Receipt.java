package fr.pantheonsorbonne.ufr27.miage.course;

public class Receipt {
	double amount;
	String message;
	boolean successful = false;

	private Receipt(double amount, String message, boolean successful) {
		this.amount = amount;
		this.message = message;
		this.successful = successful;
	}

	public static Receipt forSuccessfulCharge(double amount) throws UnreachableException {
		return new Receipt(amount, "ok", true);
	}

	public static Receipt forDeclinedCharge(String declineMessage) throws UnreachableException {
		return new Receipt(0, declineMessage, false);
	}

	public static Receipt forSystemFailure(String message) {
		return new Receipt(0, message, false);
	}

	public boolean hasSuccessfulCharge() {
		return this.successful;
	}

	public double getAmountOfCharge() {
		return this.amount;
	}
}