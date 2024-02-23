package mx.com.codegym.lesson02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String texto = scanner.nextLine();
        //System.out.println("texto: " + texto);
        int numero1 =  scanner.nextInt();
        int numero2 =  scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }

}
