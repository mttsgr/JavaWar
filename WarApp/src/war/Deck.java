package war;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck extends LinkedList<Card>{
	
	private List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	private List<String> names = List.of(" of Hearts"," of Clubs"," of Diamonds"," of Spades");
	
	public Deck(){
		for(int i = 0; i <values.size(); i++) {
			Integer value = values.get(i);
			
			for(String name : names) {
				add(new Card(value, name));
		}
		}
	}
 	public List<Card> shuffle(List<Card> deck){
		Collections.shuffle(deck);
		return deck;	
	}
 		public Card draw() {
		return remove(0);
	}
}

