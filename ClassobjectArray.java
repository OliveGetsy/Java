package program;

public class ClassobjectArray {

	public static void main(String[] args) {
int array[]=new int[3];
byte array1[]=new byte[3];
short array2[]=new short[3];
String array3[]=new String[3];

	         
	      System.out.println(array.getClass());
	      System.out.println(array.getClass().getSuperclass());
	      System.out.println(array1.getClass());
	      System.out.println(array2.getClass());
	      System.out.println(array3.getClass());

	}

}
