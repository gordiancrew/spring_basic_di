import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog(){
        System.out.println("BeanLifeCycle: 2 dependence injection(inject Dog on farm)");
    }
}
