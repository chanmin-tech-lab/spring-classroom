package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. 스프링 컨텍스트를 실행한다.
        // 근데 컨텍스트를 생성할 때는 컨피규레이션 클래스가 필요하고
        // 컨피규레이션 클래스를 정의할 때는 @Configuration 이라는 어노테이션을 붙여야 해.

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. 관리하고자 하는 속성(= 스프링 빈)들을 설정한다. - @Configuration
        // 빈은 컨피규레이션 클래스에 정의되고, @Bean 이라는 어노테이션을 붙여야 해.
        // 이 때, @Bean 어노테이션이 붙는 메서드는 private으로 사용할 것이 권장돼.
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));
    }
}
