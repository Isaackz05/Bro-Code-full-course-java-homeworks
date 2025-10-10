import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // if statement = Aparece um bloco de código caso a condição seja verdadeira

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Coloque seu nome: ");
        name = scanner.nextLine();

        System.out.print("Coloque sua idade: ");
        age = scanner.nextInt();

        System.out.print("Você é um estudante? (true/false): ");
        isStudent = scanner.nextBoolean();

        GRUPO I1

        //vamos checar se a nossa variavel "nome" está vazia, neste caso ao em vez de usar " (name = '') " você usa " (name.isEmpty) " para caso o espaço esteja realmente vazio.
        if(name.isEmpty()){
            System.out.println("Você não colocou seu nome! ☹️");
        }
        else{
            System.out.println("Olá, " + name + "! 😊");
        }

        GRUPO II2
        
        if(age >= 65){
            System.out.println("Você é um senhor! 🧓");
        }
        //se for maior que 18
        else if(age >= 18){
            System.out.println("Você é um adulto! 🧑‍🦰");
        }
        //se você não tem idade ainda
        else if(age < 0){
            System.out.println("Você não nasceu ainda! 🤰");
        }
        //sinal "=" duplo é para comparação
        //e também caso você tenha meses ou equivalente caso você não tenha tinha tido tantos anos
        else if(age == 0){
            System.out.println("Você é um bebê! 👶");
        }
        //se você é menor que 18
        else{
            System.out.println("Você é uma criança! 🧒");
        }
        // else funciona como código padrão, caso nenhuma das condições acima, ele segue o padrão dado do else

        /*
        Você tem que saber aonde você colocar seus if, else e else if

        if: é caso uma condição seja verdadeira, ele executa, caso ao contrário, ele não executa.
        else if: são condições que serão checadas.
        else: é um código padrão caso as condições acima não consigam ser atendidas.
        temos todos esses 3, mas vai depender das condições
        */

        GRUPO III3

        if(isStudent){
            System.out.println("Você é um estudante! 👨‍🏫👨‍🎓");
        }
        else {
            System.out.println("Você não é um estudante! 🏢");
        }

        scanner.close();
    }
}
