package fr.pantheonsorbonne.ufr27.miage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RealBillingServiceTest {
	private final PizzaOrder order = new PizzaOrder(100);
	private final CreditCard creditCard = new CreditCard("1234", 11, 2010);
	private final TransactionLog transactionLog = new InMemoryTransactionLog();
	private final CreditCardProcessor processor = new FakeCreditCardProcessor();

	@Before
	public void setUp() {
		TransactionLogFactory.setInstance(transactionLog);
		CreditCardProcessorFactory.setInstance(processor);
	}

	@After
	public void tearDown() {
		TransactionLogFactory.setInstance(null);
		CreditCardProcessorFactory.setInstance(null);
	}

	@Test
	public void testSuccessfulCharge() {
		RealBillingService billingService = new RealBillingService();
		Receipt receipt = billingService.chargeOrder(order, creditCard);

		assertTrue(receipt.hasSuccessfulCharge());
		assertEquals(100, receipt.getAmountOfCharge(),0.0001);
		assertEquals(creditCard, processor.getCardOfOnlyCharge());
		assertEquals(100.0, processor.getAmountOfOnlyCharge(), 0.000001);
		assertTrue(transactionLog.wasSuccessLogged());
	}
}
