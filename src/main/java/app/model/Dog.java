package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog extends Animal{
  
  @Autowired
  private  Timer timer;

    @Override
    public String toString() {
        return "Im a Dog";
    }
}

