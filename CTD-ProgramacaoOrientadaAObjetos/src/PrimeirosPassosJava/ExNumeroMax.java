//Exercício

//Escreva uma função que receba três números e retorne o máximo dos três números.
//Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.

package PrimeirosPassosJava;

import java.util.Scanner;

public class ExNumeroMax {

    private static int numeroMax(int num1, int num2, int num3) {
        return Math.max(num1, (Math.max(num2, num3)));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();

        System.out.println("O maior número dos três é: " + numeroMax(num1, num2, num3));

    }
}
