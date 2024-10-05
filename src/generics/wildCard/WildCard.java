package generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void execute() {
        // 非境界ワイルドカードなのでなんでも追加可能
        // addは不可、取り出す際はObject型で取り出す
        List<?> wildCards = List.of(new Apple(), "いちご", 1);
        System.out.println("=== 非境界ワイルドカード ===");
        wildCards.forEach(wildCard-> System.out.println(wildCard.toString()));

        // 上限境界ワイルドカード
        // 指定されたクラスの下位互換を保証
        // 例示の場合、Apple以上のクラスは追加できない
        // 型安全を保つため要素の追加はできない
        List<? extends Apple> upperWildCards = List.of(new Apple(), new BlueApple());
        System.out.println("=== 上限境界ワイルドカード ===");
        Apple apple = upperWildCards.get(0);
        System.out.println(apple);
        BlueApple blueApple = (BlueApple) upperWildCards.get(1);
        System.out.println(blueApple);

        List<Apple> underWildCards = new ArrayList<>();
        underWildCards.add(new Apple());
        underWildCards.add(new BlueApple());

        System.out.println("=== 下限境界ワイルドカード ===");
        print(underWildCards);
    }

    /**
     * 下限境界ワイルドカード
     * Apple以下がジェネリクスに指定された変数は受け取れない
     * @param list list
     */
    private static void print (List<? super Apple> list) {
        list.forEach(System.out::println);
    }
}
