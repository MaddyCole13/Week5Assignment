package week5Assignment;

public class App extends SpacedLogger {
	
	// 8: Create a class named App that has a main method 
	// 9: In this class, instantiate an instance of each of your logger
	//    classes that implements the Logger interface
	// 10: Test both methods on both instances, passing in Strings of your choice

	public static void main(String[] args) {
	
		Logger log = new AsterixLogger();
		
		log.log("Hello");
		System.out.println();
		
		log.error("Hello");
		System.out.println();
		
		log.log("Guten Tag");
		System.out.println();
		
		log.error("Guten Tag");
		System.out.println();
		
		
		
		
		SpacedLogger secondLog = new SpacedLogger();
		
		secondLog.log("Hello");
		System.out.println(); 
		System.out.println("______________________________________");
		
		secondLog.error(" Hello");
		System.out.println();
		System.out.println("______________________________________"); 
		
		secondLog.log("Guten Tag");
		System.out.println();
		System.out.println("______________________________________");
		
		secondLog.error(" Guten Tag");
		System.out.println();
		System.out.println("______________________________________"); 
		
	}

}
