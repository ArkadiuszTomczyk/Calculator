package org.KalkulatorBinarn.BinarnyV2;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną: ");
        int decimal = scanner.nextInt();
        String hexadecimal = "";
        char[] hexSymbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = hexSymbols[remainder] + hexadecimal;
            decimal = decimal / 16;
        }
        System.out.println("Liczba w systemie szesnastkowym: " + hexadecimal);
    }
}
