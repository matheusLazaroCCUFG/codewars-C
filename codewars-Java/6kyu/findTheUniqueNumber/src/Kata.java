/**
    Matheus Lázaro Honório da Silva - 20/06/2021

    Problema: Find the unique number
        Instruções:
            Existe uma matriz com alguns números. Todos os números são iguais,
            exceto um. Tente encontrar!

            Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
            Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
            É garantido que a matriz contém pelo menos 3 números.

            Os testes contêm alguns arrays muito grandes, então pense no desempenho.

            Este é o primeiro kata da série:

            Encontre o número único (este kata)
            Encontre a string única
            Encontre o único
        Habilidades:
            FUNDAMENTALS, ALGORITHMS, NUMBERS, ARRAYS
 */

// Make sure your class is public
public class Kata {
    /**
     * Matriz com 3 ou mais números, todos iguais menos um.
     * Retornar o único diferente.
     *
     * @param arr
     * @return
     */
    public static double findUniq(double arr[]) {
        double differente = 0.0;

        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] == arr[i+1] && arr[i+2] != arr[i+1]){
                differente = arr[i+2];
                break;
            }else
            if(arr[i] == arr[i+2] && arr[i+1] != arr[i]){
                differente = arr[i+1];
                break;
            }else
            if(arr[i+1] == arr[i+2] && arr[i] != arr[i+1]){
                differente = arr[i];
                break;
            }
        }

        return differente;
    }


    public static void main(String[] args){
        System.out.println(Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
}