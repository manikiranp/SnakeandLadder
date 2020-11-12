package snakeladder;

import java.util.Random;

public class SnakeLadder {
	
	static int p1=0, p2=0;
	static int dice=0;
	static int opt=0;
	static int k=0;
	
	static int count=0;
	static final int start=0;
	static final int end=100;
	static int player=0;
	static Random randnum = new Random();
		
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game:\n");
		System.out.println("Initial players position:"+start);
		int current = -1;
		while (player!=end) {
	
		if (current==-1) {
			player=p1;
			System.out.println("Player1 rolling die");
			p1=calcplayerpos(player,  dice, k);
			position(current,player);
		}
		else {
			player=p2;
			System.out.println("Player2 rolling die");
			p2=calcplayerpos(player, dice, k);
			position(current,player);
		}
		current=-current;
		}
			
		//while (p1!=end) {
//		position();
//		diceroll();
//		option();
//		}
		
	}
	private static int option(int dice) {
		int num = randnum.nextInt(3);
		switch (num) {
		 
		case 1: 
			System.out.println("Reached Ladder");
//			p1=p1+opt;
			k=dice;
			if (p1>100) {
				System.out.println("Exceeeding 100");
				p1=p1-dice;
			}
				else if (p1==100) {
				System.out.println("Reached 100");
				break;
			}
			break;

		case 2: 
			System.out.println("Snake Encountered");
//			p1=p1-opt;
			k=-dice;
			if (p1>100) {
				System.out.println("Exceeeding 100");
				p1=p1-dice;
			}
			else if (p1==100) {
				System.out.println("Reached 100");
				break;
			}
			break;
			//position();
		
		case 0: 
			System.out.println("Same position");
//			p1=p1;
			k=0;
			break;
		}
		return k;
	}
	private static  int diceroll() {
		dice = randnum.nextInt(6)+1;
		System.out.println("Rolling Dice...:"+ dice);
		count++;
		//p1=p1+dice;
		//opt=dice;
		return dice;
//		if (p1>100) {
//			System.out.println("Exceeeding 100");
//			p1=p1-dice;
//		}
//		position();
		
	}
	private static void position(int current,int player) {
		
		if (current<0) {
			if (player==100) {
				System.out.println("Reached winning position:"+ p1);
				System.out.println("Total number of times die rolled:"+count);
				System.exit(0);
			}
			System.out.println("---Updated Player1 position:"+p1);
		}
		else {
			if (player==100) {
				System.out.println("Reached winning position:"+ p2);
				System.out.println("Total number of times die rolled:"+count);
				System.exit(0);
			}
			System.out.println("---Updated Player2 position:"+p2);
		}
		
//		if (p1<0) {
//			p1=0;
//		}
//		else if (p1==100) {
//			System.out.println("Reached winning position:"+ p1);
//			System.out.println("Total number of times die rolled:"+count);
//			System.exit(0);
//		}
//		System.out.println("---Updated Player1 position:"+ p1);
//		///
//		if (p2<0) {
//			p2=0;
//		}
//		else if (p2==100) {
//			System.out.println("Reached winning position:"+ p2);
//			System.out.println("Total number of times die rolled:"+count);
//			System.exit(0);
//		}
//		System.out.println("---Updated Player2 position:"+ p2);	
		
	}
	////
	private static int calcplayerpos(int player, int dice, int k) {
		diceroll();
		option(dice);
		player = player +dice+k;
		if (player>end) {
			player = player - dice;
			return player;
		}
		if (player<0) {
				player=0;
				return player;
			}
		if (player==100) {
			System.out.println(player+"player won");
			return player;
		}
		return player;
		
		
	}

}
