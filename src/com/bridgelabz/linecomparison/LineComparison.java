package com.bridgelabz.linecomparison;
import java.util.*;
public class LineComparison {
	
	public static void main(String[] args) {
		int i,j;
		int x[] = new int[2];
		int y[] = new int[2];
		double len_of_line[] = new double[2];
		Scanner sc = new Scanner(System.in);
		for(i=1;i<=2;i++)
		{
			System.out.println("Enter coordinate of line "+i);
			for(j=1;j<=2;j++)
		    {
		    	System.out.println(" Enter x-coordiante of point " + j);
		    	x[j-1]=sc.nextInt();
		    	System.out.println(" Enter y-coordiante of point " + j);
		    	y[j-1]=sc.nextInt();
		    }
		    //Length of line
		    len_of_line[i-1] = Math.sqrt(Math.pow(x[1]-x[0],2) + Math.pow(y[1]-y[0],2));	
		}
		if(len_of_line[0]==len_of_line[1]) {
			System.out.println("The lenght of both the lines are equal");
		}
		else if(len_of_line[0] > len_of_line[1]) {
			System.out.println("Length of line-1 is greater than line-2");
		}
		else if(len_of_line[0] < len_of_line[1]) {
			System.out.println("Length of line-1 is smaller than line-2");
		} 
		
	}

}
