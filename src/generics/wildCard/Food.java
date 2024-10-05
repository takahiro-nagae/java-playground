package generics.wildCard;

class Food {
    private final String color;
    private final String name;
    private final String taste;
    private final String type;

    Food(String color, String name, String taste, String type) {
        this.color = color;
        this.name = name;
        this.taste = taste;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food [color=" + color + ", name=" + name + ", taste=" + taste + ", type=" + type + "]";
    }

    String getColor() {
        return color;
    }

    String getName() {
        return name;
    }

    String getTaste() {
        return taste;
    }

    String getType() {
        return type;
    }
}
