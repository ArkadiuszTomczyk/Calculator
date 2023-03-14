package org.KalkulatorBinarn;

public class CalcLogic {

    private CalcBoard calcBoard;




    public CalcBoard getCalcBoard() {
        return calcBoard;
    }

    public void setCalcBoard(CalcBoard calcBoard) {
        this.calcBoard = calcBoard;
    }

    public boolean play(){
        calcBoard = new CalcBoard();
        UserDialogs.sayHello();
        while (true) {
            System.out.println(calcBoard);
            Coords coords = UserDialogs.getNumber();
            switch (coords.getCommand()) {
                case Coords.EXIT: return false;
//                case Coords.FIGURE: calcBoard
            }
        }

    }
}
