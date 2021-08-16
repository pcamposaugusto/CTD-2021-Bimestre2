//Exercício 1
//Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.

//Exercício 2
//Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais.
//Mostre o resultado obtido.

package PrimeirosPassosJava;

public class ExStringEInteger {

    public static void main(String[] args) {
        String linguagem1 = "JavaScript";
        String linguagem2 = "Java";

        if(linguagem1.equals(linguagem2)) {
            System.out.println("As linguagens de programação são iguais.");
        } else {
            System.out.println("As linguagens de programação são diferentes.");
        }

        Integer valor1 = 21;
        Integer valor2 = 33;
        int comparar;

        if(valor1.equals(valor2)) {
            System.out.println("O valores são iguais.");
        } else {
            comparar = valor1.compareTo(valor2);
            if(comparar>0) {
                System.out.println("O valor1 é maior que o valor2.");
            } else {
                System.out.println("O valor 2 é maior que o valor 1.");
            }
        }
    }
}
