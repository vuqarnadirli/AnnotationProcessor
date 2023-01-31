import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();

        Method[] methods = t.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }

}
