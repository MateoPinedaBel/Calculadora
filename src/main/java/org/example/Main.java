package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte option = 0;
        int num1 = 0, num2 = 0;

        System.out.println("===== Calculadora =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        try {
            System.out.print("Seleccione una opción (1-4): ");
            option = scanner.nextByte();

            System.out.print("Ingrese el primer número entero: ");
            num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            num2 = scanner.nextInt();

            switch (option) {
                case 1:
                    Scanner consola = new Scanner(System.in);
                    int sumaUno,sumaDos;

                    System.out.println("Digita el primer numero a sumar");
                    sumaUno= consola.nextInt();

                    System.out.println("Digita el segundo numero a sumar");
                    sumaDos= consola.nextInt();

                    int total = sumaUno+sumaDos;

                    System.out.println("El valor total de la suma es "+total);

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    Division division = new Division(num1, num2);
                    division.dividir();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Debe ingresar números enteros.");
        }

        scanner.close();
    }
}
