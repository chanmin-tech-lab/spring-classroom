package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
