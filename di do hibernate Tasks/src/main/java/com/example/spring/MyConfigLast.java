package com.example.spring;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.example.spring")
public class MyConfigLast {

    @Bean
    @Scope("prototype")
    public Pet catBean () {
        return  new Cat();
    }

    @Bean
    public Person personBean () {
        return new Person(catBean());
    }
}
