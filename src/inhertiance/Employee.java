package inhertiance;

// must use the extends keyword to use person as a parent class
public class Employee extends  Person {

    private String employeeId;
    private String title;

    public Employee(){
        super("Peter");
    }





    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
