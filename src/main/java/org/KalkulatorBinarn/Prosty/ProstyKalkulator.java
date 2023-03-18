package org.KalkulatorBinarn.Prosty;

import java.util.Scanner;

public class ProstyKalkulator {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Podaj pierwszą liczbę:");
            double liczba1 = input.nextDouble();

            System.out.println("Podaj drugą liczbę:");
            double liczba2 = input.nextDouble();

            System.out.println("Wybierz działanie (+, -, *, /):");
            String operacja = input.next();

            double wynik = 0.0;

            switch(operacja) {
                case "+":
                    wynik = liczba1 + liczba2;
                    break;
                case "-":
                    wynik = liczba1 - liczba2;
                    break;
                case "*":
                    wynik = liczba1 * liczba2;
                    break;
                case "/":
                    wynik = liczba1 / liczba2;
                    break;
                default:
                    System.out.println("Nieprawidłowe działanie!");
            }

            System.out.println("Wynik: " + wynik);

            input.close();
        }

    }

