package part2.employees;

public class ProjectManager extends Employee{

    private String[] listOfProjects; //список проектов

    public ProjectManager(String name, Integer salary, String employeePosition, String[] listOfProjects) {
        super(name, salary, employeePosition);
        this.listOfProjects = listOfProjects;
    }

    public ProjectManager(String[] listOfProjects) {
        this.listOfProjects = listOfProjects;
    }

    public String[] getListOfProjects() {
        return listOfProjects;
    }

    public void setListOfProjects(String[] listOfProjects) {
        this.listOfProjects = listOfProjects;
    }
}
