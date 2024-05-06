package com.example.learnspringframework;

import java.io.Serializable;

// POJO = 우리가 만드는 대부분의 자바 클래스 및 스프링 빈
class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }
}

// Java Bean의 세 가지 조건

// 3. 클래스가 Serializable 인터페이스를 구현해야 한다.
class JavaBean implements Serializable { // EJB (Enterprise Java Bean)

    // 1. 인수를 갖는 생성자가 없어야 한다.
    public JavaBean() {

    }

    private String text;
    private int number;

    // 2. Getter와 Setter를 가져야 한다.
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

// Spring Bean
// = 스프링에서 관리하는 모든 자바 객체
// = 엄밀히는 IoC 컨테이너에서 관리하는 모든 자바 객체