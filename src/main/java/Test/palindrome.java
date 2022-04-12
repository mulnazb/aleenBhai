package Test;

public class palindrome {

	public static void main(String[] args) {

            String name = "mom";
            String nam="";

int len = name.length();


for(int l=len-1; l>=0; l--) {
	
	nam = nam+name.charAt(l);
	
}

if(name.equals(nam)) {
	System.out.println("this is palindrome");
}else {
	System.out.println("This is not palindrome");
}

	}

}
