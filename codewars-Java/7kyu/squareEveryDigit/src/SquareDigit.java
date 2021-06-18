/**
    Matheus Lázaro Honório da Silva - 18/06/2021

    Problema: Square Every Digit
    Instruções:
        Receber. Neste kata, você deve elevar ao quadrado cada dígito de um número e
        concatená-los.

        Por exemplo, se executarmos 9119 por meio da função, 811181 aparecerá, porque 9^2 é 81 e 1^2 é 1.

        Nota: a função aceita um inteiro e retorna um inteiro
    Habilidades:
        FUNDAMENTALS, MATHEMATICS, ALGORITHMS, NUMBERS
 */

public class SquareDigit {

    /**
     * Elevar ao quadrado cada dígito e concatenar os resultados
     * Ex: 9119 = (9^2) + (1^2) + (1^2) + (9^2) = 811181
     * @param n
     * @return
     */
    public int squareDigits(int n) {
        String aux = Integer.toString(n);
        char[] auxChar = aux.toCharArray();
        String strConcat = "";

        for(int i = 0; i < aux.length(); i++){
            strConcat = strConcat.concat(String.valueOf((int)Math.pow(Character.getNumericValue(auxChar[i]), 2)));
        }

        return Integer.parseInt(strConcat);
    }


    public static void main(String[] args){
        SquareDigit squareDigit = new SquareDigit();

        System.out.println(squareDigit.squareDigits(9119));
    }

}