package issue12451;

public class JavaHelper {
    public JavaHelper() {
        System.out.printf("JavaHelper() sees %d%n", GroovyHelper.STATIC_LONG);
    }
}
