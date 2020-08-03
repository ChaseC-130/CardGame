import java.util.LinkedList;
import java.util.Queue;

public class Player {
	
	String name;
	boolean dead;
	int maxHealth, currentHealth, cards;
	Queue<Card> onBoard = new LinkedList<Card>();
	
	Player(String name, int maxHealth, int cards) {
		name = this.name;
		maxHealth = this.maxHealth;
		currentHealth = this.maxHealth;
		cards = this.cards;
		dead = false;
	}
	
	void damagePlayer(int damage) {
		currentHealth -= damage;
		if (currentHealth <= 0) dead = true;
	}
	
	

}
