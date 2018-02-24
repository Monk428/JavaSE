package com.polymorphism;
//向上转型
class Instrument {
    public void play(Note n) {
        System.out.println("play()");
    }
    public void song(Note n) {
        System.out.println("song");
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("wind.play()" + n);
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
        i.song(Note.B_FLAT);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
