package java1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Execute");
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( j+ "");
			}
			System.out.println();
		}
		sc.close();
		
	}
	}


