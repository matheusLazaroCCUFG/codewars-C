/**
    Matheus Lázaro Honório da Silva - 12/06/2021

    Contagem de vogais

        Retorna o número (contagem) de vogais na string fornecida.

        Vamos considerar a, e, i, o, ucomo vogais para este Kata (mas não y).

        A string de entrada consistirá apenas em letras minúsculas e / ou espaços.
*/
#include <stdio.h>
#include <stddef.h>

size_t get_count(const char *s);

int main(){
    printf("%d\n", get_count("abracadabra"));

    scanf("%*c");
    return 0;
}

size_t get_count(const char *s){
    int counter = 0;

    while(*s != '\0'){
        if( *s == 'a' ||
            *s == 'e' ||
            *s == 'i' ||
            *s == 'o' ||
            *s == 'u'
                ){

            counter++;
        }
        s++;
    }

    return counter;
}
