package com.example.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record는 JDK 16에 처음 출시된 기능
// Getter, Setter 및 생성자를 별도로 정의할 필요 없이 숏컷의 기능을 한다.
record Person(String name, int age) {

};

record Address(String firstLine, String city) {

}

// 스프링 설정 클래스는 @Configuration 으로 나타낼 수 있다.
// Configuration 클래스에서 스프링 빈을 정의할 수 있다.
// 스프링 빈 = 스프링에서 관리하는 Custom Object
@Configuration
public class HelloWorldConfiguration {

    @Bean
    String name() {
        return "Chanmin";
    }

    @Bean
    int age() {
        return 28;
    }

    @Bean
    Person person() {
        return new Person("Garam", 20);
    }

    @Bean
    Address address() {
        return new Address("도청로 10", "Suwon");
    }
}
