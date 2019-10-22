package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan operasi aritmatika seperti kalkulator
 *
 */

public class Kalkulator {

    private double value1, value2;

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject() {
        System.out.println("Project calculator");
    }

    public void setNoteProject(String note) {
        System.out.println(note);
    }

    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double minus(double val1, double val2) {
        return val1 - val2;
    }

    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    public double division(double val1, double val2) {
        return val1 / val2;
    }

    public static void main(String[] args) {
	    Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();

        System.out.println(String.format("VALUE 1 = %.1f", value1));
        System.out.println(String.format("VALUE 2 = %.1f", value2));
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println(String.format("Result add is\t = %.1f", kalkulator.add(value1, value2)));
        System.out.println(String.format("Result minus is\t = %.1f", kalkulator.minus(value1, value2)));
        System.out.println(String.format("Result multiple is\t = %.1f", kalkulator.multiplication(value1, value2)));
        System.out.println(String.format("Result division is\t = %.1f", kalkulator.division(value1, value2)));
    }
}
