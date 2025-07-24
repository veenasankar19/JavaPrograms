package exceptionHandling;

public class ThrowsExample {

	public static void main(String[] args) throws VotingException {  //throws declare exception
			int age=10;
			if(age>=18) {
				System.out.println("Eligible for voting.");
			}
			else {
				throw new VotingException("Not Eligible for voting."); //throw displays exception
			}

		}

	}


