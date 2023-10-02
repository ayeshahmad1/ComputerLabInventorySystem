public class Employee {
    private String employeeID;
    private String name;
    private final String designation = "Lab Attendant";

    public String getEmployeeID() {
        return employeeID;
    }

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }
    public Employee(){
        this.employeeID =null;
        this.name =null;
    }
}
