package org.KalkulatorBinarn.BinarnyV2;
import org.KalkulatorBinarn.Medium.Coords;
import java.util.Scanner;

public class ChooseCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz kalkulator:");
        System.out.println("1. binarny na Dziesiętny");
        System.out.println("2. Dziesiętny na binarny");
        System.out.println("3. Dziesiętny na szesnastkowy");
        System.out.println("4. szesnastkowy na Dziesiętny");
        System.out.println("5. Szesnastkowy na binarny");
        System.out.println("6. Binarny na szesnastkowy");
        String s = scanner.nextLine().toUpperCase();
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                 binaryToDecimal();
                 break;
            case 2:
                decimalToBinary();
                break;
            case 3:
                decimalToHex();
                break;
            case 4:
                hexToDecimal();
                break;
            case 5:
                hexToBinary();
                break;
            case 6:
                binaryToHex();
                break;

        }

    }

    private static void binaryToHex() {
    }

    private static void hexToBinary() {
    }

    private static void hexToDecimal() {
    }

    private static void decimalToHex() {
    }

    private static void decimalToBinary() {
    }

    private static void binaryToDecimal() {
    }


}
