public class Main {
    public static void main(String[] args){

        boolean Estudante = true;
        boolean Formando = true;
        double preco = 9.99;

        if(Estudante){
            if(Formando){
                System.out.println("Você ganha um desconto de formando de 20%");
                System.out.println("Você ganha um desconto de estudante de 10%");
                preco *= 0.7;
            }
            System.out.println("Você ganha um desconto de estudante de 10%");
            preco *= 0.9;
        }
        else {
            if(Formando){
                System.out.println("Você ganha um desconto de formando de 20%");
                preco *= 0.8;
            }
            else {
                preco *= 1;
            }
        }

        System.out.printf("O preço de um ingresso é: R$%.2f", preco);
    }
}


/*
Basicamente ta mostrando neste código que da para usar if's e else's dentro de outros if's e else's
*/
