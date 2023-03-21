package org.KalkulatorBinarn.BinarnyV1;

import java.util.Scanner;

public class ProstyKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wybierz system liczbowy (10, 2 lub 16):");
        int systemLiczbowy = input.nextInt();
        System.out.println(" działania możliwe tylko w systemie 2 i 10");

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
            return konwertujNaDziesietna(binarnaLiczba, 10);
        } else if (systemLiczbowy == 16) {
            String hexLiczba = input.next();
            return konwertujZ16NaDziesietna(hexLiczba, 16);

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

    //    private static int konwertujNaDziesietna(String binarnaLiczba) {
//        int dziesietnaLiczba = 0;
//        for (int i = binarnaLiczba.length() - 1, j = 0; i >= 0; i--, j++) {
//            if (binarnaLiczba.charAt(i) == '1') {
//                dziesietnaLiczba += Math.pow(2, j);
//            }
//        }
//        return dziesietnaLiczba;
//    }
    private static double konwertujNaDziesietna(String liczba, int systemLiczbowy) {
        int podstawa = systemLiczbowy;
        int potega = liczba.length() - 1;
        double wynik = 0;
        for (int i = 0; i < liczba.length(); i++) {
            char cyfra = liczba.charAt(i);
            int wartosc;
            if (cyfra >= '0' && cyfra <= '9') {
                wartosc = cyfra - '0';
            } else if (cyfra >= 'A' && cyfra <= 'F') {
                wartosc = cyfra - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Nieprawidłowy znak: " + cyfra);
            }
            wynik += wartosc * Math.pow(podstawa, potega);
            potega--;
        }
        return wynik;
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

    private static int konwertujZ16NaDziesietna(String liczba, int podstawa) {
        int wynik = 0;
        String cyfry = "0123456789ABCDEF";
        for (int i = 0; i < liczba.length(); i++) {
            char cyfra = liczba.charAt(i);
            int wartosc = cyfry.indexOf(cyfra);
            if (wartosc == -1 || wartosc >= podstawa) {
                throw new IllegalArgumentException("Nieprawidłowa liczba w systemie o podstawie " + podstawa + ": " + liczba);
            }
            wynik = wynik * podstawa + wartosc;
        }
        return wynik;
    }

    private static String konwertujNaPodstawe(int liczba, int podstawa) {
        if (liczba == 0) {
            return "0";
        }
        String cyfry = "0123456789ABCDEF";
        StringBuilder sb = new StringBuilder();
        while (liczba > 0) {
            int cyfra = liczba % podstawa;
            sb.append(cyfry.charAt(cyfra));
            liczba /= podstawa;
        }
        return sb.reverse().toString();
    }

    private static String konwertujNaSzesnastkowa(int dziesietnaLiczba) {
        StringBuilder szesnastkowaLiczba = new StringBuilder();
        while (dziesietnaLiczba > 0) {
            int reszta = dziesietnaLiczba % 16;
            if (reszta < 10) {
                szesnastkowaLiczba.append((char) ('0' + reszta));
            } else {
                szesnastkowaLiczba.append((char) ('A' + reszta - 10));
            }
            dziesietnaLiczba /= 16;
        }
        return szesnastkowaLiczba.reverse().toString();
    }

    private static int konwertujNaDziesietnaZSzesnastkowej(String szesnastkowaLiczba) {
        int dziesietnaLiczba = 0;
        for (int i = 0; i < szesnastkowaLiczba.length(); i++) {
            char c = szesnastkowaLiczba.charAt(i);
            int cyfra;
            if (c >= '0' && c <= '9') {
                cyfra = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                cyfra = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Nieprawidłowy znak szesnastkowy: " + c);
            }
            dziesietnaLiczba = dziesietnaLiczba * 16 + cyfra;
        }
        return dziesietnaLiczba;
    }

    private static String konwertujNaBinarnaZeSzesnastkowej(String szesnastkowaLiczba) {
        int dziesietnaLiczba = konwertujNaDziesietnaZSzesnastkowej(szesnastkowaLiczba);
        return konwertujNaBinarna(dziesietnaLiczba);
    }


}
