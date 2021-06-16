/**
    Matheus Lázaro Honório da Silva - 16/06/2021

    Problema: Jasen Casing String
        Instruções:
            Jaden Smith, filho de Will Smith, é a estrela de filmes como The Karate Kid
            (2010) e After Earth (2013). Jaden também é conhecido por algumas de suas
            filosofias que entrega via Twitter . Ao escrever no Twitter, ele é
            conhecido por quase sempre colocar cada palavra em maiúscula.
            Para simplificar, você terá que colocar cada palavra em maiúscula,
            verifique como as contrações devem ser no exemplo abaixo.

            Sua tarefa é converter strings para a forma como seriam escritas por Jaden
            Smith. As strings são citações reais de Jaden Smith, mas não são maiúsculas
            da mesma forma que ele as digitou originalmente.

        Exemplo:

            Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
            Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

            Observe que a versão Java espera um valor de retorno nulo para uma
            string vazia ou nula.

        Habilidades:
            FUNDAMENTALS, STRINGS, ARRAYS
*/

public class JadenCase {
    /**
     *
     * @param phrase
     * @return
     */
    public String toJadenCase(String phrase){
        if(phrase != null && !phrase.isEmpty()){
            char[] aux = phrase.toCharArray();

            aux[0] = Character.toUpperCase(aux[0]);
            for(int i = 0; i < phrase.length(); i++){
                if(aux[i] == ' '){
                    aux[i+1] = Character.toUpperCase(aux[i+1]);
                }
            }
            phrase = String.valueOf(aux);
            return phrase;
        }else{
            return null;
        }
    }


}