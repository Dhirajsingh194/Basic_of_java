package java100program;

import java.util.Scanner;

public class ThreeNumber {

	public static void main(String[] args) {
		// Find the Largest Number of 3
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number:");
		a=sc.nextInt();
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
		System.out.println("Enter the Third Number:");
		c=sc.nextInt();
		
		int max1=Math.max(a, b);
		int max2=Math.max(max1, c);
		
		System.out.println("This is the Maximum of 3 number is :"+max2);
		
	}

}
