package org.KalkulatorBinarn.Prosty2;

class Dzialania {
    public double oblicz(double a, double b, String operacja) {
        double wynik = 0.0;

        switch (operacja) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a / b;
                break;
            default:
                System.out.println("Nieprawidłowe działanie!");
        }

        return wynik;
    }
}
