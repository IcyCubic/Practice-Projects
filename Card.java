// Representation of a card in a standard 52-card deck.
public class Card{
	private final Rank rank; // private // final
	private final Suit suit;	
	
  public Card(Rank rank, Suit suit){
  	this.rank = rank; //this, object variable context
  	this.suit = suit;
  	}
	
	public Rank getRank(){
		return rank;	
	}
	
	public Suit getSuit(){
		return suit;	
	}
	
  public void display(){
  	StringBuffer output = new StringBuffer(""); //Stringbuffer
  	output.append (rank+" of "+suit + " || ");
  	System.out.print(output);
  }		
}