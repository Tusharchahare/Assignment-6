Write a program to find the factorial of a number using loop. 


import java.util.Scanner;
public class fac_num {
    
    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);



        System.out.println(" enter a num :");
        int n = sc.nextInt();
        int fact = 1;

        for(int i =n; i >=1; i--){

            fact *= i; 

        }
        System.out.println("factorial is" + fact );

    }


    
}
