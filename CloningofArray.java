package program;

public class CloningofArray {

	public static void main(String[] args) {
		int array[]= {1,2,3};
		int clonearray[]= array.clone();
		System.out.println(clonearray==array);
		for(int i=0;i<clonearray.length;i++)
		{
			System.out.println(clonearray[i]==array[i]);
		}
		

	}

}
