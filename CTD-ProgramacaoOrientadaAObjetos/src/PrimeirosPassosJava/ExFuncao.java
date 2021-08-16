//Exercício

//Faça uma função que receba dois valores como parâmetro e que no retorno seja do tipo booleano. A função deve verificar se o primeiro número é divisível pelo segundo.
//Boolean eDivisivel(int num, int divisor)

//NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato, ou seja, sem decimais.

package PrimeirosPassosJava;

public class ExFuncao {

    public static boolean eDivisivel(int num, int divisor) {
        if (num % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(eDivisivel(72, 9));
    }
}

//Chamar a função no método main!
