/**
    Matheus Lázaro Honório da Silva - 15/06/2021

    Problema: Multiples of 3 or 5
    Instruções:
        Se listarmos todos os números naturais abaixo de 10 que são múltiplos de 3 ou 5,
        obteremos 3, 5, 6 e 9. A soma desses múltiplos é 23.

        Conclua a solução de forma que ela retorne a soma de todos os múltiplos de 3 ou
        5 abaixo do número passado.

        Nota: Se o número é um múltiplo de ambos 3 e 5, só contam-lo uma vez .
        Além disso, se um número for negativo, retorne 0 (para idiomas que os possuem)

        Cortesia de projecteuler.net
    Habilidades:
        ALGORITHMS, MATHEMATICS, NUMBERS
 */

public class Solution {
    /**
     * Retorna a soma de todos os múltiplos de 3 ou 5, abaixo de "number"
     * Se o número é múltiplo de ambos, 3 e 5, conta apenas uma vez
     * Se o número é negativo, retorna 0
     * @param number
     * @return
     */
    public int solution(int number) {
        int sum = 0;

        if(number < 0){
            return 0;
        }else{
            for(int i = 1; i < number; i++){
                if(i%3 == 0 || i%5 == 0){
                    sum += i;
                }
            }
        }

        return sum;
    }
}

