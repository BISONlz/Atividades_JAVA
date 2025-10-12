package exercicios.java.numbers;

import java.util.Scanner;

public class number_02 {
    // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        int c = a + b;
        String result = (c % 2 == 0) ? "even" : "odd";
        String result2 = (c >= 0) ? "positive" : "negative";
        System.out.println("The sum is " + result + " and " + result2);
        sc.close();


    }
}
