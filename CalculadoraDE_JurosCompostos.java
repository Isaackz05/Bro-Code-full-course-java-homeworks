import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // calculadora de juros compostos

        Scanner scanner = new Scanner(System.in);

        double capitalInicial;
        double taxa;
        int vezesComposto;
        int anos;
        double valor;

        System.out.print("Digite o valor inicial: ");
        capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        taxa = scanner.nextDouble() / 100;

        System.out.print("Digite o número de vezes compostos por ano: ");
        vezesComposto = scanner.nextInt();

        System.out.print("Digite o número do ano: ");
        anos = scanner.nextInt();

        valor = capitalInicial * Math.pow(1 + taxa / vezesComposto, vezesComposto * anos);

        System.out.printf("O valor após %d ano(s) é R$%.2f", anos, valor);

        // System.out.printf("O valor depois de %d anos é R$ %,f ", anos, valor );

        scanner.close();

    }
}
