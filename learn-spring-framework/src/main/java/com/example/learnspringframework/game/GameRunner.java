package com.example.learnspringframework.game;

public class GameRunner {
    // MarioGame game;
    private GamingConsole game;

    // MarioGame과 강결합
    // public GameRunner(MarioGame game) {
    // this.game = game;
    // }

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game : " + this.game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
