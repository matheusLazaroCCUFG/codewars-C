/**
    Matheus Lázaro Honório da Silva - 20/06/2021

    Problema: Take a Ten Minute Walk
        Instruções:
            Você mora na cidade de Cartesia, onde todas as estradas estão dispostas em
            uma grade perfeita. Você chegou dez minutos mais cedo para um compromisso,
            então decidiu aproveitar a oportunidade para fazer uma curta caminhada.
            A cidade oferece aos seus cidadãos um aplicativo gerador de caminhada em
            seus telefones - toda vez que você pressiona o botão, ele envia uma série
            de strings de uma letra que representam direções para caminhar
            (por exemplo, ['n', 's', 'w', 'e']). Você sempre anda apenas um único
            quarteirão para cada letra (direção) e sabe que leva um minuto para
            atravessar um quarteirão da cidade, então crie uma função que retornará
            verdadeiro se a caminhada que o aplicativo oferece levar exatamente dez
            minutos (você não queira chegar cedo ou tarde!) e, é claro, o levará de
            volta ao ponto de partida. Caso contrário, retorne falso .

            Nota : você sempre receberá um array válido contendo uma variedade aleatória
            de letras de direção ('n', 's', 'e' ou 'w' apenas). Nunca lhe dará um array
            vazio (isso não é uma caminhada, é ficar parado!).

        Habilidades:
            FUNDAMENTALS, ARRAYS

 */

public class TenMinWalk {
    /**
     *
     * @param walk
     * @return
     */
    public static boolean isValid(char[] walk) {
        boolean result = false;
        int w = 0, e = 0, s = 0, n = 0;
        if(walk.length != 10){
            return false;
        }else{
           for(int i = 0; i < walk.length; i++){
               if(walk[i] == 'w'){
                   w++;
               }else
               if(walk[i] == 'e'){
                   e++;
               }else
               if(walk[i] == 's'){
                   s++;
               }else
               if(walk[i] == 'n'){
                   n++;
               }
           }
        }

        if(w != e || s != n){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}