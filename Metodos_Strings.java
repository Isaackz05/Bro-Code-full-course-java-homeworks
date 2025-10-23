
public class Main {
    public static void main(String[] args){

        /* MÉTODOS STRING / STRING METHODS */

        /**
        
        PARA SABER QUANTOS CARACTÉRES OU LETRAS TEM EM UMA PALAVRA:
        é util para quando o usuário for criar uma senha
        e essa senha precisa de 8 caracteres para poder passar.

         "  int length = nome.length(); "

        -------------------------------------------------------------------------------------------------------------

        ESSE METODO PROCURA SABER QUAL É A LETRA NA POSIÇÃO DE X CARACTERE
        Para saber qual é, basta digitar o numero

         "  char letter = nome.charAt(0); "

         -------------------------------------------------------------------------------------------------------------

         AGORA, ESTE OUTRO MÉTODO MOSTRA A POSIÇÃO QUE AQUELE CARACTERE
         ESTÁ LOCALIZADA, AO EM VEZ DELE SABER A POSIÇÃO DA LETRA ATRAVÉS DO NUMERO
         ELE LOCALIZA INDICA O NUMERO (POSIÇÃO) EM QUE A LETRA ESTA LOCALIZADA.

         "  int index = name.indexOf(" (letra ou caractere) "); "

         -------------------------------------------------------------------------------------------------------------

         ESTE OUTRO MÉTODO, MOSTRA QUAL É O ULTIMO CARACTERE DE UMA FRASE

         " int lastIndex = name.lastIndexOf(" (letra ou caractere) ");  "
         
        **/

        /* ------------------------------------------------------------------------------------------------------------- */

        String nome = "Isaack";

        // para acessar esses métodos strings você precisa de uma variável que é String

        int length = nome.length();
        char letter = nome.charAt(0);
        int index = nome.indexOf(" ");
        int lastIndex = nome.lastIndexOf("");

        // v v v v métodos que fazem com que as letras fiquem totalmente maiusculas ou minusculas v v v v
        nome = nome.toUpperCase();
        nome = nome.toLowerCase();

        /*
        método que retira todos os espaços de uma frase ou palavra, como por exemplo:
        String randomName = "       NOME        COM              ESPAÇOS         ENORMES        "
        v v v v
        */
        nome = nome.trim();

        // apenas susbstitui letras por outras na qual você pede para deixar:
        nome = nome.replace("I", "E");

        System.out.println(letter);

        /* ------------------------------------------------------------------------------------------------------------- */

        /*
        Essa declaração pode ser usada para saber se o input está vazio
        " nome.isEmpty(); "
        */

        if(nome.isEmpty()){
            System.out.println("Seu nome é vazio");
        }
        else {
            System.out.println("OLá seu nome é " + nome);
        }

        // outra declaração para saber se seu nome possui espaços
        
        if(nome.contains(" ")){
            System.out.println("Seu nome contem espaços");
        }
        else {
            System.out.println("Seu nome não contem espaços");
        }

        /* ------------------------------------------------------------------------------------------------------------- */

        // para saber se existe dois Strings que são iguais

        String nome = "senha";

        if(nome.equals("senha")){
            System.out.println("Seu nome não pode ser uma senha!");
        } else {
            System.out.println("Olá " + nome);
        }

        /* ------------------------------------------------------------------------------------------------------------- */
    }
}
