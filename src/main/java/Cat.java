import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name="before";
    private int num;

    public  Cat(String name){
        num=7;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
