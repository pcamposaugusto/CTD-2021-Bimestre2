//Uma equipe da Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque de um de seus carros para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento. Escreva um programa (EM QUALQUER LINGUAGEM) que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Considere que o número de voltas entre os reabastecimentos é o mesmo.

package com.company;

import java.util.Scanner;

public class DesafioFormula1 {

    // Após a inserção do Scanner no programa, partiu-se para a criação da função que calcula o número mínimo de litros necessários para percorrer até o primeiro reabastecimento.

    private static float calcMinLitros(int numReabastecimentos, int numVoltas, float comprimentoPista, float consumoCarro) {
        float comprimentoKm = comprimentoPista / 1000; // Aqui transformamos metros em km.
        float comprimentoParaReabastecer = comprimentoKm * numVoltas / (numReabastecimentos + 1); // Aqui calculamos o comprimento que o carro consegue percorrer até o reabastecimento, considerando que, para obter o número de trechos a serem percorridos a cada abastecimento, deve-se somar 1 ao número de reabastecimentos na divisão, visto que não haverá reabastecimento no último trecho.
        return comprimentoParaReabastecer / consumoCarro; // Aqui temos o resultado buscado na função, qual seja: o número mínimo de litros necessários para percorrer até o primeiro reabastecimento.
    }


    // Inicialmente, criou-se um Scanner para que o usuário possa fornecer as informações que deverão ser lidas pelo programa. Foram elas: comprimento da pista em metros, número total de voltas, número de reabastecimentos desejados e consumo de combustível do carro (Km/L). Para guardar essas informações foram criadas as respectivas variáveis e seus tipos de dados.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o comprimento da pista em metros?");
        float comprimentoPista = entrada.nextInt();

        System.out.println("Qual o número total de voltas a serem percorridas no grande prêmio?");
        int numVoltas = entrada.nextInt();

        System.out.println("Qual o número de reabastecimentos desejados?");
        int numReabastecimentos = entrada.nextInt();

        System.out.println("Qual o consumo de combustível do carro em km/L?");
        float consumoCarro = entrada.nextInt();

        //Aqui imprimimos o resultado da função para o usuário.
        System.out.println("O número mínimo de litros necessários para percorrer até o primeiro reabastecimento é: " + calcMinLitros(numReabastecimentos, numVoltas, comprimentoPista, consumoCarro));

    }

}
