//Exercício

//Digite seu nome e sobrenome separadamente, a partir dessas variáveis, você deve obter uma terceira com as suas iniciais.


package PrimeirosPassosJava;

import java.util.Scanner;

public class ExScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        String iniciais = nome.charAt(0) + "" + sobrenome.charAt(0);
        System.out.println("Aqui estão suas iniciais: " + iniciais);
    }

}
