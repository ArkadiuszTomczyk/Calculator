package org.KalkulatorBinarn.BinarnyV2;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę szesnastkową: ");
        String hexadecimal = scanner.next();
        int decimal = 0;
        for(int i = 0; i < hexadecimal.length(); i++) {
            char hexDigit = hexadecimal.charAt(i);
            int decimalValue = 0;
            if(hexDigit >= '0' && hexDigit <= '9') {
                decimalValue = hexDigit - '0';
            }
            else if(hexDigit >= 'A' && hexDigit <= 'F') {
                decimalValue = 10 + (hexDigit - 'A');
            }
            else if(hexDigit >= 'a' && hexDigit <= 'f') {
                decimalValue = 10 + (hexDigit - 'a');
            }
            decimal = decimal * 16 + decimalValue;
        }
        System.out.println("Liczba w systemie dziesiętnym: " + decimal);
    }
}

// jest to sposób konwersji liczby szesnastkowej na wartość dziesiętną, który polega na iteracji
// przez każdą cyfrę szesnastkową i konwersji jej na wartość dziesiętną.
