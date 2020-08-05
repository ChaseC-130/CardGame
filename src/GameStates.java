import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class GameStates {
	Scanner input = new Scanner(System.in);
	
	public void updateBoard() {
		for (Player p : Init.getList()) {
			if (p.dead == true) {
				System.out.println("Player " + p.name + " has died!");
				cleanUp(p);
			}
		}
		
	}
	
	public void cleanUp(Player p) {
		Init.list.remove(p);
		while(!p.onBoard.isEmpty()) {
			Card temp = p.onBoard.poll();
			if (!temp.dead) {
				p.onBench.offer(temp);
			}
		}
	}
	
	
	
	
	public void setUpBoards() {
		Queue<Player> mappings = new LinkedList();
		for (Player p: Init.getList()) {
			if (p.dead == false) {
				mappings.offer(p);
			}
		}
		
		while(!mappings.isEmpty()) {
			Player temp = mappings.poll();
			while(!temp.onBench.isEmpty()) {
				temp.onBoard.offer(temp.onBench.poll());
			}
		}
		
		
	}
	
	public void turns() {
		System.out.println("Enter 1-5");
	}

}
