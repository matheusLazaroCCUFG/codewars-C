/**
    Matheus Lázaro Honório da Silva - 12/06/2021

    Descrição do problema:
        Sua tarefa é escrever uma função que retorne a soma das séries seguintes até o enésimo termo (parâmetro).

        Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
        Regras:
        Você precisa arredondar a resposta para 2 casas decimais e retorná-la como String.

        Se o valor fornecido for 0, ele deve retornar 0,00

        Você receberá apenas números naturais como argumentos.

        Exemplos:
        SeriesSum(1) => 1 = "1.00"
        SeriesSum(2) => 1 + 1/4 = "1.25"
        SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
        NOTA : No PHP, a função é chamada series_sum().

    Habilidades:
        FUNDAMENTALS, LOOPS, CONTROL FLOW, BASIC LANGUAGE FEATURES, ARITHMETIC, MATHEMATICS,
        ALGORITHMS, NUMBERS, SEQUENCES, ARRAYS

*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *series_sum(const size_t n);

int main(){
    char *received = series_sum(1);// retorna 1
    printf("%s\n", received);

    received = series_sum(2); // retorna 1.25
    printf("%s\n", received);

    received = series_sum(3); // retorna 1.25
    printf("%s\n", received);

    scanf("%*c%*c");
    return 0;
}

/**
 *  Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 *  Retornar o "n-ésimo" termo da série
 *  Arredondar a resposta para 2 casas decimais
 *  Retornar como String.
 *  n = 0, retornar 0.00
 *  n = número natural
 * @param n
 * @return
 */
char *series_sum(const size_t n) {
    double serie = 0.00, x = 1.00;
    char* buffer = calloc(16, sizeof(char));

    for (int i = 0; i < n; i++) {
        serie += (1.00/x);
        x += (double) 3;
    }

    sprintf(buffer,"%.2f", serie);

    return buffer;
}
