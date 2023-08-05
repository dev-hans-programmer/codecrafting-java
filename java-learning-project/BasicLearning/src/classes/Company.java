package classes;

public class Company {
    Employee [] employees = new Employee[10];
    int index = -1;


    public void addEmployee(Employee employee){
        index++;
        employees[index] = employee;//// Array syntax
        
    }

    public void countEmployee(){
        System.out.println("There are "+(index + 1)+ " employees in the company");
    }
    public void printHighestSalary(){
        double highestSalary = employees[0].salary;

        for(int i = 1; i <= index; i++){
            if(employees[i].salary > highestSalary){
                highestSalary = employees[i].salary;
            }
        }
        System.out.println("The highest salary is "+highestSalary);
    }
}
