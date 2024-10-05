package generics.method;

import java.util.Set;

public class Method {
    public static void execute() {
        System.out.println("=== ジェネリクスメソッド ===");
        Set<String> s1 = Set.of("A", "B", "C");
        Set<String> s2 = Set.of("D", "E", "F");
        Set<String> result = Methods.union(s1, s2);
        result.forEach(System.out::println);
        System.out.println("=== 再起境界型 ===");
        Set<Integer> intSet = Set.of(5, 4, 3, 2, 1);
        System.out.println(Methods.max(intSet));
    }
}
