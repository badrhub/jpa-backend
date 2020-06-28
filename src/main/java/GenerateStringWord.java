import java.nio.charset.Charset;
import java.util.Random;

///import org.apache.commons.lang.RandomStringUtils;

public class GenerateStringWord {
	
	
	public static void main(String[] args) {
//		int leftLimit = 97; // letter 'a'
//	    int rightLimit = 122; // letter 'z'
//	    int targetStringLength = 10;
//	    Random random = new Random();
//	 
//	    for(int u = 0 ; u<100 ; u++) {
//	    String generatedString = random.ints(leftLimit, rightLimit + 1)
//	      .limit(targetStringLength)
//	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//	      .toString();
//	 	  System.out.println(generatedString);
//	    }
 
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
//		
//		 int length = 10;
//		    boolean useLetters = true;
//		    boolean useNumbers = false;
//		    String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
//		    System.out.println(generatedString);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//String generatedString = RandomStringUtils.randomAlphabetic(10);
        //System.out.println(generatedString);
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
//		String generatedString = RandomStringUtils.randomAlphanumeric(10);
//	    System.out.println(generatedString);

		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
//		
//		for(int u = 0 ; u<10 ; u++) {
//			int i = (int) (Math.random()*10);
//			System.out.println(i);
//		}
		
		String[] t = words(20,5);
		
		for(String s : t) {
			System.out.println(s);
		}
		
        int[] y = ages(20,100);
		
		for(int s : y) {
			System.out.println(s);
		}
		
}
	
	public static String[] words(int s , int tail) {
		String[] t = new String[s];
		for(int i =0 ; i<s ; i++) {
	//		t[i] = RandomStringUtils.randomAlphabetic(tail);
		}
		return t;
	}
	
	public static int[] ages(int s , int tail) {
		int[] t = new int[s];
		for(int u = 0 ; u<s ; u++) {
			t[u] =(int) (Math.random()*tail);
		}
		return t;
	}
	

}