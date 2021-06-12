/**fasdfasdfa
    Matheus Lázaro Honório da Silva - 12/06/2021

    Crescimento de uma População

        Em uma pequena cidade, a população é p0 = 1000 no início do ano. A população aumenta regularmente em 2 por
        cento ao ano e, além disso, 50 novos habitantes por ano vêm morar na cidade. Quantos anos a cidade precisa para
        ver sua população maior ou igual a p = 1200 habitantes?

        No final do primeiro ano, haverá:
        1000 + 1000 * 0,02 + 50 => 1070 habitantes

        No final do 2º ano, haverá:
        1070 + 1070 * 0,02 + 50 => 1141 habitantes (** o número de habitantes é um inteiro **)

        No final do 3º ano, haverá:
        1141 + 1141 * 0,02 + 50 => 1213

        Serão necessários 3 anos inteiros.
        Parâmetros dados de forma mais geral:

        p0, por cento, aug (habitantes entrando ou saindo a cada ano), p (população a ser superada)

        a função nb_ano deve retornar n número de anos inteiros necessários para obter uma população maior ou igual a p.

        aug é um número inteiro, porcentagem um número flutuante positivo ou nulo, p0 e p são inteiros positivos (> 0)

        Exemplos:
        nb_ano (1500, 5, 100, 5000) -> 15
        nb_ano (1500000, 2,5, 10000, 2000000) -> 10
        Observação:
        Não se esqueça de converter o parâmetro de porcentagem em porcentagem no corpo de sua função: se o parâmetro de
        porcentagem for 2, você deve convertê-lo para 0,02.

        FUNDAMENTOS
*/
#include <stdio.h>

int nbYear(int p0, double percent, int aug, int p);

int main(){
    printf("%d\n", nbYear(1500, 5, 100, 5000));//15
    printf("%d\n", nbYear(1500000, 2.5, 10000, 2000000));//10
    printf("%d\n", nbYear(1500000, 0.25, 1000, 2000000));//94

    scanf("%*c");
    return 0;
}

/**
 * p0 = 1000
 * percent = 0.02
 * aug = 50 novos habitantes por ano
 * p = 1200 habitantes
 *
    No final do primeiro ano, haverá:
    1000 + 1000 * 0,02 + 50 => 1070 habitantes

    No final do 2º ano, haverá:
    1070 + 1070 * 0,02 + 50 => 1141 habitantes (** o número de habitantes é um inteiro **)

    No final do 3º ano, haverá:
    1141 + 1141 * 0,02 + 50 => 1213

    nb_ano (1500, 5, 100, 5000) -> 15
    nb_ano (1500000, 2,5, 10000, 2000000) -> 10

    p0 + p0 * percent + aug >= p


 * @param p0
 * @param percent
 * @param aug
 * @param p
 * @return
 */
int nbYear(int p0, double percent, int aug, int p) {
    // anos para p0 + p0 * percent + aug >= p
    int counter = 0, result = 0;

    percent /= 100;
    while(result < p){
        result = (int)(p0 + (int)(p0 * percent) + aug);
        p0 = result;
        counter++;
    }

    return counter;
}

