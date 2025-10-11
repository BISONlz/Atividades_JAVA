package exercicios.java.num1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class number_01 {
    static void main(String[] args) {
// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        System.out.println("Enter number c: ");
        int c = scanner.nextInt();

        String result = (a + b >= c) ? "a + b is greater than c" : (a + b == c) ? "a + b is same as c" : "a + b is not greater than c";

        System.out.println( result );
        scanner.close();
}
}
