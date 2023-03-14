package org.KalkulatorBinarn.BinarnyV2;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber /= 2;
        }

        System.out.println("Liczba binarna: " + binaryNumber);
    }
}

