import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        System.out.println("ContextLifeCycle: 2 cetting castom BeanDefinitions(custom BeanFactoryPostProcessor)");
        factory.registerScope("cust", new CustomScope());
    }
}