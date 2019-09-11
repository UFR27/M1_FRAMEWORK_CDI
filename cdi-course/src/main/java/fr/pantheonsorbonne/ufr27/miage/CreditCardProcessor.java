package fr.pantheonsorbonne.ufr27.miage;

public interface CreditCardProcessor {

	/**
	 * 
	 * @param c
	 * @param amount
	 */
	ChargeResult charge(CreditCard c, double amount);

	CreditCard getCardOfOnlyCharge();

	double getAmountOfOnlyCharge();

}