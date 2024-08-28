package linkedinList;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        var list = new CustomLinkedinList();

        list.addFirst(30);

        list.addFirst(20);
        list.addFirst(40);
        // System.out.println(list.size());

        list.traverse();
        System.out.println();
        System.out.println("---REVERSE---");

        list.reverse();
        list.traverse();

    }
}
