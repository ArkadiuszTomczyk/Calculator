package org.KalkulatorBinarn.Prosty2;

import java.util.Scanner;

public class ProstyKalkulator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = input.nextDouble();

        System.out.println("Podaj drugą liczbę:");
        double liczba2 = input.nextDouble();

        System.out.println("Wybierz działanie (+, -, *, /):");
        String operacja = input.next();

        Dzialania dzialania = new Dzialania();

        double wynik = dzialania.oblicz(liczba1, liczba2, operacja);

        System.out.println("Wynik: " + wynik);

        input.close();
    }
}
