package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        // var game = new SuperContraGame();

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
