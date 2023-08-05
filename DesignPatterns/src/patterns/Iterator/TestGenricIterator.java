package patterns.Iterator;

public class TestGenricIterator {
    public static void main(String[] args) {
        var geneBrowserHistory = new GenericBrowserHistory<User>();
        geneBrowserHistory.push(new User("Passenger 1", 26));
        geneBrowserHistory.push(new User("Passenger 2", 28));

        var iterator = geneBrowserHistory.createIterator();

        while (iterator.hasNext()) {
            var curr = iterator.current();
            System.out.println("User Name " + curr.name);
            System.out.println("User Age " + curr.age);

            iterator.next();
        }

        var geneHistoryForEmployee = new GenericBrowserHistory<Employee>();

        geneHistoryForEmployee.push(new Employee("Rohan", 300000));
        geneHistoryForEmployee.push(new Employee("Hasan", 100000));

        var it = geneHistoryForEmployee.createIterator();

        while (it.hasNext()) {
            var curr = it.current();

            System.out.println("Employee Name " + curr.name);
            System.out.println("Employee Salary " + curr.salary);

            it.next();
        }

    }
}
