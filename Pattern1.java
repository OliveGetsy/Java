package java1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row");
		int rows=scan.nextInt();
		System.out.println("Execute");
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+ "");
			}
		
		System.out.println();
	}
scan.close();
}
}