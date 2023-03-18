package org.KalkulatorBinarn.Medium;

public class Coords {
    public final static String FIGURE = "FIGURE";
    public final static String RESOLVE = "RESOLVE";
    public final static String EXIT = "EXIT";
    public final static String EXAMPLE = "EXAMPLE";

    private int value;
    private String command;


    public Coords(int value, String command) {
        this.value = value;
        this.command = command;
    }

    public int getValue() {
        return value;
    }

    public String getCommand() {
        return command;
    }
}
