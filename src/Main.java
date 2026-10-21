import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");l
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What's your favourite programming language: ");
        String answer = input.nextLine();
        System.out.println(name + " is " + age + " and likes " + answer + ".");


        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is a minor.");
        }

        input.close();
    }
}

