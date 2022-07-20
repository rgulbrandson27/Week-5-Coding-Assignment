package week5homeworkinterface;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		
		System.out.println("");
		
		asteriskLogger.log("LOGGERS");
		
		System.out.println("");
		
		asteriskLogger.error("ARE");
		
		System.out.println("");
		
		SpacedLogger spacedLogger = new SpacedLogger();
				
		spacedLogger.log("ALWAYS");
		
		System.out.println("");
		
		System.out.println("");
		
		spacedLogger.error("FUN");

	}

}
