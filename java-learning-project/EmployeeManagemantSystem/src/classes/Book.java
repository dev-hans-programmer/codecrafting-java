package classes;

public class Book {
   String book;
   Student issuer;

   public Book(String book, Student issuer) {
      this.book = book;
      this.issuer = issuer;
   }

   public String getBook() {
      return book;
   }

   public void setBook(String book) {
      this.book = book;
   }

   public Student getIssuer() {
      return issuer;
   }

   public void setIssuer(Student issuer) {
      this.issuer = issuer;
   }

}
