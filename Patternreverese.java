package java1;

import java.util.Scanner;

public class Patternreverese {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for row");
		int row=sc.nextInt();
		System.out.println("Let Execute");
		for(int i=row;i>=1;i--)
		{
			{
				for(int j=row;j>=i;j--)
		System.out.print(i+ "");	
		}
			System.out.println();
		}
		
sc.close();

	}

}
