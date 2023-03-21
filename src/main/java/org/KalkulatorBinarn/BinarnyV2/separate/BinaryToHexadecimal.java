package org.KalkulatorBinarn.BinarnyV2.separate;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę binarną: ");
        String binary = scanner.next();
        String hexadecimal = "";
        for(int i = 0; i < binary.length(); i += 4) {
            String binaryValue = binary.substring(i, i + 4);
            int decimalValue = Integer.parseInt(binaryValue, 2);
            char hexDigit;
            if(decimalValue <= 9) {
                hexDigit = (char) ('0' + decimalValue);
            }
            else {
                hexDigit = (char) ('A' + (decimalValue - 10));
            }
            hexadecimal += hexDigit;
        }
        System.out.println("Liczba w systemie szesnastkowym: " + hexadecimal);

//        String binaryString = scanner.next();
//        BigInteger decimal = new BigInteger(binaryString, 2);
//        String hexadecimal = decimal.toString(16).toUpperCase();
//        System.out.println("Wartość szesnastkowa to: " + hexadecimal);
    }
}
