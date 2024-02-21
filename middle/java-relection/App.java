import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        Girl girl = new Girl();

        for(Field field : girl.getClass().getDeclaredFields()){
            System.out.println();
            System.out.println("Field: " +field.getName());
            System.out.println("Type: " +field.getType());
        }

        Field nameField = girl.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(girl, "b");
        System.out.println(girl);
    }
}
