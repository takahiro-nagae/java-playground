package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTest {
    public static void execute(String className) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(className);
        System.out.println("=== アノテーション ===");
        for (Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Test.class)) {
                tests ++;
                try {
                    m.invoke(null);
                    passed ++;
                } catch (InvocationTargetException wrappedExec) {
                    Throwable exc = wrappedExec.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.println("Passed: " + passed + ", Failed: " + (tests - passed));
    }
}
