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