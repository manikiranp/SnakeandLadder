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
		while (p1!=end) {
		position();
		diceroll();
		option();
		}
	}
	private static void option() {
		int num = randnum.nextInt(3);
		switch (num) {
		 
		case 1: 
			System.out.println("Reached Ladder");
			p1=p1+opt;
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
			p1=p1-opt;
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
			p1=p1;
			
			break;
		
	
		}
	}
	private static void diceroll() {
		
		dice = randnum.nextInt(6)+1;
		System.out.println("Rolling Dice...:"+ dice);
		p1=p1+dice;
		opt=dice;
		if (p1>100) {
			System.out.println("Exceeeding 100");
			p1=p1-dice;
		}
		position();
		
	}
	private static void position() {
		if (p1<0) {
			p1=0;
		}
		else if (p1==100) {
			System.out.println("Reached winning position:"+ p1);
			System.exit(0);
		}
		System.out.println("---Updated Player position:"+ p1);
		
		
	}



}
