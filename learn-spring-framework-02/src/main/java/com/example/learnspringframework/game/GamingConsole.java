package com.example.learnspringframework.game;

import org.springframework.context.annotation.Configuration;

// 여러 클래스에서 공통으로 사용되는 것들을 인터페이스로 구현한다
@Configuration
public interface GamingConsole {
    void up();

    void right();

    void down();

    void left();
}
