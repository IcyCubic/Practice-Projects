import java.util.*; //import

public class Deck{
	private Card cards[]; //array

	
	public Deck(){ //Default 52-card set	//Calling method
		this(52);		 //this //Worker method
	}
	
	public Deck(int numCards){	//Overloaded Constructor, allows for custom sized deck of cards. Technique example only.
		cards = new Card[numCards];
		int i = 0;
		while (i < numCards){ // prevents index from going out of bounds in a smller-than-default size fdeck	
			for (Suit suit : Suit.values()){ //nested enhanced for loop				
				for (Rank rank : Rank.values()){
					cards[i]= new Card(rank, suit);									
					i++;
				}				
			}
		}	
	}

	public Card getCard(int index){ // getter
		return this.cards[index];	
	}
	
	public void setCard(int index, Suit suit, Rank rank){ // setter to specify a specific card at an index
		this.cards[index] = new Card(rank, suit);								// shouldn't really be used, cheating, maybe?
	}
	
	public void shuffle(Deck target){ //shuffles the deck, defaultly shuffles 1000 times
		this.shuffle(target, 1000);
	}
	
	public void shuffle(Deck target, int n){ //overloaded method, shuffles the deck n times	
		Random ran = new Random();
		Card temp = new Card(null, null);
		
		for (int i = 1; i <= n; i++){
			int ph1 = ran.nextInt(52);
			int ph2 = ran.nextInt(52);
			temp = cards[ph1];
			cards[ph1] = cards[ph2];
			cards[ph2] = temp;
									
		}
	}
	public void display(){
		int i=0;
		for (Suit suit : Suit.values()){				
			for (Rank rank : Rank.values()){
				cards[i++].display();
			}
			System.out.println();
		}
	}
}