Write a program to reverse a number. 




  import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a =sc.nextInt();
		int n=a;
		int rev=0;
		
		while(n>0) {
			int rem=n%10;
			rev=rev*10 +rem;
			n=n/10;
			
		}
		System.out.println("Reversed Number is :\n " + rev);

	}

}
