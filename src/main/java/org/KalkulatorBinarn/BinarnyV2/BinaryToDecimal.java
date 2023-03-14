package org.KalkulatorBinarn.BinarnyV2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę binarną: ");
        String binaryString = input.nextLine();

        // Konwertuj ciąg znaków na liczbę całkowitą
        int binary = Integer.parseInt(binaryString, 2);

        // Przelicz na liczbę dziesiętną i wyświetl wynik
        int decimal = 0;
        int base = 1;
        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * base;
            binary /= 10;
            base *= 2;
        }
        System.out.println("Liczba dziesiętna: " + decimal);
    }
}
