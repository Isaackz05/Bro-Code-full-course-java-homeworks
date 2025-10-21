import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /* ------------------------------------------------------------------------------------------------------------- */

        String adjetivo1;
        String sujeito1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.println("Digite um adjetivo (descritivo)");
        adjetivo1 =  scanner.nextLine();
        System.out.println("Digite um sujeito (animal ou pessoa)");
        sujeito1 =  scanner.nextLine();
        System.out.println("Digite um adjetivo (descritivo)");
        adjetivo2 =  scanner.nextLine();
        System.out.println("Digite um verbo no gerúndio (ação)");
        verbo1 =  scanner.nextLine();
        System.out.println("Digite um adjetivo (descritivo)");
        adjetivo3 =  scanner.nextLine();

        System.out.println("Hoje eu fui para um zoológico " + adjetivo1 + ".");
        System.out.println("Em uma exibição, eu vi um " + sujeito1 + ".");
        System.out.println(sujeito1 + " era " + adjetivo2 + " e estava " + verbo1 + "!");
        System.out.println("Eu estava " + adjetivo3 + "!");

        scanner.close();

        /* ------------------------------------------------------------------------------------------------------------- */

    }
}
