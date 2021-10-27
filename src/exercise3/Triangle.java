package exercise3;

import java.util.Scanner;

public class Triangle{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,Area=0;
        do
        {
         a=input.nextDouble();
         b=input.nextDouble();
         c=input.nextDouble();
         boolean correct = a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a;
        if(correct){
          double p=(a+b+c)/2;
        Area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
          System.out.println("Area: "+ Area);
          if(a==b && b==c){
          System.out.println("Triangle: equilateral");
        }else if(a==b || b==c || a==c){
          System.out.println("Triangle: isosceles");
        }else{
          System.out.println("Triangle: scalene" );
        }
          
          
        }
        
        }while(a>0 && b>0 && c>0);
        }
        
        
        

}
