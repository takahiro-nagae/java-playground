package generics.container;

public class Container {
    public static void execute() {
        Favorites favorites = new Favorites();
        favorites.putFavorites(String.class, "Java");
        favorites.putFavorites(Integer.class, 100);
        favorites.putFavorites(Class.class, Favorites.class);

        String favoriteString = favorites.getFavorites(String.class);
        Integer favoriteInteger = favorites.getFavorites(Integer.class);
        Class<?> favoriteClass = favorites.getFavorites(Class.class);
        System.out.println("=== コンテナ ===");
        System.out.println(favoriteString);
        System.out.println(favoriteInteger);
        System.out.println(favoriteClass);
    }
}
