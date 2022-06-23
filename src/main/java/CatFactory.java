import org.springframework.beans.factory.FactoryBean;

public class CatFactory implements FactoryBean<Cat> {
    @Override
    public Cat getObject() throws Exception {
        System.out.println("ContextLifeCycle: 3 FactoryBean<T>");
        return new Cat("Barsuk");
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }
}
