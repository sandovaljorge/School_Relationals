package com.intecap.escuela.utils;

public enum Puntaje {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5);

    private final int value;
    private Puntaje(final int newValue){
        value = newValue;
    }
    public int getValue(){
        return value;
    }
}
