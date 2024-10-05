package generics.method;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class Methods {
    static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    static <E extends Comparable<E>> E max(Collection<E> set) {
        E result = null;
        for (E e : set) {
            if (result == null || e.compareTo(result) > 0) {
                result = e;
            }
        }
        return result;
    }
}
