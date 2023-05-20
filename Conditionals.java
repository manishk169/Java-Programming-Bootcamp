import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        
        System.out.println("Enter a number : ");
        Scanner sc  = new Scanner(System.in);
        int M = sc.nextInt();

        if(M %3 == 0 && M %5 == 0)       
        {
            System.out.println("Good Number");
        }
        
        else if(M %3 == 0 && M %5 != 0)
        {
            System.out.println("Bad Number");
        }
        
        else if(M %5 == 0 && M %3 != 0)
        {
            System.out.println("Poor Number");
        }
        else{
            System.out.println("-1");
        }
        
    }
}