package generics;

import generics.container.Container;
import generics.generic.Generic;
import generics.method.Method;
import generics.wildCard.WildCard;



public class GenericsExecute {
    public static void execute() {
        Generic.execute();
        WildCard.execute();
        Method.execute();
        Container.execute();
    }
}
