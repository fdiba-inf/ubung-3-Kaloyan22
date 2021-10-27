package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a number:");
        int n = input.nextInt();
         while(n<=2){
           System.out.println("It should be bigger than 2:");
           n = input.nextInt();
         }
         int divider=2;
         boolean prime=true;
         while(divider<n){
           if(n%divider==0){
             prime=false;
           }
           divider++;
         }
         System.out.println("Prime number: "+prime);

        
        
    }

}