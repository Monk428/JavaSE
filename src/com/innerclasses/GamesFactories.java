package com.innerclasses;
//匿名工厂
interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checkers implements Game {
    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Checkers();
        }
    };
}

public class GamesFactories {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move());
    }
    public static void main(String[] args) {
        playGame(Checkers.factory);
    }
}
