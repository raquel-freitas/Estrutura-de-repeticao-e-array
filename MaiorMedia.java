package br.dio.loop;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int numero;

        int maior = 0;

        int soma = 0;


        int count = 0;

        do {
            System.out.println("Insira o numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            ++count;

        } while (count < 5);

        System.out.println("Maior: "+ maior);

        System.out.println("Media:" + soma/5 );
        }
    }
