
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {

    {
        System.out.println("ContextLifeCycle: 1 parsing config");
    }


    @Bean
   // @Scope("cust")
    public Farm farm(Cat cat){

        System.out.println("bean farm on config ");
        return new Farm(cat);
    }

    @Bean
  public CatFactory cf(){
        return new CatFactory();
    }

    @Bean
    public BeanPostConst beanPostConst(){
        return new BeanPostConst();
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public  Caw caw(){

        return new Caw();
    }
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
