package org.KalkulatorBinarn;

import java.util.Scanner;

public class UserDialogs {

    public static void sayHello(){
        System.out.println("Witaj w kalkulatorze");
    }
    public static Coords getNumber(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wybierz kalkulator  or type X to Exit:");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "X":
                    return new Coords(0, Coords.EXIT);
//                case "E":
//                    return new Coords(1, Coords.EXAMPLE);
//                default:
//                    try {
//                        int val = Integer.parseInt(s.substring(2, 3));
//                        if (s.length() > 1 || val == 4) {
//                            throw new Exception();
                        }
//                        return new Coords(val, Coords.FIGURE);
//                    } catch (Exception e) {
                        System.out.println("Wrong number, try again");

//                    }
//            }
        }

    }
}
