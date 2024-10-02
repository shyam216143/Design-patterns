public class Manager implements Employee{
    public int getSalary(){
        System.out.println("Manager Salary");
        return 2000000;
    }

    public String name(){
        System.out.println("Manager Name");
        return "Manager"
    }
}