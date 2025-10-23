
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

    }
}
