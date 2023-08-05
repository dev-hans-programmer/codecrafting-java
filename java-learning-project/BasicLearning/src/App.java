// import java.util.Scanner;

// import classes.Student;
// import classes.StudentRecord;

import classes.Company;
import classes.Employee;

public class App {
    public static void main(String[] args) throws Exception {
    //    var records = new StudentRecord();

    //    var riti = new Student("Riti Azad", 23);
    //    var hasan = new Student("Hasan Ali", 24);

    //    records.addStudent(riti);
    //    records.addStudent(hasan);
    //    records.printStudentsCount();
    //    records.removeStudent("Raina Azad");

        var riti = new Employee("Riti Azad", 23, 50000);
        var raina = new Employee("Raina Azad", 25, 20000);
        var hasan = new Employee("Hasan ali",25,30000);

        var mindtree = new Company();
        mindtree.addEmployee(riti);
        mindtree.addEmployee(raina);
        mindtree.addEmployee(hasan);

        mindtree.countEmployee();
        mindtree.printHighestSalary();

    }
}
