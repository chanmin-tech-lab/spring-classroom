package com.example.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record는 JDK 16에 처음 출시된 기능
// Getter, Setter 및 생성자를 별도로 정의할 필요 없이 숏컷의 기능을 한다.
record Person(String name, int age, Address address) {

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
        return new Person("Garam", 20, new Address("도청로 10", "Suwon"));
    }

    // 기존의 빈을 활용해 새로운 빈을 만들 수도 있다.
    @Bean
    Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    // 함수의 파라미터가 그냥 파라미터가 아니라, "빈의 이름" 이다.
    // 빈의 이름을 찾지 못하면 클래스 유형에 따라 선택된다.
    Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
        return new Person(name, age, address);
    }

    // 어노테이션 옆에 앨리어스를 붙여줄 수도 있다.
    @Bean(name = "address2")
    // --- bean candidate 중 가장 높은 우선순위를 갖도록 한다. (기본값)
    @Primary
    Address address() {
        return new Address("도청로 10", "Suwon");
    }

    @Bean(name = "address3")
    @Qualifier("address3Qualifier")
    Address address3() {
        return new Address("신림동 26", "Seoul");
    }
}
