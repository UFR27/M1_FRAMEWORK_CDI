package fr.pantheonsorbonne.ufr27.miage;

public class ChargeResult {

	String message;
	boolean successful = false;

	public ChargeResult(boolean successful, String message) {
		this.message = message;
		this.successful = successful;
	}

	public ChargeResult(boolean successful) {
		this(successful, null);
	}

	public boolean wasSuccessful() {
		return this.successful;
	}

	public String getDeclineMessage() {
		return this.message;
	}
}