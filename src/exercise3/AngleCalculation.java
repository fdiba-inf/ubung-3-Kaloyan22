package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char eh;
          double Angle;
        do
        {
          Angle = input.nextDouble();
          eh= input.next().charAt(0);
          if(eh=='r'){
            Angle=(Angle*180)/Math.PI;
            System.out.println("Angle: "+ Angle + " d");
          }
          else if(eh=='d'){
            Angle=(Angle*Math.PI)/180;
            System.out.println("Angle: "+ Angle + " r");
          }
        }while(eh=='r' || eh=='d');
    }

}
