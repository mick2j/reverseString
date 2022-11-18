package reversString;
import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) {
		String s = "";
		char q;
		boolean rep = true;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Please enter a single word with more than 5 characters but less than 5");
		String str = sc.next();
		int length = str.length();
		if ( length < 5 || length > 25) {
			System.out.println("Please enter a word between 5 and 25 characters ");
		};
		System.out.println("you entered this word: " + str);
		
		for (int i=0; i<str.length(); i++) {
			 q = str.charAt(i);
			 s = q+s;
		}
	
			
			System.out.println("This is your word spelled backwards: " + s);
				
	}
		while ( rep = true );
		System.out.println(" Would you like to run this again? Y/N");
		String str1 = sc.next();
		if ( str1 == "y" || str1 == "Y") {
			rep = false;
		}
		

 }
}
