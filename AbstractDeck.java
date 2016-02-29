public abstract class AbstractDeck implements InterfaceDeck{ //Abstract Class implementing an interface
		
	public abstract void setCard(int index, Suit suit, Rank rank);
	
	public abstract void shuffle(Deck target, long n);
	
	public abstract void display();
}