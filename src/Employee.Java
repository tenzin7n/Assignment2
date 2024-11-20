public class Employee extends Person {
    private String employeeId;
    private String role;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, int age, String contact, String employeeId, String role) {
        super(name, age, contact);
        this.employeeId = employeeId;
        this.role = role;
    }

    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}