/*
Java Textbook page 4-48 question #2: write a program to shuffle a deck of cards and display it as text.

*/
/*		
	deck class
		array[] of card objects
			assigned with card.getCard
		assign cards, method?
			nested for loop
		shuffle method
			???
		display method	
			
	card class(rank, suit)
		array[][] card representation (enum type?)
						
		getCard method, returns card[][]
		
		display method, void
			prints " Rank of Suit |"
*/	

public class shuffle {

	public static void main(String[] args){		
		SuperDeck BigDeck = new Deck(); //Polymorphism & promotion
		Deck myDeck = (Deck)BigDeck; // Typecasting
		long n;
		java.util.Date rightNow = new java.util.Date();
		
		System.out.println("The current time is: " + rightNow);
		
		System.out.println("Before shuffle:");
		myDeck.display();
		System.out.println();	
		n = myDeck.getInput();
		if (n < 0){
			System.out.println(" Invalid input: Defaulting to 0. \n");
			n = 0;
		}
		else
			myDeck.shuffle(myDeck, n);  
		System.out.printf("After shuffling %d times:%n",n);
		myDeck.display();
	}	
}