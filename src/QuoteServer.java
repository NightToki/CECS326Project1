import java.net.*;
import java.util.Scanner;
import java.io.*;
public class QuoteServer {
	 public static void main(String args[]) throws Exception
     {
		 int number,temp;
		 ServerSocket s1 = new ServerSocket(1342);
		 Socket ss= s1.accept();
		 Scanner sc = new Scanner(ss.getInputStream());
		 number =sc.nextInt();
		 temp = number*2;
		 PrintStream p = new PrintStream(ss.getOutputStream());
		 p.println(temp);
     
     }
}
