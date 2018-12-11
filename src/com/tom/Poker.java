package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
	//int[]cards = new int[52];
	//Card[] cards = new Card[52];
	ArrayList bag = new ArrayList();
	
	public Poker(){
		for(int i = 0 ; i <52 ; i++){
			//cards[i]=i;
			//cards[i] = new Card(i);
			Card c = new Card(i);
			bag.add(c);
		}
		System.out.println(bag.size());
	}
	
	public void shuffle(){
		//a=cards[i]
		//b=cards[r]
		for(int i = 0 ; i <52 ; i++){
			int r = new Random().nextInt(52);
			//Card tmp = cards[i];
			//cards[i] = cards[r];
			//cards[r] = tmp;
		}
	}
	
	public void print(){
		for(int i = 0; i<52; i++){
			/*
			int flower = cards[i]/13;
			char c = 0;
			switch(flower){
				case 0 :
					c = 'S';
					break;
				case 1 :
					c = 'H';
					break;
				case 2:
					c = 'D';
					break;
				case 3:
					c = 'C';
				
				}
				*/
			//System.out.print((cards[i]%13+1) + "" + c + " " );
			//System.out.print(cards[i].get() + " " );
			Card c = (Card)bag.get(i);
			System.out.print(c.get() + " ");
			
			if(i%13 == 12)
				System.out.println();
		}
	}
	
	

}
