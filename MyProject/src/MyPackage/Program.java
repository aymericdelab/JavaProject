package MyPackage;

public class Program {
	
	public static void main(String[] args) {
		
		Player player1 = new Player();
		
		System.out.println("x = "+player1.x+", y = "+ player1.y);
		
		player1.move(1,5);
		
		System.out.println("x = "+player1.x+", y = "+ player1.y);
		
	}

}