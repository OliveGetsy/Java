package program;

public class StringTrail {

	public static void main(String[] args) {
		String Palin="Priya";
		
		System.out.println("My name is" +Palin);
		System.out.println(Palin.charAt(0));
		//System.out.println(Palin.indexOf('y'));
	
		System.out.println(Palin.compareTo("priya"));
		System.out.println(Palin.compareToIgnoreCase("priya"));
		System.out.println(Palin.contains("al"));
		System.out.println(Palin.endsWith("a"));
		System.out.println(Palin.replace("Pr", "En"));
		System.out.println(Palin.toLowerCase());
		System.out.println(Palin.toUpperCase());
		String S1 ="The number is: "+ "123"+"456"; 
		System.out.println(S1);
		String s2="The no is"+(123+456);
		System.out.println(s2);

	}

}
