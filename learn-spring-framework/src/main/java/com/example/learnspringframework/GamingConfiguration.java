package com.example.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.GamingConsole;
import com.example.learnspringframework.game.PacmanGame;

record Game() {
}

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        // 일반 객체를 Bean으로 감쌌다
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var runner = new GameRunner(game);
        return runner;
    }

}
