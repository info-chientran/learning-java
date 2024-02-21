import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        Outfit shirt = new Shirt();
        Persion persion = new Persion(shirt);
    }
}
