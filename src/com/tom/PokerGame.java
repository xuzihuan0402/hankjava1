package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		
		int[] n = new int [10];
		System.out.println(n[4]);
		
		Card[] c = new Card[10];
		c[0] = new Card(7);
		System.out.println(c[0].get());
		
		Poker poker = new Poker();
		poker.shuffle();
		poker.print();
		
	}
		
		//Random random = new Random();
		//char flowers[]={0x2663,0x2666,0x2665,0x2660};
		
		
		/*
		int nums[] = new int [5];
		nums[0] = 77 ;
		nums[4] = 98 ;
		System.out.println(nums[4]);
		System.out.println(nums.length);
		for(int i = 0 ;i<nums.length ;i++){
			System.out.println(nums[i]);
		}
		*/
		
		/*
		char[]A = {'S','H','D','C'};
		Random r = new Random();
		int sub = r.nextInt(A.length);
		System.out.print(A[sub]);
		*/
		
		/*
		int num = random.nextInt(13)+1 ;
		System.out.print(num);
		char str = 'S';
		switch(random.nextInt(4)+1){
		case 1 :
			str = 'S';
			break;
		case 2 :
			str = 'H';
			break;
		case 3 :
			str = 'D';
			break;
		default:,x
			str = 'C',
		}
		System.out.print(str);
		*/

	}


