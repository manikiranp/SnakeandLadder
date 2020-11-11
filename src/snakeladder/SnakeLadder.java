package snakeladder;

public class SnakeLadder {
	static int pos=0;
	int p1; int p2;
	static final int start=0;
	static final int end=100;
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game:\n");
		position();

	}



	private static void position() {
		System.out.println("Player1 position:"+pos);
		System.out.println("Player2 position:"+pos);
		
	}

}
