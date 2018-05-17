package program;

public class Palindrome {

	public static void main(String[] args) {
		String Palin="Priya";
	
		System.out.println("My name is" +Palin);
		System.out.println(Palin.charAt(0));
		//System.out.println(Palin.indexOf('y'));
	
		int len=Palin.length();//get length
		char[] tempchar=new char[len];//length storedin char
		char[] chararray=new char[len];
		for(int i=0;i<len;i++)
		{
			tempchar[i]=Palin.charAt(i);		
		}
		for(int j=0;j<len;j++)
		{
			chararray[j]=tempchar[len-1-j];
		}
		String reverse=new String(chararray);
		System.out.println(reverse);

	}

}
