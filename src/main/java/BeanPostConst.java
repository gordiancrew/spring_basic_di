import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostConst implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("farm"))
        System.out.println("BeanLifeCycle: 3 pre-initialization && ContextLifeCycle: 5  ");

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("farm"))
        System.out.println("BeanLifeCycle: 5 past-init");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
