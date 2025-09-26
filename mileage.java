import java.util.Scanner;

public class mileage {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
System.out.println("enter the beginning mile");
       float beginning=obj.nextFloat();
       System.out.println("enter the ending mile");
       float ending=obj.nextFloat();
       int rs=25;
       float a=ending-beginning;
       System.out.println("Travelling Miles"+a);
        float b=rs*a;
       System.out.println("Spending cost "+b);
    }
}

