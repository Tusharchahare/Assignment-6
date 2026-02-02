Write a program to print Fibonacci series up to n terms. 




import java.util.Scanner;

public class FibSer {

    public static void main(String[] args){
          
        int a = 0, b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int x = a + b;
            a = b;
            b = x;

         }
    }
    
}
