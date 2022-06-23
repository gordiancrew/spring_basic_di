import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Start main");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Farm farm = context.getBean(Farm.class);
        Cat cat=context.getBean(Cat.class);
        farm.foo();
       // System.out.println(context.getBeanDefinition("farm"));
       // System.out.println(cat.getName());
        context.close();

    }
}
