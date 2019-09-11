package fr.pantheonsorbonne.ufr27.miage;

public interface BillingService {

	/**
	 * 
	 * @param order
	 * @param creditCard
	 */
	Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

}