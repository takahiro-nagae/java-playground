package generics.wildCard;

class Fruit extends Food {


    Fruit(String color, String name, String taste) {
        super(color, name, taste, "フルーツ");
    }

    void fruitEat() {
        System.out.println(getName() + "を食べる");
    }

    @Override
    public String toString() {
        return "Fruit [color=" + getColor() + ", name=" + getName() + ", taste=" + getTaste() + ", type=" + getType() + "]";
    }
}
