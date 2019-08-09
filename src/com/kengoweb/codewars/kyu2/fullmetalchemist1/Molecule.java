package com.kengoweb.codewars.kyu2.fullmetalchemist1;

import java.util.List;

class Molecule {

    private String name;
    private String formula;
    private double molecularWeight;
    private List<Atom> atoms;

    public Molecule() {
        this("");
    }

    public Molecule(String name) {
        this.name = name;
    }

    public Molecule brancher(int... brancher) {
        return this;
    }

    public Molecule bounder(T... bounder) {
        return this;
    }

    public Molecule mutate(T... mutate) {
        return this;
    }

    public Molecule add(T... tup) {
        return this;
    }

    public Molecule closer() throws InvalidBond {
        return this;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public List<Atom> getAtoms() {
        return atoms;
    }

}
