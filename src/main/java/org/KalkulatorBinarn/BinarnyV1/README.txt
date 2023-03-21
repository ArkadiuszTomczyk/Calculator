kalkulator,
który może przeliczać liczby pomiędzy różnymi systemami liczbowymi: dziesiętnym, binarnym i szesnastkowym.
Klasa zawiera metodę main, która pobiera dane od użytkownika za pomocą obiektu Scanner. Następnie, w zależności od wybranej przez użytkownika opcji,
 klasa przelicza liczby i wyświetla wyniki.

W pętli do-while użytkownik może wybierać różne opcje. Każda opcja ma swoją własną implementację przeliczania liczby. Na przykład, gdy użytkownik wybierze
opcję "1", program pobiera liczbę binarną od użytkownika, konwertuje ją na liczbę dziesiętną i wyświetla wynik. W opcji "2", program pobiera liczbę d
ziesiętną od użytkownika, konwertuje ją na liczbę binarną i wyświetla wynik.

1. Użytkownik o wprowadzenie liczby binarnej za pomocą metody System.out.print(), a następnie odczytuje tę liczbę jako ciąg znaków i przekształca ją
na liczbę dziesiętną za pomocą metody Integer.parseInt(), która przyjmuje dwa argumenty: pierwszy to ciąg znaków reprezentujący liczbę binarną,
a drugi to podstawa systemu liczbowego, czyli w tym przypadku 2 (dla liczby binarnej). Ostatecznie, wynik zostaje wyświetlony na ekranie
za pomocą metody System.out.println().