package com.sessionComplex;

class Villain {
    private String name;
    protected void set(String nm) { name = nm;}
    public Villain(String name) { this.name = name;}
    public String toString() {
        return "i'm a Villain and..." + name;
    }
}

public class ProtectedClass extends Villain {
    private int orcNumber;
    public ProtectedClass(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

}
