package fr.pantheonsorbonne.ufr27.miage.course;

public interface TransactionLog {

	void logConnectException(UnreachableException e);

	void logChargeResult(ChargeResult result);

	boolean wasSuccessLogged();

}