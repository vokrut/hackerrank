package com.kengoweb.codewars.kyu2.fullmetalchemist1;

public class Atom {
    public int id;
    public String element;

    public Atom(String elt, int id_) {
        element = elt;
        id = id_;
    }

    @Override public int hashCode() { return id; }        //  Do not modify this method!!

    @Override public boolean equals(Object other) {       //  Do not modify this method!!
        if (other != null && other instanceof Atom) {
            Atom that = (Atom) other;
            return id == that.id;
        }
        return false;
    }
}
