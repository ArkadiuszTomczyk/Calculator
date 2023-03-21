package org.KalkulatorBinarn.BinarnyV2;

import java.util.Scanner;

public class ChooseCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oneMoreTime;

        do {
            System.out.println("Wybierz kalkulator:");
            System.out.println("1. binarny na Dziesiętny");
            System.out.println("2. Dziesiętny na binarny");
            System.out.println("3. Dziesiętny na szesnastkowy");
            System.out.println("4. szesnastkowy na Dziesiętny");
            System.out.println("5. Szesnastkowy na binarny");
            System.out.println("6. Binarny na szesnastkowy");
            System.out.println("0-  Zakończć");

            String choice = input.nextLine().toUpperCase();
//            int choose = input.nextInt();
            switch (choice) {
                case "1":
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
                    break;

                case "2":
                    System.out.print("Podaj liczbę dziesiętną: ");
                    int decimalNumber = input.nextInt();

                    String binaryNumber = "";
                    while (decimalNumber > 0) {
                        int remainder = decimalNumber % 2;
                        binaryNumber = remainder + binaryNumber;
                        decimalNumber /= 2;
                    }

                    System.out.println("Liczba binarna: " + binaryNumber);

                    break;
                case "3":
                    System.out.print("Podaj liczbę dziesiętną: ");
                    int decimalH = input.nextInt();
                    String hexadecimal = "";
                    char[] hexSymbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                    while (decimalH > 0) {
                        int remainder = decimalH % 16;
                        hexadecimal = hexSymbols[remainder] + hexadecimal;
                        decimalH = decimalH / 16;
                    }
                    System.out.println("Liczba w systemie szesnastkowym: " + hexadecimal);

                    break;
                case "4":
                    System.out.print("Podaj liczbę szesnastkową: ");
                    String hexadecimalD = input.next();
                    int decimalHe = 0;
                    for (int i = 0; i < hexadecimalD.length(); i++) {
                        char hexDigit = hexadecimalD.charAt(i);
                        int decimalValue = 0;
                        if (hexDigit >= '0' && hexDigit <= '9') {
                            decimalValue = hexDigit - '0';
                        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
                            decimalValue = 10 + (hexDigit - 'A');
                        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
                            decimalValue = 10 + (hexDigit - 'a');
                        }
                        decimalHe = decimalHe * 16 + decimalValue;
                    }
                    System.out.println("Liczba w systemie dziesiętnym: " + decimalHe);

                    break;
                case "5":
                    System.out.print("Podaj liczbę szesnastkową: ");

                    String hexadecimalB = input.next();
                    String binaryH = "";
                    for (int i = 0; i < hexadecimalB.length(); i++) {
                        char hexDigit = hexadecimalB.charAt(i);
                        String binaryValue = "";
                        if (hexDigit >= '0' && hexDigit <= '9') {
                            binaryValue = Integer.toBinaryString(hexDigit - '0');
                        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
                            binaryValue = Integer.toBinaryString(10 + (hexDigit - 'A'));
                        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
                            binaryValue = Integer.toBinaryString(10 + (hexDigit - 'a'));
                        }
                        while (binaryValue.length() < 4) {
                            binaryValue = "0" + binaryValue;
                        }
                        binaryH += binaryValue;
                    }
                    System.out.println("Liczba w systemie binarnym: " + binaryH);

                    break;
                case "6":
                    System.out.print("Podaj liczbę binarną: ");
                    String binaryHe = input.next();
                    String hexadecimalBin = "";
                    for (int i = 0; i < binaryHe.length(); i += 4) {
                        String binaryValue = binaryHe.substring(i, i + 4);
                        int decimalValue = Integer.parseInt(binaryValue, 2);
                        char hexDigit;
                        if (decimalValue <= 9) {
                            hexDigit = (char) ('0' + decimalValue);
                        } else {
                            hexDigit = (char) ('A' + (decimalValue - 10));
                        }
                        hexadecimalBin += hexDigit;
                    }
                    System.out.println("Liczba w systemie szesnastkowym: " + hexadecimalBin);

                    break;

            }
            System.out.println("Czy chcesz kontynuować? Wpisz 0 aby wyjść lub dowolny inny znak aby kontynuować:");
            oneMoreTime = choice;

        } while (!oneMoreTime.equals("0"));

    }

}
