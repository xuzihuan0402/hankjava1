package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		String s = "Hello world";
		System.out.println(s.substring(7));
		System.out.println(s.substring(2,6));
		
		char ch[] = s.toCharArray();
		for(int i=s.length()-1; i>=0;i--){
			//System.out.print(s.substring(i,i+1));
			System.out.print(s.charAt(i));
			String fruit = "banana";
			int index = fruit.indexOf('a');
		}
		
		System.out.println();
		
		String n = "Jack Tom Eric Tom Tom Jack";
		String name = "Tom";
		while(n.indexOf("Tom") !=-1){
			int index = n.indexOf("Tom");
			n = n.substring(0,index)+"boss"+n.substring(index+name.length());
			}
		System.out.println(n);
		
		int nn = Integer.parseInt("12");
		nn++;
		Integer ii = nn;
		
		
	}

}
