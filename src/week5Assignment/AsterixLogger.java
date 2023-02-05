package week5Assignment;

public class AsterixLogger implements Logger {
	
	// 4: Log method prints String received between 3 asterisks on both sides
	// 5: Error method prints String received inside of a box of asterisks,
	//    with the String preceded by the word "ERROR:" 
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***"); 
		
	}

	@Override
	public void error(String error) {
		System.out.println("******************" + "*".repeat(error.length())); 
		System.out.println("***ERROR: " + error + "***");
		System.out.println("******************" + "*".repeat(error.length()));
		
		


  }
} 
