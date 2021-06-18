import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
    Matheus Lázaro Honório da Silva - 17/06/2021

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
 */

class LongestConsec {
    /**
     * retornar a primeira string mais longa consistindo em k strings consecutivas
     * obtidas no array.
     *
     * Exemplo:
     *      strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
     *
     *      Concatene as sequências consecutivas de strarr por 2, obtemos:
     *
     *      treefoling (comprimento 10) concatenação de strarr [0] e strarr [1]
     *      folingtrashy ("12) concatenação de strarr [1] e strarr [2]
     *      trashyblue ("10) concatenação de strarr [2] e strarr [3]
     *      concatenação blueabcdef ("10) de strarr [3] e strarr [4]
     *      abcdefuvwxyz ("12) concatenação de strarr [4] e strarr [5]
     *
     *      Duas strings são as mais longas: "folingtrashy" e "abcdefuvwxyz".
     *      O primeiro que veio é "folingtrashy", então
     *      longest_consec (strarr, 2) deve retornar "folingtrashy".
     *
     * @param strarr
     * @param k
     * @return
     */
    public static String longestConsec(String[] strarr, int k){
        String consec = "";
        String maxConsec = "";
        int maxLength = 0;
        boolean stop = false;

        if(k > strarr.length || k <= 0){
            return "";
        }

        for(int i = 0; i < strarr.length; i++){
            consec = "";
            for(int j = 0; j < k; j++){
                if(i + j >= strarr.length){
                    stop = true;
                    break;
                }

                consec = consec.concat(strarr[i + j]);
            }

            if(stop){
                break;
            }else
            if(consec.length() > maxLength){
                maxLength = consec.length();
                maxConsec = consec;
            }
        }
        return maxConsec;
    }

    /**
     * Outras soluções
     */
    public static String longestConsec2(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }

    public static String longestConsec3(String[] strarr, int k) {
        if (k <= 0) {
            return "";
        }

        return IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static String longestConsec4(String[] strarr, int k) {

        if(k < 1 || strarr.length < k || strarr.length == 0){
            return "";
        }

        int startIndex = 0;
        int max = strarr[0].length();
        int sum = 0;

        for(int i = 0; i < strarr.length; i++){
            sum += strarr[i].length();

            if(i > k - 1){
                sum -= strarr[i - k].length();
            }

            if(sum > max){
                max = sum;
                startIndex = i - k + 1;
            }
        }

        String result = "";
        for (int i = startIndex; i < startIndex + k; i++){
            result += strarr[i];
        }
        return result;
    }

    public static String longestConsec5(String[] strarr, int k) {
        String maxStr = "";
        for (int i=0; i<=strarr.length-k; i++) {
            String current = Arrays.stream(strarr, i, i + k).collect(Collectors.joining());
            if (current.length() > maxStr.length()) maxStr = current;
        }
        return maxStr;
    }

    public static String longestConsec6(String[] strarr, int k) {
        String longest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder candidate = new StringBuilder();
            for (int j = 0; j < k; j++) {
                candidate.append(strarr[i + j]);
            }
            if (candidate.length() > longest.length()) {
                longest = candidate.toString();
            }
        }
        return longest;
    }

    public static String longestConsec7(String[] strarr, int k) {
        String ans = "", test = "";
        if (k > 0) {
            for (int i = 0 ; i < strarr.length+1-k ; i++) {
                test = String.join("", Arrays.copyOfRange(strarr, i, i+k));
                ans = ans.length() < test.length() ? test : ans;
            }
        }
        return ans;
    }

    public static String longestConsec8(String[] strArr, int k) {
        return (k > 0 && strArr.length > 0 && k <= strArr.length) ?
                IntStream.rangeClosed(0, strArr.length - k)
                        .mapToObj(i -> IntStream.range(0, k).mapToObj(j -> strArr[i + j]).collect(Collectors.joining()))
                        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                        .findFirst().get()
                : "";
    }

    public static String longestConsec9(String[] strarr, int k) {
        // your code

        int maxSum = 0;
        int start = 0;
        int end = 0;
        String text = "";

        if(!(strarr.length == 0 || k >strarr.length || k<= 0 ) )
        {

            for(int i = 0; i<=strarr.length-k; i++){
                int sum = 0;

                for(int j = i; j< i+k; j++){

                    sum += strarr[j].length();
                }

                if(sum > maxSum)
                {
                    maxSum = sum;
                    start = i;
                    end = i+k;
                }

            }


            for(int c = start; c<end; c++){
                text += strarr[c];
            }
        }

        return text;
    }

    public static String longestConsec10(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }
        StringBuilder maxWord = new StringBuilder();
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder currentWord = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                currentWord.append(strarr[j]);
            }
            if (maxWord.length() < currentWord.length()) {
                maxWord = currentWord;
            }
        }

        return maxWord.toString();
    }

    public static void main(String[] args){
        String[] aux = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;
        System.out.println(LongestConsec.longestConsec(aux, k));
    }
}