/**
    Matheus Lázaro Honório da Silva - 19/06/2021

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
*/

public class AreSame {

    /**
     * Retornar true se todos os elementos de "b" são quadrados de elementos de "a"
     *
     * Ex:
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
     * @param a
     * @param b
     * @return
     */
    public static boolean comp(int[] a, int[] b){
        boolean search;

        if (a == null || b == null || a.length != b.length)
            return false;

        boolean[] c = new boolean[a.length];
        for (int i = 0; i < a.length;i++){
            c[i] = true;
        }

        for (int i = 0; i < a.length; i++) {
            search = false;
            for (int j = 0; j < b.length; j++) {
                if (c[j] && b[i] == a[j] * a[j]) {
                    search = true;
                    c[j] = false;
                    break;
                }
            }
            if (!search){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(
            AreSame.comp(
                new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361}
            )
        );
    }
}