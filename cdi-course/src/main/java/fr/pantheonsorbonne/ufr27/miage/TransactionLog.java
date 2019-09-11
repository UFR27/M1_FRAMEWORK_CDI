package fr.pantheonsorbonne.ufr27.miage;

public interface TransactionLog {

	void logConnectException(UnreachableException e);

	void logChargeResult(ChargeResult result);

	boolean wasSuccessLogged();

}