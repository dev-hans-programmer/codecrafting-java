package patterns.Iterator;

public interface GenericIterator<T> {
    boolean hasNext();

    T current();

    void next();
}
