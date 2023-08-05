package patterns.momento;

public class TestMomento {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Hasan");

        history.push(editor.createState());

        editor.setContent("Raina");

        history.push(editor.createState());

        editor.setContent("Raisan");
        history.push(editor.createState());

        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}
