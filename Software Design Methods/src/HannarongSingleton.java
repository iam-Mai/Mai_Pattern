
/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 1 : Singleton
 */

class ServiceProvider 
{ 
    private static ServiceProvider instance = null; 
  
    private ServiceProvider() 
    { 
    	//Do something
    } 
  
    public static synchronized ServiceProvider getInstance() 
    { 
        if (instance == null)  {
        	System.out.println("Constructing ServiceProvider"); 
        	instance = new ServiceProvider(); 
        } else {
        	System.out.println("ServiceProvider already exists"); 
        }
  
        return instance; 
    } 
} 
  
class Main 
{ 
    public static void main(String args[]) 
    { 
        ServiceProvider x = ServiceProvider.getInstance(); 
    	ServiceProvider y = ServiceProvider.getInstance(); 
    	ServiceProvider z = ServiceProvider.getInstance(); 
    } 
} 
