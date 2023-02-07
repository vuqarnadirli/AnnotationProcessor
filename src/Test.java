import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher();

//        Method[] methods = t.getClass().getDeclaredMethods();
//        for (int i = 0; i < methods.length; i++) {
//            System.out.println(methods[i].getName());
//        }

        Method[] methods = t.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {

            Method m = methods[i];

            Annotation[] annotations = m.getAnnotations();
            System.out.println(methods[i].getName());

            for (int j = 0; j < annotations.length; j++) {
                Annotation ann = annotations[j];
                System.out.println("ann = " + ann.annotationType());
            }

            System.out.println("-------------------------------");
        }

    }
}