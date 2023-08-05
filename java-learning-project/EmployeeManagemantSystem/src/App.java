import classes.Book;
import classes.Library;
import classes.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating two students
        var riti = new Student("Riti");
        var raina = new Student("Raina");

        // Creating two books
        var dsa = new Book("DSA", null);
        var history = new Book("History", null);

        // Creating the libary

        var gmitLibrary = new Library();

        gmitLibrary.addBook(dsa);
        gmitLibrary.addBook(history);

        gmitLibrary.addStudent(riti);
        gmitLibrary.addStudent(raina);

        gmitLibrary.issueBook(dsa.getBook(), riti.getName());
        gmitLibrary.issueBook(dsa.getBook(), raina.getName());

    }
}
