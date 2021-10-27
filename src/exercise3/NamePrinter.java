package exercise3;
import java.util.Scanner;

public class NamePrinter{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String name= input.nextLine();
    int length=name.length();
    for(int i=0;i<length;i++){
      System.out.println("* "+name.charAt(i)+" *");
    }
  }
}