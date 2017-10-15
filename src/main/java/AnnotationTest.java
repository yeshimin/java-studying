import java.lang.annotation.Documented;

/**
 * Created by ysm on 17-10-13.
 */
public class AnnotationTest implements Interface1 {

    public void a() {
        System.out.println("AnnotationTest.a()");
    }

    public static void main(String[] ars) {
        new AnnotationTest().a();

        java.lang.reflect.AnnotatedElement a;
    }
}
