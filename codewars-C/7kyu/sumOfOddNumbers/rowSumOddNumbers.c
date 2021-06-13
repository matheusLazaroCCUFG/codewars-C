/**
    Matheus Lázaro Honório da Silva
    13/06/2021

    Descrição do problema:
            Dado o triângulo de números ímpares consecutivos:

                     1
                  3     5
               7     9    11
           13    15    17    19
        21    23    25    27    29
        ...
        Calcule a soma dos números na enésima linha deste triângulo
        (começando no índice 1), por exemplo:

        rowSumOddNumbers(1); // 1
        rowSumOddNumbers(2); // 3 + 5 = 8

    Habilidades
        FUNDAMENTALS, ARRAYS, LISTS, DATA STRUCTURES, NUMBERS, ARITHMETIC, MATHEMATICS,
        ALGORITHMS
*/

#include <inttypes.h>
#include <stdio.h>

uint64_t rowSumOddNumbers(uint32_t n);

int main(){
    printf("%lu\n", rowSumOddNumbers(1));// saida : 1
    printf("%lu\n", rowSumOddNumbers(2)); // saida: 8
    printf("%lu\n", rowSumOddNumbers(3));// saida: 74088
    printf("%lu\n", rowSumOddNumbers(509567));// saida: 74088

    scanf("%*c");
    return 0;
}

/**
 *           1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29

 x = 2n + 1
 x = 2*0 + 1 = 1 *
 x = 2*1 + 1 = 3 *
 x = 2*2 + 1 = 5
 x = 2*3 + 1 = 7 *
 x = 2*4 + 1 = 9
 x = 2*5 + 1 = 11
 x = 2*6 + 1 = 11 *
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 *
 * @param n
 * @return
 */
uint64_t rowSumOddNumbers(uint32_t n){
    uint64_t result = 0, i, j = 0, x = 0, inicio = 0;

    if(n == 1){
        return 1;
    }

    for(i = 0; i < n; i++){ //0 1 3 6 10
        j += x;
        inicio = 2*j + 1;
        x++;
    }

    for(j = inicio; j <= inicio + 2*n - 2; j+=2){
        result += j;
    }

    return result;
}