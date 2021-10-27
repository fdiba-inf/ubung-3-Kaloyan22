package exercise3;

public class NumberSearch{
  public static void main(String[] args){
    String a="",b="",c="";
    int n=100;
    for(int i=0;i<10;i++)
    {
      while(n<1000){
        n++;
      if(n>100 && n%30==0 && n<400){
        a+=n+" ";
      }
      if(n>400 && n%30==0 && n<700){
        b+=n+" ";
      }
      if(n>700 && n%30==0 && n<1000){
        c+=n+" ";
      }
      }
      
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

  }
}