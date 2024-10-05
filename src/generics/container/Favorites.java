package generics.container;

import java.util.HashMap;
import java.util.Map;

class Favorites {
    private final Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<T> type, T value) {
        this.favorites.put(type, value);
    }

    public <T> T getFavorites(Class<T> type) {
        return type.cast(this.favorites.get(type));
    }
}
