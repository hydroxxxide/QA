package part1;

import part1.Company;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class CompanyMenu {
    public static void main(Company company) {
        Employee[] employees = new Employee[10];
        Scanner in = new Scanner(System.in);
        employees[0] = new Employee("Maksim", 50000, "Менеджер");
        employees[1] = new Employee("Adelina", 50000, "Руководитель");
        employees[2] = new Employee("Ash", 50000, "Заместитель руководителя");

        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("5) Поменять руководителя компании");
            System.out.println("6) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Название - " + company.getName());
                System.out.println("Бюджет - " + company.getBudget());
                System.out.println("Директор - " + company.getDirector());
            } else if (command == 2) {
                System.out.println(Arrays.toString(company.getEmployees()));
            } else if (command == 3) {
                employees = company.getEmployees();
                double count = 0d;
                for (Employee employee : employees) {
                    if (employee != null) {
                        count = count + employee.getSalary();
                    }
                }
                System.out.println("Общие расходы на зарплаты сотрудников - " + count + " сом");
            } else if (command == 4) {
                System.out.println("Имя нового сотрудника: ");
                String name = in.next();
                System.out.println("Заработная плата нового сотрудника: ");
                Integer salary = in.nextInt();
                System.out.println("Должность нового сотрудника: ");
                String employeePosition = in.next();
                company.addEmployeesToCompany(new Employee(name, salary, employeePosition));
                System.out.println("Сотрудник успешно добавлен!");
            } else if (command == 5) {
                System.out.println("Введите имя сотрудника которого вы хотите удалить: ");
                String name = in.next();
                for (int i = 0; i < employees.length; i++) {
                    assert employees[i] != null;
                    if(Objects.equals(employees[i].getName(), name)){
                        System.out.println("Сотрудник " + employees[i].getName() + "уволен");
                        employees[i] = null;
                    }else{
                        System.out.println("Такого сотрудника нет");
                    }
                }
            } else if (command == 6) {
                System.out.println("Введите имя сотрудника на должность руководителя: ");
                String name = in.next();
                for (Employee employee : employees) {
                    assert employee != null;
                    if (Objects.equals(employee.getName(), name)) {
                        System.out.println("Сотрудник " + employee.getName() + "повышен до должности руководителя");
                        employee.setEmployeePosition("Руководитель");
                    } else {
                        System.out.println("Такого сотрудника нет");
                    }
                }
            } else if (command == 7) {
                String employeeName = in.nextLine();
                //Реализуйте поиск сотрудника по имени
                //P.S. метод getEmployeeByName() пустой нужно его заполнить
//                Employee foundedEmployee = company.getEmployeeByName(employeeName);
//                EmployeeMenu.main(foundedEmployee);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
