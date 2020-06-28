import java.io.File;  
import java.io.IOException;  
import java.io.FileWriter;

public class  FileJava {
  public static void main(String[] args) {
    try {

	 long startTime = System.nanoTime();
     File f = new File("filename1.txt");
     FileWriter w = new FileWriter(f);

     for(int i =0 ; i <1000000; i++){
     w.write("ligne  ...." + i + "\n");
     }
     
      w.close();
      System.out.println("Success");
      
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      
      System.out.println("Execution time in nanoseconds  : " + timeElapsed);
      System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
      
    } catch (IOException e) {
        e.printStackTrace();
    }
  }



}
