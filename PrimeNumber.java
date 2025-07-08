package t;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int number = s.nextInt();

        boolean isPrime = true;

        for (int i = 2 ; i<= number/2 ; i++)
        {
            if(number%i == 0)
            {
                isPrime=false;
                break;
            }
        }

        if (isPrime)
            System.out.println("number is Prime");
        else
            System.out.println("number is Not Prime");
    }
}
