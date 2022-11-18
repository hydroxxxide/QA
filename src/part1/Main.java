package part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Holding holding = new Holding();
        Company company = new Company();
        Employee employee = new Employee();



        while(true){
            System.out.println("1 - Меню холдинга");
            System.out.println("2 - Меню компаний");
            System.out.println("3 - Меню работника");
            int command = scan.nextInt();
            if(command == 1){
                MainMenu.main(holding);
            }else if(command == 2){
                CompanyMenu.main(company);
            }else if(command == 3){
                EmployeeMenu.main(employee);
            }else{
                break;
            }
        }
    }
}
