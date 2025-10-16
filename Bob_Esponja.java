public class main {
    public static void main(String[] args) {
        // printf() = é um metodo usado para formatar mensagens(outputs)
        // %[flags][width][.precision][specifier-character]

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

    }
}
