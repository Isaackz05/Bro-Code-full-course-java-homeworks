public class main {
    public static void main(String[] args) {
        // printf() = é um metodo usado para formatar mensagens(outputs)
        // %[flags][width][.precision][specifier-character]

        /* ------------------------------------------------------------------------------------------------------------- */
        
        /* [specifier-character] specificar caracteres dentro das mensagens, ao em vez de usar " + (dado) + ", você pode usar dessa forma: ("FULANO DE TOWN É %s", adjetivo) */

        String nome = "BobEsponja";
        char primeiraLetra = 'B';
        int idade = 30;
        double altura = 1.53;
        boolean Empregado = true;

        System.out.printf("Olá %s\n", nome);    // %s para String
        System.out.printf("Seu nome começa com %c\n", primeiraLetra);   // %c para char
        System.out.printf("Você tem %d anos de idade\n", idade);    // %d para int
        System.out.printf("Você tem %f de altura\n", altura);   // %f para double
        System.out.printf("Empregado: %b\n", Empregado);    // %b para boolean
        // use sempre "\n" para pular a linha e não seguir na mesma

        System.out.printf("%s tem %d anos de idade, tem %f , seu nome começa com %c e é empregado", nome, idade, altura, primeiraLetra);
        // colocar as variaveis na ordens das palavras

        /* ------------------------------------------------------------------------------------------------------------- */

        /* [.precision] usados para especificar números com vírgulas e dentre outros. */

        double preco1 = 9.99;
        double preco2 = 100.15;
        double preco3 = -54.01;

        // = mostrar um sinal de mais,
        // , = separador de grupos por meio de vírgula (100000 > 100,000),
        // ( = números negativos serão fechados em (),
        // espaço = mostra um menus se esta negativo, espaço se esta positivo.

        System.out.printf("% .2f\n", preco1);
        System.out.printf("% .2f\n", preco2);
        System.out.printf("% .2f\n", preco3);

        // para limitar as casas dos decimais você pode colocar ".X" (X é o número)

        /* ------------------------------------------------------------------------------------------------------------- */

        // [width] determina o posicionamento dos dígitos

        /*
        0 = preenchimento com zeros, 0 é o minimo e 4 é o limite:

        "%04d" :

        0001
        0023
        0456
        7890
        número = alinhamento à direita com preenchimento, nesse caso ele move os numeros
        para a direita sem precisar substitui-los por zero:

        "%4d":

        1
        23
        456
        7890
        número negativo = alinhamento à esquerda com preenchimento:

        "%-4d":

           1
          23
         456
        7890
        */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        /* ------------------------------------------------------------------------------------------------------------- */
    }
}
