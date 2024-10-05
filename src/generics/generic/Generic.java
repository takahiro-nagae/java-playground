package generics.generic;

public class Generic {
    public static void execute() {
        NonNullList<String> nonNullList = new NonNullList<>();
        nonNullList.add("apple");
        nonNullList.add("banana");
        nonNullList.add(null);
        nonNullList.add("grape");
        System.out.println("=== NonNullList ===");
        nonNullList.forEach(System.out::println);
    }
}
