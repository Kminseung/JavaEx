package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// stringBasic();
		// usefulMethods();
		stringBufferEx();
	}

	private static void stringBasic() {
		String s1 = "Java";		// literal type
		String s2 = new String("Java");		// New object
		String s3 = "Java";		// literal type
		
		System.out.println("s1 == s2 ? " + (s1==s2));
		System.out.println("s1 == s3 ? " + (s1==s3));
		
		// String is a set of char
		char letters[] = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		System.out.println("s4 = " + s4);
		
		// valueOf Method -> convert basic type string type
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);
	}
	
	public static void usefulMethods() {
		String source = "Java Programming, JavaScript Programming";
		System.out.println("Origin: " + source);
		
		// access index
		System.out.println("length: " + source.length());
		System.out.println("index 5 of character" + source.charAt(5));
		
		// convert method
		System.out.println("all lower: " + source.toLowerCase());
		System.out.println("all upper: " + source.toUpperCase());
		
		// searching method (important)
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st Search: " + index);
		
		index += "Java".length();	// moving 4 character
		index = source.indexOf("Java", index);
		System.out.println("2nd Search: " + index);
		
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3rd Search: " + index);
		
		index = source.lastIndexOf("Java");
		System.out.println("4th Search: " + index);
		
		// extract
		System.out.println("index of 18~ : "+ source.substring(18));
		System.out.println("index of 18~21 : "+ source.substring(18, 22));
		
		// replacement
		System.out.println("Replace: " + source.replace("Java","Python"));
		
		// origin is not change
		System.out.println("Origin: " + source);
		
		// remove Whitespace
		String str= "                  Hello          ";
		System.out.println("trim: [" + str.trim() + "]");
		
		// string dividing
		String words[] = source.split(" ");		// split based on space
		for(String data : words) {
			System.out.println("chunk: " + data);
		}
		
		// string comparison
		// -1 < 0 < 1
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
	}
	
	private static void stringBufferEx() {
		// Able to change internal data
		StringBuffer sb = new StringBuffer("This");
		
		// string association
		sb.append(" is pencil.");
		
		// insert
		sb.insert(8, "my ");
		
		// replace
		sb.replace(8, 10, "your ");
		
		System.out.println("Result : " + sb);
		
		// Change to Buffer length
		sb.setLength(10);
		System.out.println("Result : " + sb);
		
		String s = new StringBuffer("This").append(" is pencil.").insert(8, "my ").replace(8, 10, "your").toString();
		System.out.println("Method chaining : " + s);
	}
}
