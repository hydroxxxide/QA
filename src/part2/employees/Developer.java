package part2.employees;

public class Developer extends Employee{

    private String[] technologyStack; //стек технологий
    private String type; //тип (front end, java backend, c# backend и тд)


    public Developer(String name, Integer salary, String employeePosition) {
        super(name, salary, employeePosition);
    }

    public String[] getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(String[] technologyStack) {
        this.technologyStack = technologyStack;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
