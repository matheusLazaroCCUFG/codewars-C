import java.util.*;
import java.util.stream.IntStream;

/**
    Matheus Lázaro Honório da Silva - 202/06/2021

    Problema: Delete occurrences of an element if it occurs more than n times
        Instruções:
            Já é suficiente!
                Alice e Bob estavam de férias. Os dois tiraram muitas fotos dos lugares
                que estiveram e agora querem mostrar a Charlie toda a coleção.
                No entanto, Charlie não gosta dessas sessões, já que o motivo costuma se
                repetir. Ele não gosta de ver a Torre Eiffel 40 vezes. Ele diz a eles que
                só se sentará durante a sessão se eles mostrarem o mesmo motivo no máximo
                N vezes. Felizmente, Alice e Bob são capazes de codificar o motivo como
                um número. Você pode ajudá-los a remover números de forma que sua lista
                contenha cada número apenas até N vezes, sem alterar a ordem?

            Tarefa
                Dada uma lista lst e um número N, crie uma nova lista que contenha cada
                número de lst no máximo N vezes sem reordenar. Por exemplo, se N = 2, e
                a entrada é [1,2,3,1,2,1,2,3], você pega [1,2,3,1,2], elimina o próximo
                [1,2 ], pois isso levaria a 1 e 2 no resultado 3 vezes e, em seguida, a
                3, o que leva a [1,2,3,1,2,3].

        Exemplo
            EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
            EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
        Habilidades:
            FUNDAMENTALS, LISTS, DATA STRUCTURES
 */

public class EnoughIsEnough {
    /**
     *
     * @param elements
     * @param maxOccurrences
     * @return
     */
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> intList = new ArrayList<>();
        int occurrenceCounter;
        int[] aux;

        if(elements.length == 0){
            return elements;
        }

        if(maxOccurrences == 0){
            return new int[0];
        }

        for (int i = 0; i < elements.length; i++) {
            intList.add(elements[i]);
        }

        for (int i = 0; i < intList.size(); i++) {
            occurrenceCounter = 0;

            for (int j = 0; j < intList.size(); j++) {
                if (intList.get(i).equals(intList.get(j))) {
                    occurrenceCounter++;

                    if (occurrenceCounter > maxOccurrences) {
                        intList.remove(j);
                    }
                }
            }
        }
        aux = new int[intList.size()];
        for(int i = 0; i < intList.size(); i++){
            aux[i] = intList.get(i);
        }

        return aux;
    }

    /**
     * Outras soluções
     */
    public static int[] deleteNth2(int[] elements, int max) {

        if (max < 1) return new int[0];

        final HashMap<Integer,Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < max) list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }

    public static int[] deleteNth3(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        return IntStream.of(elements)
                .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    public static int[] deleteNth4(int[] elements, int maxOcurrences) {
        Map<Integer, Integer> counts = new HashMap<>();
        int dest = 0;
        for (int val : elements) {
            int qty = counts.getOrDefault(val, 0);
            if (++qty <= maxOcurrences) {
                elements[dest++] = val;
            }
            counts.put(val, qty);
        }
        return Arrays.copyOfRange(elements, 0, dest);
    }

    public static int[] deleteNth5(int[] elements, int maxOcurrences) {
        //Code here ;)
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(i -> {
                    map.merge(i, 1, Integer::sum);
                    return map.get(i) <= maxOcurrences;
                })
                .toArray();
    }

    public static int[] deleteNth6(int[] elements, int maxOccurrences) {
        java.util.List<Integer> list = new java.util.ArrayList<>();

        for (int element : elements) {
            int count = (int) list.stream()
                    .filter(i -> i == element)
                    .count();
            if (count < maxOccurrences) {
                list.add(element);
            }
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] deleteNth7(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    public static int[] deleteNth8(int[] elements, int maxOcurrences) {
        Map<Integer, Integer> countMap = new HashMap<>();
        return Arrays.stream(elements)
                .peek(element -> countMap.compute(element, (k, v) -> v == null ? 1 : v + 1))
                .filter(element -> countMap.get(element) <= maxOcurrences)
                .toArray();
    }

    public static int[] deleteNth9(int[] elements, int maxOccurrences) {
        return IntStream.range(0, elements.length)
                .mapToObj(i -> Collections.frequency(Arrays.stream(elements).limit(i).boxed().collect(Collectors.toList()), elements[i]) < maxOccurrences ? elements[i] : null)
                .filter(Objects::nonNull).mapToInt(i -> i)
                .toArray();
    }

    public static int[] deleteNth10(int[] elements, int maxOcurrences) {
        if (elements == null || elements.length == 0) return new int[0];

        Map<Integer, Integer> numberCount = new HashMap<>();
        List<Integer> filteredList = new ArrayList<>();

        for (Integer aNumber : elements) {
            if (numberCount.containsKey(aNumber)) {
                numberCount.put(aNumber, numberCount.get(aNumber)+1);
            } else {
                numberCount.put(aNumber, 1);
            }

            if (numberCount.get(aNumber) <= maxOcurrences) {
                filteredList.add(aNumber);
            }
        }

        return filteredList.stream().mapToInt(Integer::valueOf).toArray();
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )));
    }

}