package generics.wildCard;

class Apple extends Fruit {
    Apple() {
        super("赤色", "リンゴ", "やや酸味が強い");
    }

    Apple(String color, String name, String taste) {
        super(color, name, taste);
    }
}
