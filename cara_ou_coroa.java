import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // declarações e instanciação a objetos

        String escolhaUsuario;
        boolean resultadoSorteio;
        //Declarações das variáveis

        System.out.println("Escolha cara ou coroa: ");
        escolhaUsuario = scanner.nextLine().toLowerCase();
        // "" .toLowerCase(); "" Ele converte todas as letras de um texto para minúsculas.

        resultadoSorteio = random.nextBoolean();
        // metodo usado para sorteio aleatório

        if (resultadoSorteio) {
            System.out.println("Caiu Coroa!");
        } else {
            System.out.println("Caiu Moeda!");
        }
        // mensagem que irá aparecer

        scanner.close();
    }
}
