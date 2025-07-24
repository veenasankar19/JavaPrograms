package exceptionHandling;

public class VotingException extends Exception {  //Exception is parent class. Hence used extends keyword.

	public VotingException(String string) {
		super (string);
	}

}
