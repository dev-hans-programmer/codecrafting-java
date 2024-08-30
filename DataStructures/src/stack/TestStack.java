package stack;

public class TestStack {
    public static void main(String[] args) {
        var stack = new CustomStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
    }
}
