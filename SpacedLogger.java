package week5homeworkinterface;

public class SpacedLogger implements Logger {
	
	@Override
	public void log(String log) {
		
		for (int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + "  ");
		}
	}
	
	@Override
	public void error(String error) {	
		String result = "";
		
		for (int i = 0; i < error.length(); i++) {
			result += (error.charAt(i) + "  ");
		}
		
		System.out.println("Error: " +  result); 


	}

}
			