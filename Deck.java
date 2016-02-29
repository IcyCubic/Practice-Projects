/*
Subclass of SuperDeck
*/
import java.io.*;
import java.util.Scanner;

public class Deck extends SuperDeck{

	public void display(){ //overriding display() from SuperDeck
		super.display(); //calling method from Superclass
//		System.out.println("I'm from Deck!");	
	}
	
	public long getInput(){ //gets an integer value from the user
		Scanner console = new Scanner(System.in);
		long n = 0;
		
		try{ //try-catch exception handling!
			System.out.print("How many times do you want to shuffle the deck? ");
			n = console.nextLong();
			System.out.print(n);
		} catch(Exception e1){ //catch-all for invalid input
			System.out.print(e1);
			System.out.println(". Invalid input: Defaulting to 0. \n");
			return 0;
		}	
		assert (n < 0): "Cannot shuffle negative times.";
		return n;	
	}
}