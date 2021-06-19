/**
    Matheus Lázaro Honório da Silva - 18/06/2021

    Problema: Find the odd int
        Instruções:
            Dado um array de inteiros, encontre aquele que aparece um número ímpar
            de vezes.

            Sempre haverá apenas um número inteiro que aparece um número ímpar
            de vezes.
        Habilidades:
            FUNDAMENTALS
 */

public class FindOdd {
    /**
     * Dado um array de inteiros retornar o número que aparece um número ímpar
     * de vezes.
     *
     * Sempre há apenas um número inteiro que aparece um número ímpar
     * de vezes.
     *
     * @param a
     * @return
     */
    public static int findIt(int[] a) {
        int[] amountOfTimes = new int[a.length];
        int result = 0;

        for(int i = 0; i < a.length; i++){
            amountOfTimes[i] = 0;
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    amountOfTimes[i]++;
                }
            }

            if(amountOfTimes[i]%2 != 0){
                result = a[i];
            }

        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }
}