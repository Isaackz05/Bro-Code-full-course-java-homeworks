import java.sql.SQLOutput;
import java.util.Scanner; //scanner é uma classe

public class Main {
    public static void main(String[] args){

        /* ------------------------------------------------------------------------------------------------------------- */

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " Years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }

        /* ------------------------------------------------------------------------------------------------------------- */

        // ERROS COMUNS

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // <<<< ERRO COMUM

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();

        /* ------------------------------------------------------------------------------------------------------------- */

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area);

        scanner.close();

        /* ------------------------------------------------------------------------------------------------------------- */

    }
}


