
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);

        //Declaration
        int positiveInteger;

        //Prompt user to enter a positive integer
        System.out.print("Please enter a positive integer:");
        positiveInteger = input.nextInt();

        //Display even
        if (positiveInteger % 2 == 0){
            System.out.print(positiveInteger + " is even");}
        else{ //Display odd
            System.out.print(positiveInteger + " is odd");
        }


    }
}
