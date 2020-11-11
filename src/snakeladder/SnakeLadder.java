package snakeladder;

import java.util.Random;

public class SnakeLadder {
	
	static int p1=0; 
	static final int start=0;
	static final int end=100;
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game:\n");
		position();
		diceroll();
		
	}
	private static void diceroll() {
		Random randnum = new Random();
		int dice = randnum.nextInt(6)+1;
		System.out.println("Rolling Dice...\nDice Number :"+dice);
	}
	private static void position() {
		System.out.println("Player position:"+ start);
		
	}



}
