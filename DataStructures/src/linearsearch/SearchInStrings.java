package linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Hasan Ali";
        System.out.println("Found " + search(name, 'h'));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return true;
        }
        return false;
    }
}
