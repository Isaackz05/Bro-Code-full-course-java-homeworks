import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
        Como o metodo " substring " funciona:
        .substring() = é um metodo para extrair uma porção de um string
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        
        String email;
        String usuario;
        String dominio;

        email = scanner.nextLine();
        usuario = email.substring(0, email.indexOf("@"));  // começo
        dominio = email.substring(email.indexOf("@") + 1);  // fim

        // o "1" só vai retirar o simbolo anterior

        /*
            AVISO: de certa forma, você consegue determinar até onde certo char vai ser
        encaixado com a quantidade de números, porém, não é eficiente fazer isso por números,
        e sim colocar até qual caractere ele vai ser determinado, como por exemplo, existe
        muitos emails que vão além de uma quantidade antes do padrão do email (@gmail.com)

        */

        System.out.println(usuario);
        System.out.println(dominio);

        scanner.close();

    }
}
