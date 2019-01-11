/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 1 : Factory
 */

interface IAService {
	void ProvideService();
}

class AService implements IAService {
	private static AService instance = null;
	
	private AService() {
		//Do something
	}
	
	public static synchronized AService getInstance() {
		
		if (instance == null) {
			instance = new AService();
		}
		return instance;
	}
	
	public void ProvideService() {
		System.out.println("I’m now providing the service for MyController"); 
	}
	
}

class ExampleFactory {
	private static ExampleFactory instance = null;
	
	private ExampleFactory() {
		//Do something
	}
	
	public static synchronized ExampleFactory getInstance() {
		
		if (instance == null) {
			instance = new ExampleFactory();
		}
		return instance;
	}
	
	public AService getService() {
		
		AService a = AService.getInstance();
		return a;
	}
}

class MyController {
	public static void main(String args[]) 
    { 
		//Construct ExampleFactory
		ExampleFactory exFact = ExampleFactory.getInstance();
		
		//use the ExampleFactory method getService() to create an instance of AService
		AService aService = exFact.getService();
		
		//use the method ProvideService() in AService
		aService.ProvideService();
    }
}


