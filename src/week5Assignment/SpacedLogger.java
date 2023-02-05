package week5Assignment;

public class SpacedLogger implements Logger {

	// 6: SpacedLogger adds spaces between each character of the String argument
	// 7: The Error method should do the same, but with "EEROR:" preceding
	//		the spaced out input (i.e. ERROR: H e l l o) 
	@Override
	public void log(String log) {
		char [] logChar = log.toCharArray();
			
		for(char a : logChar) {
			System.out.print(a);
			System.out.print(" ");
		}
			
	}
	public void error(String error) {
		System.out.print("ERROR:" );
		char[] errorChar = error.toCharArray();
			
		for(char b : errorChar) {
			System.out.print(b);
			System.out.print(" ");
		}
	}
	
}
