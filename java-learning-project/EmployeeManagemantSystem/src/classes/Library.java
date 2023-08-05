package classes;

public class Library {
    private static final int MAX_CAPACITY = 10;

    private Student[] students = new Student[MAX_CAPACITY];
    private Book[] books = new Book[MAX_CAPACITY];
    private int bookCount = 0;
    private int studentCount = 0;

    public void addStudent(Student student) {
        if (studentCount < MAX_CAPACITY) {
            students[studentCount++] = student;
        } else {
            System.out.println("Library student capacity reached.");
        }
    }

    public void addBook(Book book) {
        if (bookCount < MAX_CAPACITY) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library book capacity reached.");
        }
    }

    public void countStudents() {
        System.out.println("There are " + studentCount + " students in the library.");
    }

    public void issueBook(String bookName, String studentName) {
        Book desiredBook = findBookByName(bookName);

        if (desiredBook == null) {
            System.out.println("No book found named " + bookName);
            return;
        }

        if (desiredBook.getIssuer() != null) {
            System.out.println("Sorry! The book is already issued by " + desiredBook.getIssuer().getName());
            return;
        }

        Student desiredStudent = findStudentByName(studentName);
        if (desiredStudent == null) {
            System.out.println("Sorry! " + studentName + " is not registered.");
            return;
        }

        desiredBook.setIssuer(desiredStudent);
        System.out.println("Congrats! " + studentName + " has issued the book.");
    }

    private Book findBookByName(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBook().equals(bookName)) {
                return books[i];
            }
        }
        return null;
    }

    private Student findStudentByName(String studentName) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null;
    }
}
