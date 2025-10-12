package exercicios.java.numbers;
import java.util.Scanner;


public class number_03 {

    // Crie um algoritmo que leia dois números e imprima na tela a soma dos dois números caso eles sejam iguais, ou a multiplicação caso sejam diferentes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }
        sc.close();
    }
}
