package com.example.learnspringframework.game;

public class GameRunner {
    // MarioGame game;
    private GamingConsole game;

    // MarioGame과 강결합
    // public GameRunner(MarioGame game) {
    // this.game = game;
    // }

    // GameRunner 클래스는 GamingConsole 클래스 없이는 아무것도 할 수 없다.
    // GamingConsole 클래스는 GamingRunner 클래스의 의존성이다.
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
