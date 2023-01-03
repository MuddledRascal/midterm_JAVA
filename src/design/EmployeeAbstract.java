package design;

public abstract class EmployeeAbstract implements Employee{

    final private static String COMPANY_NAME = "Best Buy";

    private String name; //OK

//    private String department; //OK

    private int employeeID; //OK
    private int hourlyRate; //OK


    public void setEmployeeName(String newName){
        name = newName;
    }

    public void setEmployeeID(int employeeId){
        employeeID = employeeId;
    }

    @Override
    public int employeeId() {
        return employeeID;
    }

    @Override
    public String employeeName() {
        return name;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
}


