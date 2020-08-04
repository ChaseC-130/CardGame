import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	

	public static LinkedList<Player> list = new LinkedList();


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of Players");
		int numPlayers = input.nextInt();
		System.out.println("Choose a Hero: ");
		System.out.println("1) Tank");
		System.out.println("2) Damage");
		
		
		
		int choice = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= numPlayers; i++) {
			Player player = new Player("Player " + i, 20, 5);
			list.add(player);
		}
		
		
		
	}

}
