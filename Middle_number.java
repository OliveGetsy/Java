package program;

public class Middle_number {

	public static void main(String[] args) {
		int[] a=new int[2];
		a[0]=10;
		a[1]=20;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[2])
			{
				System.out.println(a[i]);
			}
			else
				System.out.println("nothing");
			
		}
		
	}

}
