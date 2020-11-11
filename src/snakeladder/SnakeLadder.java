package snakeladder;

import java.util.Random;

public class SnakeLadder {
	
	static int p1=0;
	static int dice=0;
	static int opt=0;
	static final int start=0;
	static final int end=100;
	static Random randnum = new Random();
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game:\n");
		System.out.println("Initial player position:"+start);
		while (p1<=end) {
		position();
		diceroll();
		option();
		}
	}
	private static void option() {
		int num = randnum.nextInt(3);
		 
		if (num==1) {
			System.out.println("Reached Ladder");
			p1=p1+opt;
			//position();
		}
		else if (num==2) {
			System.out.println("Snake Encountered");
			
			p1=p1-opt;
			//position();
		}
		else {
			System.out.println("Same position");
			p1=p1;
			//position();
		
		}
	}
	private static void diceroll() {
		
		dice = randnum.nextInt(6)+1;
		System.out.println("Rolling Dice...:"+ dice);
		p1=p1+dice;
		opt=dice;
		position();
		
	}
	private static void position() {
		if (p1<0) {
			p1=0;
		}
		System.out.println("---Updated Player position:"+ p1);
		
		
	}



}
