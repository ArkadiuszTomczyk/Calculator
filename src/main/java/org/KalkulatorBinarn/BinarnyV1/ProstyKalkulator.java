package org.KalkulatorBinarn.BinarnyV1;

import java.util.Scanner;

public class ProstyKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz system liczbowy (10 lub 2):");
        int systemLiczbowy = input.nextInt();

        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = wczytajLiczbe(input, systemLiczbowy);

        System.out.println("Podaj drugą liczbę:");
        double liczba2 = wczytajLiczbe(input, systemLiczbowy);

        System.out.println("Wybierz działanie (+, -, *, /):");
        String operacja = input.next();

        Dzialania dzialania = new Dzialania();

        double wynik = dzialania.oblicz(liczba1, liczba2, operacja);

        System.out.println("Wynik: " + formatujLiczbe(wynik, systemLiczbowy));

        input.close();
    }

    private static double wczytajLiczbe(Scanner input, int systemLiczbowy) {
        if (systemLiczbowy == 10) {
            return input.nextDouble();
        } else if (systemLiczbowy == 2) {
            String binarnaLiczba = input.next();
            return konwertujNaDziesietna(binarnaLiczba);
        } else {
            throw new IllegalArgumentException("Nieobsługiwany system liczbowy: " + systemLiczbowy);
        }
    }

    private static String formatujLiczbe(double liczba, int systemLiczbowy) {
        if (systemLiczbowy == 10) {
            return Double.toString(liczba);
        } else if (systemLiczbowy == 2) {
            return konwertujNaBinarna((int) liczba);
        } else {
            throw new IllegalArgumentException("Nieobsługiwany system liczbowy: " + systemLiczbowy);
        }
    }

    private static int konwertujNaDziesietna(String binarnaLiczba) {
        int dziesietnaLiczba = 0;
        for (int i = binarnaLiczba.length() - 1, j = 0; i >= 0; i--, j++) {
            if (binarnaLiczba.charAt(i) == '1') {
                dziesietnaLiczba += Math.pow(2, j);
            }
        }
        return dziesietnaLiczba;
    }

    private static String konwertujNaBinarna(int dziesietnaLiczba) {
        StringBuilder binarnaLiczba = new StringBuilder();
        while (dziesietnaLiczba > 0) {
            int reszta = dziesietnaLiczba % 2;
            binarnaLiczba.append(reszta);
            dziesietnaLiczba /= 2;
        }
        return binarnaLiczba.reverse().toString();
    }
}
