package Test;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		
		
		int num =232;
		int rem =0;
		int rev =0;
		int tem = num;
		
		while(tem>0) {
			
			rem = tem%10;
			rev = rev*10+rem;
			tem = tem/10;
		}

		
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
	}

}
