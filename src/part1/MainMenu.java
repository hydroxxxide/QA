package part1;

import part1.Holding;

import java.util.Scanner;
public class MainMenu {
    public static void main(Holding holding) {
        Scanner in = new Scanner(System.in);
        Employee[] employee = new Employee[10];
        while (true) {
            System.out.println("Главное меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                holding.showCompanies();
            } else if (command == 2) {
                holding.calculateBudget();
            } else if (command == 3) {
                holding.getEmployeeList(employee);
            } else if (command == 4) {
                holding.addCompany(new Company("Beeline", 120000, "Ash"));
                holding.addCompany(new Company("Megacom", 80000, "Dasha"));
                holding.addCompany(new Company("Apple", 200000, "Sasha"));
            } else if (command == 5) {
                holding.deleteCompany(in.next());
                System.out.println();
            } else if (command == 6) {
                String companyName = in.nextLine();
                //Реализуйте поиск компании по имени
                //P.S. метод getCompanyByName() пустой нужно его заполнить
                part1.Company foundedCompany = holding.getCompanyByName(companyName);
                part1.CompanyMenu.main(foundedCompany);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
