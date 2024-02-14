//Main.java

class Main{
	public static void main(String[] args){
		Deck deck = new Deck();
		deck.createDeck();
		deck.printDeck();
		System.out.println("-------------Shuffling------------");
		deck.shuffleDeck();
		deck.printDeck();



}
}