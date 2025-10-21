import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
      
        /*
        Random(Tipo (Classe))
        random(nome da variavel)
        new(Palavra chave)
        Random(Construtorda classe, na qual vai inicializar oobjeto
        Isso é uma declaração e instanciação de objeto
        */

        /* ------------------------------------------------------------------------------------------------------------- */
        // NÚMERO ALEATÓRIO COM DADO PRIMITIVO INT (NÚMEROS INTEIROS) :
        
        int numero1;  // variavel
        numero1 = random.nextInt(1, 101);
        System.out.println(numero1);        /*
                                            esse metodo:
                                            "  numero1 = random.nextInt(1, 101);  "
                                            vai gerar um número aleatório dentro desses parenteses
                                            primeiro numero (origin) é inclusivo,
                                            o outro é exclusivo (bound)
                                            */

        /* ------------------------------------------------------------------------------------------------------------- */
        // CARA OU COROA COM DADO PRIMITIVO BOOLEANO:
      
        boolean Coroa;
        Coroa = random.nextBoolean();

        if(Coroa) {
            System.out.println("a moeda mostra Coroa!");
        } else{
            System.out.println("á moeda mostra Cara!");
        }

        /* ------------------------------------------------------------------------------------------------------------- */
        // NÚMERO ALEATÓRIO COM DADO PRIMITIVO DOUBLE (NÚMEROS DECIMAIS) :
        
        double numero;
        numero = random.nextDouble();
        System.out.println(numero);
        

    }
}
