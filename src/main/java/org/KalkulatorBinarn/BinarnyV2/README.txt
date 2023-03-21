kalkulator,
 który może przeliczać liczby pomiędzy różnymi systemami liczbowymi: dziesiętnym, binarnym i szesnastkowym.
Klasa zawiera metodę main, która pobiera dane od użytkownika za pomocą obiektu Scanner. Następnie, w zależności od wybranej przez użytkownika opcji,
 klasa przelicza liczby i wyświetla wyniki.

W pętli do-while użytkownik może wybierać różne opcje. Każda opcja ma swoją własną implementację przeliczania liczby. Na przykład, gdy użytkownik wybierze
opcję "1", program pobiera liczbę binarną od użytkownika, konwertuje ją na liczbę dziesiętną i wyświetla wynik. W opcji "2", program pobiera liczbę d
ziesiętną od użytkownika, konwertuje ją na liczbę binarną i wyświetla wynik.

1. Metoda konwertuje wartość binarną na jej odpowiednik dziesiętny
  wartość liczby binarnej jest przekształcana na liczbę dziesiętną za pomocą metody parseInt() klasy Integer. Drugim argumentem jest 2,
    co oznacza, że wartość jest interpretowana jako liczba binarna.

   Aby uzyskać liczbę dziesiętną, wykorzystywana jest metoda iteracyjna while. Zmienna decimal początkowo jest ustawiona na 0, a zmienna base na 1.
    W każdej iteracji pętli, kolejna cyfra binarna jest pobierana za pomocą operacji modulo, a następnie dodawana jest do wartości dziesiętnej za pomocą
     odpowiedniego przesunięcia pozycyjnego o wartość bazy, która jest podnoszona do kolejnej potęgi liczby 2. W kolejnych iteracjach wartość zmiennej
     binary jest dzielona przez 10, aby otrzymać następną cyfrę binarną. Po przejściu przez całą pętlę, zmienna decimal zawiera wartość liczby dziesiętnej
     odpowiadającej wprowadzonej liczbie binarnej, którą wyświetla się na ekranie.
2. Metoda konwertuje liczbę dziesiętną na jej reprezentację binarną.

   Zmienna binaryNumber jest początkowo ustawiona jako pusty ciąg znaków. Następnie w pętli while, która będzie wykonywana dopóki decimalNumber
   jest większe od zera, wartość zmiennej remainder jest obliczana jako reszta z dzielenia decimalNumber przez 2.

   Reszta ta jest następnie dodawana na początek zmiennej binaryNumber za pomocą operatora +. Następnie decimalNumber jest podzielone przez 2,
   aby przejść do kolejnej pozycji binarnej, a zmienna binaryNumber jest aktualizowana.

   W ten sposób, dla każdej pozycji binarnej, reszta z dzielenia przez 2 jest dodawana na początek binaryNumber, a decimalNumber jest dzielone przez 2,
    aż do momentu, gdy decimalNumber osiągnie wartość 0.

   Wynikową wartością jest ciąg znaków binaryNumber, który reprezentuje liczbę binarną odpowiadającą początkowej liczbie dziesiętnej.
3.  Metoda służy do konwersji liczb dziesiętneych na system szesnastkowy.

   W pierwszej linii kodu użytkownik zostaje poproszony o podanie liczby dziesiętnej, którą następnie zapisuje się do zmiennej decimalH za pomocą metody
   nextInt().

   Następnie tworzy się pusty łańcuch znaków hexadecimal, który będzie przechowywał wynik konwersji, oraz tablica znaków hexSymbols zawierająca symbole
   odpowiadające kolejnym cyfrom systemu szesnastkowego.

   W pętli while przeprowadzana jest właściwa konwersja. Za każdym razem, gdy wykonywana jest iteracja, zapisywany jest resztę z dzielenia decimalH przez 16,
    a następnie zapisywany jest odpowiadający mu symbol ze zmiennej hexSymbols. Następnie liczba decimalH jest aktualizowana dzieleniem przez 16.

   Ostatecznie, wartość zmiennej hexadecimal zawiera konwertowaną liczbę dziesiętną zapisaną w systemie szesnastkowym.

4. Metoda służy do konwersji z wartości szesnastkowych na dziesiętne. Na początku inicjalizujemy zmienną decimalHe jako 0, a następnie iterujemy przez każdą cyfrę w szesnastkowej liczbie
 hexadecimalD. Dla każdej cyfry hexDigit obliczamy wartość dziesiętną decimalValue, w zależności od tego, czy hexDigit jest cyfrą od 0 do 9, lub literą od A do F (
 wielkimi lub małymi literami). Następnie mnożymy decimalHe przez 16 (ze względu na system szesnastkowy) i dodajemy decimalValue, aby uzyskać nową wartość
 dziesiętną. Po zakończeniu pętli decimalHe będzie zawierać wartość dziesiętną, odpowiadającą szesnastkowej liczbie hexadecimalD.

5. Metoda służy do konwersji liczb szesnastkowych na binarne.
 Na początku pobierany jest od użytkownika ciąg znaków zawierający liczbę w systemie szesnastkowym.
Następnie w pętli przechodzimy przez każdy znak tego ciągu i na jego podstawie obliczamy jego wartość w systemie binarnym. W zależności od wartości
znaku (0-9, A-F, a-f) używamy metody Integer.toBinaryString() do obliczenia reprezentacji binarnej wartości. Następnie doprowadzamy tę wartość do
długości 4, dodając niezbędne zera na początku, i dodajemy ją do łańcucha znaków przechowującego reprezentację binarną całej liczby szesnastkowej.
 Ostatecznie łańcuch ten zawiera pełną reprezentację binarną liczby szesnastkowej podanej przez użytkownika.

6. Metoda służy do konwersji liczb binarnych na szesnastkowe.
    Inicjalizuj pusty ciąg znaków hexadecimalBin.
    Przejdź przez ciąg binaryHe po czterech znakach zaczynając od początku ciągu.
    Pobierz kolejne cztery znaki binaryHe i zapisz je do zmiennej binaryValue.
    Skonwertuj binaryValue na odpowiadającą mu wartość dziesiętną i zapisz ją do zmiennej decimalValue.
    Na podstawie wartości decimalValue określ, który znak szesnastkowy odpowiada danej liczbie dziesiętnej.
    Dodaj znak szesnastkowy do ciągu hexadecimalBin.
    Powtarzaj kroki 2-6, aż przejdziesz przez cały ciąg binaryHe.
    Ciąg znaków hexadecimalBin reprezentuje liczbę szesnastkową odpowiadającą liczbie binarnej podanej na wejściu.


Całość umozliwie wielkrotny wybór aż do wciśnięcia "0" co kończy dizałanie programu
