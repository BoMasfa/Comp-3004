import java.util.ArrayList;
import java.util.Collections;

public class Deck<T> {
	
	private ArrayList<T> cards;
	
	public Deck (){
		cards = new ArrayList<T>();
	}
	
	public T drawCard() {
		if (cards.size() != 0) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	
	public void addCard(T card) {
		cards.add(card);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public int size() {
		return cards.size();
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (T t : cards) {
			s.append(t + "\n");
		}
		
		return s.toString();
	}
}
