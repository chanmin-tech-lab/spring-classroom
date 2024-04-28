package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.PacmanGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        // var game = new SuperContraGame();

        // 1. 객체 생성
        var game = new PacmanGame();

        // 2. 객체 생성 + 의존성 결합 (Wiring Dependency)
        // GamingConsole 클래스는 GameRunner 클래스의 의존성임
        // GamingConsole 클래스가 GameRunner 클래스에 "주입되었다".
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
