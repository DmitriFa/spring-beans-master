package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

 /*  @Bean(name = "dog")
    public void Dog() {
        Dog dog = new Dog();
        dog.toString();
    }

     @Bean(name = "cat")
    public void Cat() {
        Cat cat = new Cat();
        cat.toString();
    }

    @Bean(name = "timer")
    public void getTimer() {
        Timer timer = new Timer();
        timer.getTime();
    }*/
}
