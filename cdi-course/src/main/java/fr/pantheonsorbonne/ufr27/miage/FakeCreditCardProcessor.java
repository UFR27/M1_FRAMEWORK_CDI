package fr.pantheonsorbonne.ufr27.miage;

public class FakeCreditCardProcessor implements CreditCardProcessor {

	CreditCard c;
	double amount;

	@Override
	public ChargeResult charge(CreditCard c, double amount) {
		this.c = c;
		this.amount = amount;
		return new ChargeResult(true);
	}

	public CreditCard getCardOfOnlyCharge() {
		return this.c;

	}

	public double getAmountOfOnlyCharge() {
		return this.amount;
	}
}