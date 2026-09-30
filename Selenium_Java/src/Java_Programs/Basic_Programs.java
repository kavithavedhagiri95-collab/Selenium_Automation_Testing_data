package Java_Programs;

public class Basic_Programs {

	public static void main(String[] args) {
	    String name = "Kavitha";
	    String name1 = "Kavitha";
	    for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name1.length(); j++) {
                   char ch = name.charAt(i);
                   char ch1 = name1.charAt(j);
                   System.out.println("FirstName"+" "+ch+" "+"SecondName"+" "+ch1);
			}
		}
//	    
//			char[] ch = name.toCharArray();
//			for (char c : ch) {
//				System.out.println(c);
//			}
//			
//			
			System.out.println(name.compareTo(name1));
//		
	}

}
