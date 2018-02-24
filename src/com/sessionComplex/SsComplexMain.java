package com.sessionComplex;

import com.util.Print;

public class SsComplexMain {
    public static void main(String[] args) {
        Complex cp = new Complex();
        System.out.println(cp);

        Inherit x = new Inherit();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class");
        Inherit.main(args);

        InitBase ib = new InitBase();

        Chess cs = new Chess();

        ProtectedClass orc = new ProtectedClass("lim", 12);
        Print.print(orc);
        orc.change("bob", 19);
        Print.print(orc);

        Print.print("---------------");
        InitClass ic = new InitClass();

        ConstructMult cm = new ConstructMult();

    }
}



