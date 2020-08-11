package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Cat;
import app.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Application {

    public static void main(String[] args) {


        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
      for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();


        }
      /*   AnimalsCage bean =
                applicationContext.getBean(AnimalsCage.class);
        bean.whatAnimalSay();
     Dog bean1 =
              applicationContext.getBean(Dog.class);
      bean1.toString();*/
    }

}
