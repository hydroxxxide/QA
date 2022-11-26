package part2.companies;

import part2.employees.Employee;

public class AniCompany extends Company{
    private Integer adIncome; //доходы с рекламы
    private Integer officeExpenses;//расходы на офис
    private Integer technicalExpenses; //расходы на технику
    private Integer salaryExpenses; //расходы на зп

    public AniCompany(String name,
                      Employee[] employees,
                      Integer budget,
                      String director,
                      Integer adIncome,
                      Integer officeExpenses,
                      Integer technicalExpenses,
                      Integer salaryExpenses) {
        super(name, employees, budget, director);
        this.adIncome = adIncome;
        this.officeExpenses = officeExpenses;
        this.technicalExpenses = technicalExpenses;
        this.salaryExpenses = salaryExpenses;
    }

    public Integer getAdIncome() {
        return adIncome;
    }

    public void setAdIncome(Integer adIncome) {
        this.adIncome = adIncome;
    }

    public Integer getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(Integer officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public Integer getTechnicalExpenses() {
        return technicalExpenses;
    }

    public void setTechnicalExpenses(Integer technicalExpenses) {
        this.technicalExpenses = technicalExpenses;
    }

    public Integer getSalaryExpenses() {
        return salaryExpenses;
    }

    public void setSalaryExpenses(Integer salaryExpenses) {
        this.salaryExpenses = salaryExpenses;
    }

    public void createShortFilm(){ //производство коротких фильмов под заказ
        System.out.println("Короткометражка выпущена!");
    }
}
