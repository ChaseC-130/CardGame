

public class Card {
	
	String name;
	int maxHealth, maxAttack, currentHealth, currentAttack;
	boolean dead;
	
	public Card(String name, int maxHealth, int maxAttack) {
		name = this.name;
		maxHealth = this.maxHealth;
		maxAttack = this.maxAttack;
		currentHealth = maxHealth;
		currentAttack = maxAttack;
		dead = false;
	}
	
	
	void attack(Card target) {
		target.currentHealth -= currentAttack;
		currentHealth -= target.currentAttack;
		if (currentHealth < 0) dead = true;
		if (target.currentHealth < 0) target.dead = true;
	}
	
	

}
