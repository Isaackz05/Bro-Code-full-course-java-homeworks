
public class Main {
    public static void main(String[] args){

        /*
        Como o metodo " substring " funciona:
        .substring() = é um metodo para extrair uma porção de um string
         */

        String email = "isaack04@gmail.com";
        String usuario = email.substring(0, 8);
        String domain = email.substring(9);

        System.out.println(domain);

        /* 
            Esses dois métodos funcionam, porém, não são eficazes em determinar a posição 
        correta dos caracteres dentro do email e o formato do email.

        Por isso, nós usamos " index.Of(" (letra/caractere) ")) "
        */

        String email = "isaack04@gmail.com";
        String usuario = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        
    }
}
