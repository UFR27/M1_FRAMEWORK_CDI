package fr.pantheonsorbonne.ufr27.miage.course;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.pantheonsorbonne.ufr27.miage.course.CreditCard;
import fr.pantheonsorbonne.ufr27.miage.course.CreditCardProcessor;
import fr.pantheonsorbonne.ufr27.miage.course.CreditCardProcessorFactory;
import fr.pantheonsorbonne.ufr27.miage.course.FakeCreditCardProcessor;
import fr.pantheonsorbonne.ufr27.miage.course.InMemoryTransactionLog;
import fr.pantheonsorbonne.ufr27.miage.course.PizzaOrder;
import fr.pantheonsorbonne.ufr27.miage.course.RealBillingService;
import fr.pantheonsorbonne.ufr27.miage.course.Receipt;
import fr.pantheonsorbonne.ufr27.miage.course.TransactionLog;
import fr.pantheonsorbonne.ufr27.miage.course.TransactionLogFactory;

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
