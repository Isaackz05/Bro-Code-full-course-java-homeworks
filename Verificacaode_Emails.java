import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email: ");

        String email;
        String usuario;
        String dominio;

        email = scanner.nextLine();
        
        /*
            "contains" serve para ver caso tenha aquilo presente na hora
            do input digitado
        */

        if (email.contains("@")){
            usuario = email.substring(0, email.indexOf("@"));  // começo
            dominio = email.substring(email.indexOf("@") + 1);  // fim

            System.out.println(usuario);
            System.out.println(dominio);
        }
        else {
            System.out.println("Emails precisam ter @");
        }

        scanner.close();

    }
}
