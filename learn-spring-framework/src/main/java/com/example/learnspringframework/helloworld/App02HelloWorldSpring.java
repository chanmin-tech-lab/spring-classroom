package com.example.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. 스프링 컨텍스트를 실행한다.
        // 근데 컨텍스트를 생성할 때는 컨피규레이션 클래스가 필요하고
        // 컨피규레이션 클래스를 정의할 때는 @Configuration 이라는 어노테이션을 붙여야 해.

        // try-with-resource 문법 (1.7)
        // @see https://mangkyu.tistory.com/217
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. 관리하고자 하는 속성(= 스프링 빈)들을 설정한다. - @Configuration
            // 빈은 컨피규레이션 클래스에 정의되고, @Bean 이라는 어노테이션을 붙여야 해.
            // 이 때, @Bean 어노테이션이 붙는 메서드는 private으로 사용할 것이 권장돼.
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person4Parameters"));
            System.out.println(context.getBean("person5Qualifier"));
            // Bean 이름이 아닌 클래스 유형으로 찾을 수도 있다.

            // 스프링 컨텍스트에서 빈을 가져올 때 일치하는 빈이 여럿인 경우를 후보(Candidate) 라고 한다.
            // 후보가 여럿일 경우 스프링이 오류를 출력한다.
            System.out.println(context.getBean(Address.class));

            // System.out::println 처럼 메서드 참조 (method reference) 를 사용할 수도 있다.
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        ;

    }
}
