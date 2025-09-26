import java.util.Scanner;
public class posorneg { 
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number:");
        long n=obj.nextLong();
        if(n>0){
            System.out.println("it is pos number");
        }else if(n<0){
        System.out.println("it is neg number");
        }
        else{
            System.out.println("it is zero");
        }

    }}
    


