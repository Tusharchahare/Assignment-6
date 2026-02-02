Write a program to swap two numbers without using a third 
variable.





import java.util.Scanner;

public class numswap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("enter a 1st num : ");
        int a = sc.nextInt();

        System.out.println("enter a 2nd num : ");
         int b =sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping : ");
        System.out.println( "a = : " + a);
        System.out.println( "b = : " + b);
    }
}
