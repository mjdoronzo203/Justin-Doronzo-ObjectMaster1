
public class HumanTest {

	public static void main(String[] args) {
		Human player1 = new Human();
		Human player2 = new Human();
		Human player3 = new Human();
		
		
		
		player1.attack(player2);
		player3.attack(player2);
		System.out.println(player1.health);
		System.out.println(player2.health);

	}

}
