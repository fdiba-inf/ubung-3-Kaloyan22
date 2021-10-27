package exercise3;
import java.util.Scanner;

public class NumberCounter{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int PosBr=0, NegBr=0, numb, LoopBr=0;
    float suma=0 ,Avg;
    numb = input.nextInt();
     System.out.println("Start typing numbers: ");
    while(numb!=0){
      numb=0;
      numb = input.nextInt();
      
      if(numb>0){
        PosBr++;
      }
      if(numb<0) {
        NegBr++;
      }
      suma=suma+numb;
      LoopBr=LoopBr+1;      
    }
    Avg = suma / LoopBr;
    System.out.println("Positive numbers: " + PosBr);
    System.out.println("Negative numbers: " + NegBr);
    System.out.println("Sum: " + suma);
    System.out.println("Average: " + Avg);

  }
}