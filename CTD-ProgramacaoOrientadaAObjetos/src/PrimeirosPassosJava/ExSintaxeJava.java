//Exercício

//Digite seu nome e sobrenome separadamente, a partir dessas variáveis obtenha em uma terceira, suas iniciais e sua data de nascimento, para a data digite 3 valores que representam dia, mês e ano.
//Em seguida, exiba uma mensagem, como se fosse um token, com as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa".
//Nota: Use alguma função para resolver, por exemplo, dados os 3 valores, retorne a data como uma string.

package PrimeirosPassosJava;

import java.util.Scanner;

public class ExSintaxeJava {

    public static String dataNasc(String dia, String mes, String ano) {
        return dia + "/" + mes + "/" + ano;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        String iniciais = nome.charAt(0) + "" + sobrenome.charAt(0);

        System.out.println("Digite sua date de nascimento: ");
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        System.out.println("Seu nome completo é: " + nome + " " + sobrenome + ". Suas iniciais são: " + iniciais + ". Sua data de nascimento é: " + dataNasc(dia, mes, ano) + ".");

    }
}
