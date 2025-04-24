
import java.util.Scanner;

public class practic1{
    public static void main(String[] args) {
        Scanner Sc = new 
        Scanner(System.in);
        //input any greatest integer
        System.out.println("enter 2 digit greatest integer");
        int k = Sc.nextInt();
        int j = Sc.nextInt();

        //check greatest number among two digits
        if (k>j) { System.out.println("greatest number");
            
        } else { System.out.println("shortest number");
        }
    }
}