package my.pc.test;

import java.rmi.server.UID;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.UUID;

public class Runner {

	
	public static void main (String args[]) throws NoSuchAlgorithmException, InterruptedException{
		
		//
		//                             *****************************************UUID-lerle islemek ucun bir exampledi*****************************************
		//
		
//		UUID idOne = UUID.randomUUID();
//		UUID idTwo = UUID.randomUUID();
//		
//		System.out.println(idOne + "\n" + idTwo+"\n");
//		
//		SecureRandom prng = SecureRandom.getInstance("SHA1PRNG");
//
//		String randomNum=new Integer(prng.nextInt()).toString();
//		
//		MessageDigest sha= MessageDigest.getInstance("SHA-1");
//		byte[] result =sha.digest(randomNum.getBytes());
//		
//		System.out.println("Random number : "+randomNum+"\n");
//		for(int i=0; i <10; i++){
//		System.out.println("Random number example: "+prng.nextGaussian());
//		}
//		System.out.println("\n"+"Message digest : "+hexEncode(result)+"\n");
//		
//		
//		
//		
//		 for (int idx=0; idx<10; ++idx){
//		      UID userId = new UID();
//		      System.out.println("User Id: " + userId);
//		    }
		
//		 for (Provider p : Security.getProviders()) {
//			    for (Object o : p.keySet()) {
//			        System.out.println("Alghoritms : "+o);
//			    }
//			}
		 
		//
		//                          *****************************************Threadlerle iwlemek ucun exampledi*****************************************
		//
		 String importantInfo[] = {
		            "Mares eat oats",
		            "Does eat oats",
		            "Little lambs eat ivy",
		            "A kid will eat ivy too"
		        };

		 for (int i = 0; i < importantInfo.length; i++) {
			    // Pause for 4 seconds
			    try {
			    
			        Thread.sleep(4000);
			    } catch (InterruptedException e) {
			        // We've been interrupted: no more messages.
			        return;
			    }
			    // Print a message
			    System.out.println(importantInfo[i]);
			}
		        
		 
		 
	}

	//
	//  					*****************************************UUID-lerle iwlemek ucun example-in davamidi...*************************************
	//
	
	static private String hexEncode(byte[] aInput){
	    StringBuilder result = new StringBuilder();
	    char[] digits = {'0', '1', '2', '3', '4','5','6','7','8','9','a','b','c','d','e','f'};
	    for (int idx = 0; idx < aInput.length; ++idx) {
	      byte b = aInput[idx];
	      result.append(digits[ (b&0xf0) >> 4 ]);
	      result.append(digits[ b&0x0f]);
	    }
	    return result.toString();
	  }
	
	public static void Hello(){
		
		System.out.println("Hello World");
		
		System.out.println("Second Hello World");
		
		System.out.println("Third Hello World");
	}
	
	
	
	
}
