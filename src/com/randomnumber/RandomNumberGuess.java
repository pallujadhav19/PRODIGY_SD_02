package com.randomnumber;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class RandomNumberGuess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=sc.nextLine();
		
		System.out.println("well,"+name+", I am thinking of a number is between 1 and 20");
		int myNumber=getRandomNumber(1,21);
		
		for(int i=0;i<6;i++)
		{
			Scanner sc2=new Scanner(System.in);
			System.out.println("Take a Guess");
			int guess=sc2.nextInt();
			
			if(guess==myNumber)
			{
				System.out.println("Your Guess Is Correctly!");
				break;
			}
			else if(guess<myNumber)
			{
			  System.out.println("Your Guess Is Too Low");
			}
			else if(guess>myNumber)
			{
				System.out.println("Your Guess Is Too High");
			}
			if(i>=5)
			{
				System.out.println();
				System.out.println("Nope.The number I was thinking of was "+myNumber+"!");
			}
			
		}
		

	}
	public static int getRandomNumber(int min, int max)
	{
		Random random=new Random();
		return random.ints(min,max).findFirst().getAsInt();
				
	}

}
 