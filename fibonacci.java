/*
Java Textbook page 4-48 Practice Problem #1: Print a user specified amount of Fibnocchi numbers.

*/

import java.util.Scanner;

public class fibonacci {		
	
	public long getInput(){
		Scanner console = new Scanner(System.in);
		long index=0;					
		
		System.out.print("How many Fibonacci numbers do you want? ");		
		index = console.nextLong();				
		System.out.println("");
		if (index==0){
			System.out.println("Then there's nothing to show!");
			return 0;
		}
		return index;
	}
	
	public long recFib(long n){
		if (n==1)
			return 0;
		else if (n==2)
			return 1;
		return recFib(n-1) + recFib(n-2);
	}
	
	public long calculateFib(long x){
		long v1=0, v2=1, fib=0;
		
		if (x==1)
			return 0;
		else if (x==2)
			return 1;
		for (long i = 2; i <= x; i++) {
			fib = v1 + v2;
			v1 = v2;
			v2 = fib;		
		}		
		return v1;
	}
	
	public static void main(String[] args){
		fibonacci calc = new fibonacci();
		long index = calc.getInput();
		
		if (index != 0);
		for (long i = 1; i<=index; i++)
		System.out.print(calc.recFib(i)+" ");
	}
}