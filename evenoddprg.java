import java.util.Scanner;
public class evenoddprg { 
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number:");
        long n=obj.nextLong();
        if(n%2!=0){
            System.out.println("n is odd");
        }else{
        System.out.println("n is even");

    }}
    
}
