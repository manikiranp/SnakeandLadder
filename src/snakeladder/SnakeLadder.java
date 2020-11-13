package snakeladder;

import java.util.Random;

public class SnakeLadder {
	
	static int p1=0, p2=0;
	static int dice=0;
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
			diceroll();
			option(dice);
			p1=calcplayerpos(player,  dice, k);
			position(current,player);
		}
		else {
			player=p2;
			System.out.println("Player2 rolling die");
			diceroll();
			option(dice);
			p2=calcplayerpos(player, dice, k);
			position(current,player);
		}
		current=-current;
		}
		
	}
	private static int option(int dice) {
		
		int num = randnum.nextInt(3);
		switch (num) {
		case 1: 
			System.out.println("Reached Ladder");
			k=dice;
			break;

		case 2: 
			System.out.println("Snake Encountered");
			k=-dice;
			break;
		
		case 0: 
			System.out.println("Same position");
			k=0;
			break;
		}
		return k;
	}
	
	private static int diceroll() {
		dice=0;
		dice = randnum.nextInt(6)+1;
		System.out.println("Rolling Dice...:"+ dice);
		count++;
		return dice;

		
	}
	private static void position(int current,int player) {
		
		if (current<0) {
			System.out.println("---Updated Player1 position:"+p1);
			if (p1==100 ) {
				System.out.println("\nPlayer1 won the game!!\n");
				System.out.println("Total number of times die rolled:"+count);
				System.exit(0); 
				}
		}
		else {
			System.out.println("---Updated Player2 position:"+p2);
			if (p2==100) {
				System.out.println("\nPlayer2 won the game!!\n");
				System.out.println("Total number of times die rolled: "+count);
				System.exit(0); 
				}
		}
			
	}
	
	private static int calcplayerpos(int player, int dice, int k) {

		player = player+dice+k;
//		System.out.println(player+"-"+dice+"-"+k);
		if (player>end) {
			player = player-dice-k;
				
		}
		if (player<0) {
			player=0;	
			}
		
		
		
		return player;
		
		
	}

}
