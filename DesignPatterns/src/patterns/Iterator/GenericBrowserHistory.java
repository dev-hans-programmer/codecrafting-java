package patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class GenericBrowserHistory<T> {
    private List<T> urls = new ArrayList<>();

    public void push(T url) {
        urls.add(url);
    }

    public T pop() {
        var lastIndex = urls.size() - 1;
        var lastItem = urls.get(lastIndex);
        urls.remove(lastItem);
        return lastItem;
    }

    public ListIterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements GenericIterator<T> {

        private GenericBrowserHistory<T> browserHistory;
        private int index;

        public ListIterator(GenericBrowserHistory<T> browserHistory) {
            this.browserHistory = browserHistory;

        }

        @Override
        public boolean hasNext() {
            return (index < browserHistory.urls.size());
        }

        @Override
        public T current() {
            return urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }

    }
}
