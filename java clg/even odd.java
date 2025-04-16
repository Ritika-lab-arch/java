
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

       Scanner in= new 
       Scanner(System.in);
       //input: any integer
       System.out.println("enter an integer");
       int k = in.nextInt();
       //check even odd 
       if (k%2 ==0){
        System.out.println("even");

       }else {
        System.out.println("odd");
       }
              
       }

    }