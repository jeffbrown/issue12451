package issue12451

class GroovyHelper {
    public final static long STATIC_LONG = 123

    GroovyHelper() {
        println "GroovyHelper() sees $STATIC_LONG"
    }
}
