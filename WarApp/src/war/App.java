package war;

public class App {
	public static void main(String[] args) {
	
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("Marvel");
		player2.setName("Murphy");
		
		deck.shuffle(deck);
		
		draw(deck, player1, player2);
		
		play(player1, player2);	
		player1.describe();
		player2.describe();
		
		printWinner(player1, player2);	
	}
		public static void draw(Deck deck, Player player1, Player player2) {
		for(int i = 0; i < 52; i++) {
			if(i % 2 != 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
		}
		}	
	}
		public static void play(Player player1, Player player2) {
		for(int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			}
			else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				
		}
		}
	}
		public static void printWinner(Player player1, Player player2) {
		if(player1.getScore() == player2.getScore()) {
			System.out.println("There has been a draw");
		}
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.toString() + " has won");
		}
		if(player2.getScore() > player1.getScore()) {
			System.out.println(player2.toString() + " has won");
		}
	}
}


