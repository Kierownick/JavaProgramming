package com.company;

public class Main {

    public static void main(String[] args) {

        double jeden = 20.00d;
        double dwa = 80.00d;
        double jedenDwa = (jeden + dwa) * 100.00d;
        double moduloJedenDwa = (jedenDwa % 40.00d);
        boolean wynikModulo = (moduloJedenDwa == 0) ? true : false;

        if (!wynikModulo) {
            System.out.println("Got some remainder");
        }
    }
}
