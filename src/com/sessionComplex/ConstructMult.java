package com.sessionComplex;
//构造器多态
class Glyph {
    // 此时会调用RoundGlyph的draw，并且radius为0
    void draw() { System.out.println("Glyph.draw");}
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

public class ConstructMult {
      RoundGlyph rg = new RoundGlyph(5);
}
