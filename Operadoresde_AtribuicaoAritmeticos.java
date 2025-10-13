import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Operadores de Atribuição Aritméticos

        int x = 10;
        int y = 3;


        x = x + y;
        x = x - y;
        x = x * y;
        x = x / y;
        x = x % y;

        System.out.println(x);

         // Ou você pode estar usando de forma mais curta como:

        x -= y;
        x += y;
        x *= y;
        x /= y;  (atenção1)
        x %= y;

         // O operador "/" apenas mostra o Quociente (o resultado da divisão):

        X / Y = Z, 0
         // Dividendo ÷ Divisor = Quociente (Resto: O que sobrou da divisão)


        /* (atenção1)
        - Um detalhe, quando você esta mexendo com números inteiros(int)
        ele não vai armazenar a forma de Resto(x/x = >resto<) na divisão
        até porque o resto não vai ser inteiro, e sim em forma decimal,
        então preste atenção quando for trabalhar divisão com tipo primitivo
        de dado "/", caso você use o tipo de dado primitivo em double, ele vai
        retornar porções decimais, então tome cuidado.
        */

        // Operadores de Incremento e Decremento:
        

        int x = 1;

        x++;
        //ou
        x--;

        System.out.println(x);

        /*
            no terminal vai aparecer 4, porque o valor de x é 1, e assim o operador "x++"
        vai aumentar ou diminuir o valor dele.

        Ordem das operações P-E-M-D-A-S ou
        (Please Excuse My Damn Ass Swag):
        
        P - Parentheses: Parênteses
        E - Exponents: Expoentes/Potências
        M - Multiplication: Multiplicação
        D - Division: Divisão
        A - Addition: Adição
        S - Subtraction: Subtração
        
        na tradução em Português poderia ser: PPEMDAS ou PPEMDSA
        */
        
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
