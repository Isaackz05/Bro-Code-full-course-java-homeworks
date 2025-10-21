public class main {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double resultado;

        /* ------------------------------------------------------------------------------------------------------------- */

        // POTÊNCIA

        resultado = Math.pow(2, 5);
        /*
        esse metodo e para saber a potencia de ambos os numeros
        tipo 2³ (dois ao cubo)
        */

        /* ------------------------------------------------------------------------------------------------------------- */

        // VALOR ABSOLUTO

        resultado = Math.abs(-5);
        /*
        metodo para numero absoluto
        basicamente transforma os numeros no seu oposto
        em outras palavras ele mede a distancia deste numero até o zero
        ( -5 ----- 0 ----- 5 )  <<-- tipo isso
        se o numero ja for positivo ele não muda nada, continua o mesmo
        */

        /* ------------------------------------------------------------------------------------------------------------- */

        // RAIZ QUADRADA

        resultado = Math.sqrt(9);
        // metodo para mostrar a raiz quadrada de um numero

        /* ------------------------------------------------------------------------------------------------------------- */

        // ARRENDONDAR

        resultado  = Math.round(3.15);
        /*
        arredonda o numero, se a ultima casa do número for menor que 5, ela vira um 0.
        se for maior que 5, ela se transforma em um numero maior

        exemplo:
        15 vira 20
        14 vira 10
        */

        /* ------------------------------------------------------------------------------------------------------------- */

        // ARRENDONDAR PARA CIMA

        resultado = Math.ceil(3.12);
        //  arredonda o número para CIMA (para o proximo número inteiro maior)
        //  ceil vem de "ceiling" que significa "teto" em ingles

        /* ------------------------------------------------------------------------------------------------------------- */

        // ARRENDONDAR PARA BAIXO

        resultado = Math.floor(3.99);
        // faz a mesma coisa que o ceil só que arredonda para baixo (para o número anterior)
        // floor significa "chão" em ingles

        /* ------------------------------------------------------------------------------------------------------------- */

        // ACHAR O MAIOR E/OU MENOR VALOR

        resultado = Math.max(10, 20);
        resultado = Math.min(10, 20);
        // vão achar o máximo e o mínimo entre os valores X e Y.

        System.out.println(resultado);

        /* ------------------------------------------------------------------------------------------------------------- */
    }
}
