
import java.util.Scanner;

public class Greatest{
    public static void main(String[] args) {
        Scanner in = new 
        Scanner(System.in);
        //input any greatest integer
        System.out.println("enter 2 digit greatest integer");
        int k = in.nextInt();
        int j = in.nextInt();

        //check greatest number among two digits
        if (k>j) { System.out.println("greatest number");
            
        } else { System.out.println("shortest number");
        }
    }
}