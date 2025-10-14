import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Formulas matematicas em programação:
          -  circunferencia = 2 * Math.PI * raio;
          -  area = Math.PI * Math.pow(radius, 2);
          -  volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
        */

        Scanner scanner = new Scanner(System.in);

        double raio;
        double circunferencia;
        double area;
        double volume;

        System.out.println("Digite o raio: ");
        raio = scanner.nextDouble();

        circunferencia = 2 + Math.PI * raio;
        area = Math.PI *  Math.pow(raio, 2);
        volume = (4.0 / 3.0) *  Math.PI * Math.pow(raio, 3);

        System.out.printf("A circunferencia é: %.1fcm\n", circunferencia);
        System.out.printf("A area é: %.1fcm²\n", area);
        System.out.printf("O volume é: %.1fcm³\n", volume);

        /*
        Quando você usa println para imprimir números decimais, 
        ele mostra todas as casas decimais que o número tem, o que pode ficar confuso.
        Para controlar quantas casas decimais aparecem, 
        você precisa trocar println por printf e usar o formato %.Xf, 
        onde o X é a quantidade de casas decimais que você quer mostrar depois da vírgula.
        */

        scanner.close();
        // ---------------------------------------------------------


        // ---------------------------------------------------------
        //    HIPOTENUSA c = Math.sqrt(a² = b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite a comprimento do lado A: ");
        a = scanner.nextDouble();

        System.out.println("Digite a largura do lado B: ");
        b = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A hipotenusa (lado C) é: " + c + "cm");

        scanner.close();
        // ---------------------------------------------------------
    }
}
