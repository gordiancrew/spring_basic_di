import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Farm implements InitializingBean, DisposableBean {

    Cat cat;

    @Autowired
    Dog dog;


    public Farm(Cat cat) {
        this.cat = cat;
        System.out.println("BeanLifeCycle: 1 instantination(constructor farm)");
    }

    public void foo() {
        System.out.println("BeanLifeCycle: 6 use bean");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BeanLyfeCycle: 4.1 initialization(@PostConstruct)");

    }

    @PreDestroy
    public void preDestroy() {

        System.out.println("BeanLifeCycle: 7 destroy(@PreDestroy)");
    }


    void calling() {
        System.out.println("void calling Farm");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle :4.2 initialization(afterpropertyset)");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle: 7 destroy(void destroy int DisposableBean");
    }
}
