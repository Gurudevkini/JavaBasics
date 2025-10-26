import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ADD TWO NUMBERS ");
        System.out.println("Please enter the first number :");
        int firstNum = input.nextInt();
        System.out.println("Please enter the second number :");
        int SecondNum = input.nextInt();
        int sum = firstNum + SecondNum;
        System.out.println("Sum of two number is " +sum );

    }
}

