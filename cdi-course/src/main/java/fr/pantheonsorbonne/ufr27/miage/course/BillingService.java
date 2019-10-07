package fr.pantheonsorbonne.ufr27.miage.course;

public interface BillingService {

	/**
	 * 
	 * @param order
	 * @param creditCard
	 */
	Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);

}