package java1;

public class DuplicateArray {

	public static void main(String[] args) {
		String[] myarray= {"abc","def","ghi","jkl","def"};
		for(int i=0;i<myarray.length-1;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
				if((myarray[i]).equals(myarray[j])&&(i!=j))
				{
					System.out.println(myarray[j]);
				}
		}

	}

}
