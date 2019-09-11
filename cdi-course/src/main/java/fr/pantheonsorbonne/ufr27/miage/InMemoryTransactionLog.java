package fr.pantheonsorbonne.ufr27.miage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTransactionLog implements TransactionLog {

	List<ChargeResult> results = new ArrayList<ChargeResult>();

	@Override
	public void logConnectException(UnreachableException e) {

	}

	@Override
	public void logChargeResult(ChargeResult result) {
		results.add(result);

	}

	@Override
	public boolean wasSuccessLogged() {
		return true;
	}

}