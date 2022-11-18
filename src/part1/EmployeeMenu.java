package part1;

import part1.Employee;

import java.util.Scanner;
public class EmployeeMenu {
    public static void main(Employee employee) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("Имя сотрудника - " + employee.getName());
                System.out.println("Заработная плата сотрудника - " + employee.getSalary());
                System.out.println("Позиция сотрудника - " + employee.getEmployeePosition());

                //Реализуйте вывод информации о сотруднике
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}