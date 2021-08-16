//Exercício

//Faça uma função que, dado um número, indique se é um número primo ou não. Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
//Para usar esta função que iremos criar em um programa, podemos permitir a entrada de apenas um número para verificar se o número é primo ou não.

package PrimeirosPassosJava;

import java.util.Scanner;

public class ExPrimo {

    private static boolean verificarPrimo(int num) {
        if(num == 0 || num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número, para verificar se ele é primo: ");
        int num = entrada.nextInt();

        if (verificarPrimo(num)) {
            System.out.println("O número " + num + " é primo.");
        } else {
        System.out.println("O número " + num + " não é primo");
        }
    }
}


