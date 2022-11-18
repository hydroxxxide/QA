package part1;

import java.util.Arrays;

public class Company {
    private String name;
    private Employee[] employees;
    private Integer budget;
    private String director;
    //Нужно добавить:
    //Бюджет холдинга
    //Руководителя компании

    public Company(String name, Integer budget, String director) {
        this.name = name;
        this.budget = budget;
        this.director = director;
    }
    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    public Company() {

    }


    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public void addEmployeesToCompany(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i] = employee;
                return;
            }
        }
    }
    public Employee getEmployeeByName(String name) {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (employees[i].getName().equals(name)) {
                    System.out.println("Сотрудник с таким именем найден");
                } else {
                    System.out.println("Сотрудник с таким именем не найден");
                } return employees[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "part1.Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", budget=" + budget +
                ", director='" + director + '\'' +
                '}';
    }
}