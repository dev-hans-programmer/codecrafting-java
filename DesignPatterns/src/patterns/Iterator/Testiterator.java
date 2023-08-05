package patterns.Iterator;

public class Testiterator {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("https://www.google.com");
        browseHistory.push("https://www.lacritz.com");
        browseHistory.push("https://www.flits.ai");
        browseHistory.push("https://www.getIntoPc.com");
        browseHistory.push("https://www.web.telegram.com");

        // Now need to see how to iterate through the urls;
        // for that we need to export a method from that class which exposes
        // the urls property as the urls property is a private field.
        var urls = browseHistory.getUrls();
        for (var i = 0; i < urls.size(); i++) {
            System.out.println(urls.get(i));
        }

        System.out.println("Now printing all the values with iterator pattern");

        var iterator = browseHistory.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
