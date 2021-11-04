package InterfacsAbstractLec;

abstract class Employee {

    // initializing variables
    protected String name;
    protected String department;

    // employee contructor
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // getter for name
    public String getName() {
        return  this.name;
    }

    // getter for department
    public String getDepartment() {
        return this.department;
    }

    public abstract String work();



}
