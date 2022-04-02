package war;

import java.util.LinkedList;
import java.util.List;

public class Player {

	private String name;
	private List<Card> hand = new LinkedList<Card>();
	private int score;
	
	
	public void setName(String name) {
		this.name = name;	
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public Card flip() {
		return hand.remove(0);
	}
	public int getScore(){
		return score;
	}
	public void incrementScore() {
		score += 1;
	}
	public void describe() {
		System.out.println(name + ": " + score);
	}
	public String toString() {
		StringBuilder x = new StringBuilder();
		return name;
	}
}
	
