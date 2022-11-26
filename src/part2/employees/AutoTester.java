package part2.employees;

public class AutoTester extends Employee{

    private String programmingLanguage; //язык программирования для авто-тестов

    public AutoTester(String name, Integer salary, String employeePosition) {
        super(name, salary, employeePosition);
    }

    public AutoTester() {
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
