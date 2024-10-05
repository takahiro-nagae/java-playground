package generics.generic;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class NonNullList<E> extends AbstractList<E> {
    private final List<E> list = new ArrayList<>();

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean add(E value) {
        if (value == null) {
            return false;
        }
        this.list.add(value);
        return false;
    }

    @Override
    public E get(int index) {
        return this.list.get(index);
    }
}
