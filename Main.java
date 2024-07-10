import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Let's sum some numbers!");
        System.out.println("Write your first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Now, write your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("");

        int r;
        r = num1 + num2;

        System.out.println("The sum of " + num1 + " + " + num2 + " its equal " + r + ".");
        


    }

}