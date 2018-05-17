package program;

public class PassbyReference {

	public static void passbyRefernce(String[] a)
	{
		a[0]="Change";
		
	}
	public static void main(String[] args) {
		String b[]= {"Test1","Test2","Test3"};
		System.out.println("Before pass by Refernce  :"   +b[0]);
		PassbyReference.passbyRefernce(b);
		System.out.println("After pass by Refernce   :" +b[0]);
		
		
	}

}
