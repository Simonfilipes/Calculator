import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.print("Choose [1] for sum or [2] for subtract: ");
        int choose = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        System.out.println("Now, choose the two numbers for sum or subtract.");

        System.out.println();

        System.err.print("First number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.err.print("Secont number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("");
        
        int r = 0;

        if (choose == 1) {
            r = num1 + num2;
        } else {
            r = num1 - num2;
        }

        System.out.println("Your answer is: " + r);

        scanner.close();

    }

}