import java.util.LinkedList;

public class Init {

	public static LinkedList<Player> list = new LinkedList();
	

	public static LinkedList<Player> getList() {
	return list;
	}
	

	public void numPlayers(int n) {
	for (int i = 1; i <= n; i++) {
		Player player = new Player("Player " + i, 20, 5);
		list.add(player);
	}
	}
	
	
	
}
