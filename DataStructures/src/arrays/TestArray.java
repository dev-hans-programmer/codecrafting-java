package arrays;

public class TestArray {
    public static void main(String[] args) {
        var arr = new CustomArray(2);
        arr.insert(10);
        arr.insert(20);
        arr.print();
        // System.out.println(arr.indexOf(30));
        arr.removeAt(1);
        System.out.println("GAP----");
        arr.print();
        arr.removeAt(0);
        System.out.println("GAP----");
        arr.print();
        arr.removeAt(0);
    }
}
