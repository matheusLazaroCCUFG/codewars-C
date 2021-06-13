#########################################################################################
############################## Matheus Lázaro Honório da Silva ##########################
#########################################################################################

7 kyu ***********************************************************************************
        12/06/2021
        Contagem de vogais
            Descrição do problema:
                Retorna o número (contagem) de vogais na string fornecida.

                Vamos considerar a, e, i, o, ucomo vogais para este Kata (mas não y).

                A string de entrada consistirá apenas em letras minúsculas e / ou espaços.
            Habilidades:
                FUNDAMENTALS, STRINGS, UTILITIES

        Crescimento de uma População
                Descrição do problema:
                    Em uma pequena cidade, a população é p0 = 1000 no início do ano.
                    A população aumenta regularmente em 2 por cento ao ano e, além disso,
                    50 novos habitantes por ano vêm morar na cidade. Quantos anos a
                    cidade precisa para ver sua população maior ou igual a
                    p = 1200 habitantes?

                    No final do primeiro ano, haverá:
                    1000 + 1000 * 0,02 + 50 => 1070 habitantes

                    No final do 2º ano, haverá:
                    1070 + 1070 * 0,02 + 50 => 1141 habitantes
                    (** o número de habitantes é um inteiro **)

                    No final do 3º ano, haverá:
                    1141 + 1141 * 0,02 + 50 => 1213

                    Serão necessários 3 anos inteiros.
                    Parâmetros dados de forma mais geral:

                    p0, por cento, aug (habitantes entrando ou saindo a cada ano),
                    p (população a ser superada)

                    a função nb_ano deve retornar n número de anos inteiros necessários
                    para obter uma população maior ou igual a p.

                    aug é um número inteiro, porcentagem um número flutuante positivo
                    ou nulo, p0 e p são inteiros positivos (> 0)

                    Exemplos:
                    nb_ano (1500, 5, 100, 5000) -> 15
                    nb_ano (1500000, 2,5, 10000, 2000000) -> 10
                    Observação:
                    Não se esqueça de converter o parâmetro de porcentagem em porcentagem
                    no corpo de sua função:
                    se o parâmetro de porcentagem for 2, você deve convertê-lo para 0,02.
                Habilidades:
                    FUNDAMENTALS

        13/06/2021

        Soma de números ímpares
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

Instruções git **************************************************************************
git init
git add README.md
git commit -m "first commit"
git branch -M main

git remote add origin https://github.com/matheusLazaroCCUFG/codewars-KATA.git
ou
git remote set-url origin https://github.com/matheuslazaroCCUFG/codewars-KATA.git

git push -u origin main

git add README.txt codewars-C
git commit
git push
https://github.com/matheusLazaroCCUFG/codewars-KATA.git
Erros:
git pull