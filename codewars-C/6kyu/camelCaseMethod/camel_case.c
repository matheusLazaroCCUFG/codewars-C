/**
    Matheus Lázaro Honório da Silva

    CamelCase Method
    Instruções:
        Escreva o método .camelCase simples ( camel_case função em PHP, CamelCase em C# ou
        camelCaseem Java) para strings. Todas as palavras devem ter a primeira letra
        maiúscula sem espaços.

        Por exemplo:

        camel_case("hello case");      // => "HelloCase"
        camel_case("camel case word"); // => "CamelCaseWord"
        Não se esqueça de avaliar este kata! Obrigado :)
    Habilidades:
        ALGORITHMS, FUNDAMENTALS, STRINGS
*/
#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

char *camel_case(const char *s);

int main(){
    char *s;

    s = camel_case("hd ou qjzd qgibi o zdlp zvn qd"); //saida: TestCase
    printf("%s\n", s);
    free(s);

    s = camel_case("camel case method"); //saida: CamelCaseMethod
    printf("%s\n", s);
    free(s);

    s = camel_case("say hello "); //saida: SayHello
    printf("%s\n", s);
    free(s);

    s = camel_case(" camel case word"); //saida: CamelCaseWord
    printf("%s\n", s);
    free(s);

    s = camel_case(""); //saida:
    printf("%s\n", s);
    free(s);

    return 0;
}

/**
 * "test case" -> "TestCase"
 * "camel case method" -> "CamelCaseMethod"
 * "say hello" -> "SayHello"
 * " camel case word" -> "CamelCaseWord"
 *
 * Todas as palavras devem ter a primeira letra maiúscula sem espaços.
 * @param s
 * @return
 */
char *camel_case(const char *s){
    int n = strlen(s);
    char *result = calloc(n, sizeof (char));
    short flagFirst = 0;
    int i = 0;

    while(*s != '\0'){
        *(result + i) = *s;

        if(*s != ' ' && !flagFirst){
            flagFirst = 1;
            *(result+i) = *(s) - 32;
            i++;
            s++;
            continue;
        }else
        if(*s == ' ' && *(s+1) == ' '){
            i++;
        }else
        if(*s == ' ' && *(s+1) != '\0'){
            *(result + i) = *(s+1) - 32;
            s++;
        }

        i++;
        s++;
    }
    *(result + i) = '\0';

    return result;
}