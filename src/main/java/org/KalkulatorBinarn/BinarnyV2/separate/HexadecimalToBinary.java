package org.KalkulatorBinarn.BinarnyV2.separate;

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę szesnastkową: ");

        String hexadecimal = scanner.next();
        String binary = "";
        for(int i = 0; i < hexadecimal.length(); i++) {
            char hexDigit = hexadecimal.charAt(i);
            String binaryValue = "";
            if(hexDigit >= '0' && hexDigit <= '9') {
                binaryValue = Integer.toBinaryString(hexDigit - '0');
            }
            else if(hexDigit >= 'A' && hexDigit <= 'F') {
                binaryValue = Integer.toBinaryString(10 + (hexDigit - 'A'));
            }
            else if(hexDigit >= 'a' && hexDigit <= 'f') {
                binaryValue = Integer.toBinaryString(10 + (hexDigit - 'a'));
            }
            while(binaryValue.length() < 4) {
                binaryValue = "0" + binaryValue;
            }
            binary += binaryValue;
        }
        System.out.println("Liczba w systemie binarnym: " + binary);

//        System.out.print("Podaj liczbę szesnastkową: ");
//        String hexString = scanner.next();
//        int hexNumber = Integer.parseInt(hexString, 16);
//        String binaryString = Integer.toBinaryString(hexNumber);
//        System.out.println("Wartość binarna to: " + binaryString);

    }
}
