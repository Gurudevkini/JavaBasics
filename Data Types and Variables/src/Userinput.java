import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name :");
        String name = input.nextLine();
        System.out.print("Good Morning " + name + "  have a nice day");
        System.out.println( "\n"+name + ", Also the value");
    }
}
