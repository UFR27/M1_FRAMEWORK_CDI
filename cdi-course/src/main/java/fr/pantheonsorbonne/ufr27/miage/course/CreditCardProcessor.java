package fr.pantheonsorbonne.ufr27.miage.course;

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