import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int num[] = new int[size];
        int i =0,j=0;
        while (j<size) {
            num[i]=scan.nextInt();5
            if(num[j]!=0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                i++;
            }
            j++;
            
        }
    }
    
}
