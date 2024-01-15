public class Question1 {

	public static void main(String[] args) {
		String s1 = "Java Korea";
		String s2 = new String("Java Korea");
		String s3 = s1;
				
		//#1.
		System.out.println("#1. s1.equals(s2): " + s1.equals(s2));
		//#2.
		System.out.println("#2. s1.replace('a', 'A'): " + s1.replace('a', 'A'));
		//#3.
		System.out.println("#3. s2.toUpperCase(): " + s2.toUpperCase());
		//#4.
		System.out.println("#4. s2.length(): " + s2.length());
		//#5.
		System.out.println("#5. s1.lastIndexOf('a'): " + s1.lastIndexOf('a'));		
		//#6.
		System.out.println("#6. s2.substring(5): " + s2.substring(5));				
		//#7.
		System.out.println("#7. s1.substring(0,4): " + s1.substring(0,4));				
		//#8.
		System.out.println("#8. s1.compareTo(s2): " + s2.compareTo(s2));					
		//#9.
		System.out.println("#9. s1.compareTo(s3): " + s1.compareTo(s3));
		//#10.
		System.out.println("#10. s1.startsWith(\"java\")" + s1.startsWith("java") );
	}
}