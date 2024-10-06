import annotation.RunTest;
import boxing.Boxing;
import generics.GenericsExecute;
import lambda.Lambda;

public class Main {
    public static void main(String[] args) throws Exception {
        GenericsExecute.execute();
        RunTest.execute("annotation.Sample");
        Lambda.execute();
        Boxing.execute();
    }
}