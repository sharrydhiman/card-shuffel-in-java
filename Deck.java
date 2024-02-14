//Deck.java

//sameSuit() : if card belong to same suit.
	//compareCard() : if vards have same value.
	//dealCard() : Randomly deal 5 cards.
	//findCard : Enter Suit and value if matches show index
	//identifyCard() : select random card and detect if its face or numbered card.


import java.util.*;
class Deck{
	ArrayList<Card> cards = new ArrayList<Card>();
	int n;
	ArrayList out = new ArrayList<>();

	
	public void createDeck(){
	String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] suit = {"Spades","Diamonds","Clubs","Hearts"};
	
		for (String s:suit){
			for(String v:values){
				cards.add(new Card(s,v));
			}
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(cards);
	}
	
	public void printDeck(){
		for(Card card:cards){
			System.out.println(card);
		}
	
	}
	public void dealDeck(int n){
    	this.n = n;
    	out = new ArrayList<>();
    	for(int i=0; i<this.n; i++){
        	out.add(cards.get(i));
    		}
	}

	
	}