import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* ------------------------------------------------------------------------------------------------------------- */

        String item;
        String moeda = "R$";
        double preco;
        int quantidade;
        double total;

        System.out.print("Que item você gostaria de comprar?: ");
        item = scanner.nextLine();

        System.out.print("Qual é o preço por cada?: ");
        preco = scanner.nextDouble();

        System.out.print("Quantos você gostaria?: ");
        quantidade = scanner.nextInt();

        total = preco * quantidade;

        System.out.println("\nVocê comprou " + quantidade + " " + item +"/s");
        System.out.println("Seu total é " + moeda + total);

        scanner.close();

        /* ------------------------------------------------------------------------------------------------------------- */
    }
}
