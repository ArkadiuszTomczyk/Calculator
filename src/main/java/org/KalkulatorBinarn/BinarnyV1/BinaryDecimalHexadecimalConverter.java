package org.KalkulatorBinarn.BinarnyV1;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryDecimalHexadecimalConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String oneMoreTime;

        do {
            System.out.println("Wybierz jedną z opcji:");
            System.out.println("1 - Konwersja z binarnej na dziesiętną");
            System.out.println("2 - Konwersja z dziesiętnej na binarną");
            System.out.println("3 - Konwersja z dziesiętnej na szesnastkową");
            System.out.println("4 - Konwersja z dziesiętnej na szesnastkową");
            System.out.println("5 - Konwersja z binarnej na szesnastkową");
            System.out.println("6 - Konwersja z szesnastkową na binarną");
            System.out.println("0-  Zakończ");

            String choice = input.nextLine().toUpperCase();
            switch (choice) {
//            binarny na dziesiętny
                case "1":
                    System.out.print("Podaj liczbę binarną: ");
                    String binaryString = input.next();
                    int decimal = Integer.parseInt(binaryString, 2);
                    System.out.println("Wartość dziesiętna to: " + decimal);
                    break;
//                dziesiętny na binarny
                case "2":
                    System.out.print("Podaj liczbę dziesiętną: ");
                    String decimalString = input.next();
                    int binary = Integer.parseInt(decimalString);
                    System.out.println("Wartość binarna to: " + binary);
                    break;

//                dziesiętny na szesnastkowy
                case "3":
                    System.out.print("Podaj liczbę dziesiętną: ");
                    int decimalNumber = input.nextInt();
                    String hexadecimal = Integer.toHexString(decimalNumber);
                    System.out.println("Wartość szesnastkowa to: " + hexadecimal);
                    break;
//             szesnastkowy na dziesiętny

                case "4":
                    System.out.print("Podaj liczbę szesnastkową: ");
                    int hexNumber = input.nextInt(16);
                    System.out.println("Wartość dziesiętna to: " + hexNumber);
                    break;
//                binarny na szesnastkowy
                case "5":
                    System.out.print("Podaj liczbę binarną: ");
                    String binarySt = input.next();
                    BigInteger decimal2 = new BigInteger(binarySt, 2);
                    String hexbin = decimal2.toString(16).toUpperCase();
                    System.out.println("Wartość szesnastkowa to: " + hexbin);
                    break;
//                szesnastkowy na binarny
                case "6":
                    System.out.print("Podaj liczbę szesnastkową: ");
                    String hexString = input.next();
                    int hexNumber1 = Integer.parseInt(hexString, 16);
                    String binaryString2 = Integer.toBinaryString(hexNumber1);
                    System.out.println("Wartość binarna to: " + binaryString2);
                    break;
                case "0":
                    System.out.println("Na pewno chcesz wyjść?");

                default:
                    System.out.println("Błędny wybór!");
            }

            System.out.println("Czy chcesz kontynuować? Wpisz 0 aby wyjść lub dowolny inny znak aby kontynuować:");
            oneMoreTime = choice;

        } while (!oneMoreTime.equals("0"));
    }
}

