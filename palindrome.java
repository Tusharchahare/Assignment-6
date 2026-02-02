Write a program to check if a number is palindrome. 






import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int i =sc.nextInt();
        int a = i;
        int rev = 0; 

        while(a>0) {

			int rem=a%10;
			rev=rev*10 +rem;
			a=a/10;

            }
		if(rev==i)	
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

    }


}
