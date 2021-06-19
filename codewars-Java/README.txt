#########################################################################################
############################## Matheus Lázaro Honório da Silva ##########################
#########################################################################################

KATA Codewars

7kyu ************************************************************************************
    Problema: Split Strings
         Instruções:
             Conclua a solução para que ela divida a string em pares de dois caracteres.
             Se a string contiver um número ímpar de caracteres, ela deverá substituir
             o segundo caractere ausente do par final por um sublinhado ('_').
         Exemplos:
             StringSplit.solution("abc") // should return {"ab", "c_"}
             StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
         Habilidades:
             ALGORITHMS, REGULAR EXPRESSIONS, DECLARATIVE PROGRAMMING,
             ADVANCED LANGUAGE FEATURES, FUNDAMENTALS, STRINGS

    Problema: Square Every Digit
        Instruções:
            Receber. Neste kata, você deve elevar ao quadrado cada dígito de um número e
            concatená-los.

            Por exemplo, se executarmos 9119 por meio da função, 811181 aparecerá, porque 9^2 é 81 e 1^2 é 1.

            Nota: a função aceita um inteiro e retorna um inteiro
        Habilidades:
            FUNDAMENTALS, MATHEMATICS, ALGORITHMS, NUMBERS

6kyu ************************************************************************************
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

    Problema: Split Strings
         Instruções:
             Conclua a solução para que ela divida a string em pares de dois caracteres.
             Se a string contiver um número ímpar de caracteres, ela deverá substituir
             o segundo caractere ausente do par final por um sublinhado ('_').
         Exemplos:
             StringSplit.solution("abc") // should return {"ab", "c_"}
             StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
         Habilidades:
             ALGORITHMS, REGULAR EXPRESSIONS, DECLARATIVE PROGRAMMING,
             ADVANCED LANGUAGE FEATURES, FUNDAMENTALS, STRINGS

    Problema: Consecutive strings
        Instruções:
            Você recebe uma matriz (lista) strarrde strings e um inteiro k. Sua tarefa é
            retornar a primeira string mais longa consistindo em k strings consecutivas
            obtidas no array.

        Exemplos:
            strarr = ["árvore", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

            Concatene as sequências consecutivas de strarr por 2, obtemos:

            treefoling (comprimento 10) concatenação de strarr [0] e strarr [1]
            folingtrashy ("12) concatenação de strarr [1] e strarr [2]
            trashyblue ("10) concatenação de strarr [2] e strarr [3]
            concatenação blueabcdef ("10) de strarr [3] e strarr [4]
            abcdefuvwxyz ("12) concatenação de strarr [4] e strarr [5]

            Duas strings são as mais longas: "folingtrashy" e "abcdefuvwxyz".
            O primeiro que veio é "folingtrashy", então
            longest_consec (strarr, 2) deve retornar "folingtrashy".

            Do mesmo jeito:
            longest_consec (["zona", "abigail", "theta", "forma", "libe", "zas", "theta", "abigail"], 2) -> "abigailtheta"
        Observação
            sequências consecutivas: seguem uma após a outra sem interrupção

        Habilidades:
            FUNDAMENTALS

    Problema: Find the odd int
            Instruções:
                Dado um array de inteiros, encontre aquele que aparece um número ímpar
                de vezes.

                Sempre haverá apenas um número inteiro que aparece um número ímpar
                de vezes.
            Habilidades:
                FUNDAMENTALS

    Problema: Are they the "same"?
            Instruções:
                Forneça dois arrays "a" e "b" escreva uma função comp(a, b)(ou compSame(a, b)) que
                verifique se os dois arrays têm os "mesmos" elementos, com as mesmas
                multiplicidades . "Mesmo" significa, aqui, que os elementos em "b" são os
                elementos ao "a" quadrado, independentemente da ordem.

            Exemplos
                Matrizes válidas
                a = [121, 144, 19, 161, 19, 144, 19, 11]
                b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
                comp(a, b)retorna verdadeiro porque em b121 é o quadrado de 11, 14641 é o
                quadrado de 121, 20736 é o quadrado de 144, 361 é o quadrado de 19, 25921
                é o quadrado de 161 e assim por diante. Fica óbvio se escrevermos bos
                elementos de em termos de quadrados:

                a = [121, 144, 19, 161, 19, 144, 19, 11]
                b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
                Matrizes inválidas
                Se, por exemplo, mudarmos o primeiro número para outra coisa, comppode não
                retornar mais verdadeiro:

                a = [121, 144, 19, 161, 19, 144, 19, 11]
                b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
                comp(a,b)retorna falso porque em b132 não é o quadrado de nenhum número de a.

                a = [121, 144, 19, 161, 19, 144, 19, 11]
                b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
                comp(a,b)retorna falso porque em b36100 não é o quadrado de nenhum número de a.

            Observações
                "a" ou "b" pode ser [] or {}(todos os idiomas, exceto R, Shell).
                "a" ou "b" pode ser nil ou null ou None ou nothing(exceto em C ++, Elixir, Haskell, PureScript, Pascal, R, Rust, Shell).
                Se "a" ou "b" for nil(ou nullou None, dependendo do idioma), o problema não faz sentido, então retorne falso.

            Nota para C
                As duas matrizes têm o mesmo tamanho (> 0) fornecido como parâmetro na função comp.

            Habilidades:
                FUNDAMENTALS