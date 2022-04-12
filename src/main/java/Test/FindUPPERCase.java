package Test;

import java.util.Arrays;

public class FindUPPERCase {
	
	public static void main(String[] args) {

		String st = "The Cow is a Domistic Animel";
		
		String[] str= {"The","Cow", "Is", "A", "Domestic", "Animel"};
		
		for( int i=0; i<str.length; i++) {
		System.out.println(str[i]);
		}
		System.out.println(Arrays.toString(str));	
		
		
		// find capital letter
		for (int i=0; i<st.length(); i++) {
			
			char c= st.charAt(i);
			 
			 if(c>='A' && c<='Z')
				
			 {
				
				  System.out.print((c));
				  
				}
			 
			
		}
		
		
	}

}
