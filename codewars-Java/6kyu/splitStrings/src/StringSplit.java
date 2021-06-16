import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
     Matheus Lázaro Honório da Silva - 15/06/2021

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

 */

public class StringSplit {
    /**
     * Dividir a string "s" em partes de 2 caracteres
     * Se a string contiver número ímpar de caracteres, colocar "_" no segundo caractere
     * @param s
     * @return
     */
    public static String[] solution(String s) {
        String[] aux;

        if(s.length() % 2 == 0){
            aux =  s.split("(?<=\\G.{2})");
        }else{
            s = s + "_";
            aux =  s.split("(?<=\\G.{2})");
            //aux[s.length()/2] = String.valueOf(s.substring(s.length()-1).concat("_"));
        }

        return aux;
    }

    /*
        Outras soluções:
     */
    public static String[] solution2(String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
    public static String[] solution3(String s) {
        //Write your code here
        if(s.length()%2==1) s+="_";
        int n=s.length()/2;


        String[] sub=new String[n];
        for(int i=0;i<n;++i)
            sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);

        return sub;
    }
    static String[] solution4(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }
    public static String[] solution5(String s) {
        List<String> result = new ArrayList<String>();
        if(s.length() %2 == 1){
            s = s+"_";
        }
        for(int i=0;i<s.length() - 1;i+=2){
            result.add(s.substring(i, i+2));
        }
        return result.toArray( new String[0] );
    }
    public static String[] solution6(String s) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            builder.append(ch);
            if (builder.length() == 2) {
                list.add(builder.toString());
                builder.setLength(0);
            }
        }
        if (builder.length() == 1) {
            builder.append('_');
            list.add(builder.toString());
        }

        return list.toArray(new String[0]);
    }
    public static String[] solution7(String s) {
        //Write your code here

        if(s.length() % 2 == 0)   return s.split("(?<=\\G..)") ;
        else {
            String[] result = new String[s.length() + 1 ] ;
            result = s.split("(?<=\\G..)") ;
            result[result.length - 1 ] = result[result.length-1]+"_" ;
            return result;
        }

    }
    public static String[] solution8(String s){
        String[] result = new String [s.length()%2==0? s.length()/2:(s.length()+1)/2];
        if(s.length() == 0) {return result;}
        try {
            for(int i = 0, j = 0; i < result.length; i++,j+=2) {
                result[i] = (s.charAt(j)+""+s.charAt(j+1));
                if(i == result.length-1) {return result;}
            }
        }catch(Exception e) {}
        result[result.length-1] = (s.charAt(s.length()-1)+"_");

        return result;
    }
    public static String[] solution9(String s) {
        String[] arr = s.split("(?<=\\G.{2})");

        if(s.length()%2 == 1)
            arr[arr.length-1] += "_";

        return arr;
    }
    public static String[] solution10(String s) {
        //regular expression for every 3 char
        String [] truc = s.split("(?<=\\G..)");
        //if the size of the string is an odd number, add "_" at the end
        if(s.length() %2 !=0) {
            truc [truc.length-1] += "_";
        }
        return truc;
    }


    public static void main(String[] args){
        System.out.println(StringSplit.solution("abcdef"));
    }
}
