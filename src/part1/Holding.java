package part1;

import part1.Company;

import java.util.Arrays;

public class Holding {
    private Company[] companies;
    public Holding() {
        companies = new Company[10];
    }
    public Holding(Company[] companies) {
        this.companies = companies;
    }
    public Company[] getCompanies() {
        return companies;
    }
    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }
    public void showCompanies () {
        for (Company company: companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getBudget() + " | " + company.getName());
            }
        }
    }
    public void deleteCompany(String nameCompany) {
        for (int i = 0; i < companies.length; i++) {
            if (this.companies[i] != null && this.companies[i].getName().equals(nameCompany)) {
                System.out.println(this.companies[i].getName() + " удалена");
                this.companies[i] = null;
            }
        }
    }

    public void getEmployeeList(Employee[] employees) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i <employees.length ; i++) {
            if (employees[i] != null) {
                count++;
            }else {
                count2++;
            }
        }
        System.out.println("Число рабочих мест : " + count);
        System.out.println("Число вакантных мест : " + count2);
    }
    public Company getCompanyByName (String name) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getName().equals(name)){
                System.out.println("Мы нашли компанию!");
                System.out.println(" " + companies[i].getName());
            }
        }
        return null;
    }
    public void holdingBudget() {
        Company[] companies = this.companies;
        double count = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                count = count + companies[i].getBudget();
            }
        }
        System.out.println(count);
    }
    public void calculateBudget(){
        double count = 0d;
        for (Company company : companies) {
            if (company != null) {
                count = count + company.getBudget();
            }
        }
    }

    @Override
    public String toString() {
        return "Holding{" +
                "companies=" + Arrays.toString(companies) +
                '}';
    }
}

