import java.util.Scanner;

public class years{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the days");
        int days = s1.nextInt();
        int years=0;
        int months=0;
        int weeks=0;
        int day=0;
        int remainingdays=days;
        while(remainingdays>=365){
            years++;
            remainingdays=remainingdays-365;
        }
        while(remainingdays>=30)
        {
            months++;
            remainingdays=remainingdays-30;
        }while(remainingdays>=7){
            weeks++;
            remainingdays=remainingdays-7;

        }while (remainingdays>=1) {
            day++;
            remainingdays=remainingdays-1;
            
        } 
        System.out.println("Years "+years);
        System.out.println("Months "+months);
        System.out.println("Week "+weeks);
        System.out.println("Days "+day);
      }
}