import java.net.*;
import java.util.Scanner;
import java.io.*;
public class QuoteClient {
   public static void main(String args[]) throws UnknownHostException, IOException {
	   int number,temp;
	   Scanner sc = new Scanner(System.in);
	   Socket s = new Socket("127.0.0.1",1342);
	   Scanner sc1= new Scanner(s.getInputStream());
	   System.out.println("Enter any number: ");
	   number = sc.nextInt();
	   PrintStream p= new PrintStream(s.getOutputStream());
	   p.println(number);
	   temp= sc1.nextInt();
	   System.out.println(temp);
	   
   }
}
