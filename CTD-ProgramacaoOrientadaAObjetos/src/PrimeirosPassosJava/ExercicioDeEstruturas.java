//Exercício de Estruturas

//Defina dois números inteiros. Atribua um valor a cada um. Verifique se um número é divisível pelo segundo e indique o resultado obtido por meio de uma mensagem.

//NOTA: O fato de ser divisível significa que ao dividir precisa dar um valor exato, ou seja, sem decimais.


package PrimeirosPassosJava;

public class ExercicioDeEstruturas {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 2;
        if (num1 % num2 == 0) {
            System.out.println("O primeiro número é divisível pelo segundo. O resultado da divisão é: " + num1 / num2);
        } else {
            System.out.println("O primeiro número não é divisível pelo segundo");
        }
    }
}
