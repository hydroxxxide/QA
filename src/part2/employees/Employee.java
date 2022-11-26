package part2.employees;

public class Employee {
    private String name;
    private Integer salary;
    private String employeePosition;
    // Нужно добавить:
    // Зароботную плату
    // Позицию на которой работает сотрудник
    public Employee(String name,Integer salary,String employeePosition) {
        this.name = name;
        this.salary = salary;
        this.employeePosition = employeePosition;
    }

    public Employee() {
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "part1.Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", employeePosition='" + employeePosition + '\'' +
                '}';
    }
}