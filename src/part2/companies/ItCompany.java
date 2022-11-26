package part2.companies;

import part2.employees.*;

public class ItCompany extends Company{

    private Integer outsourcingIncome; //доходы с аутсорсинга
    private Integer outstaffingIncome; //доходы с аутстаффинга
    private Integer salaryExpenses; //расходы на зп
    private Integer technicalExpenses; //расходы на технику
    private Integer officeExpenses;//расходы на офис
    private ProjectManager projectManager;
    private Developer developer;
    private ManualTester manualTester;
    private AutoTester autoTester;

    public ItCompany(String name,
                     Employee[] employees,
                     Integer budget,
                     String director,
                     Integer outsourcingIncome,
                     Integer outstaffingIncome,
                     Integer salaryExpenses,
                     Integer technicalExpenses,
                     Integer officeExpenses,
                     ProjectManager projectManager,
                     Developer developer,
                     ManualTester manualTester,
                     AutoTester autoTester) {
        super(name, employees, budget, director);
        this.outsourcingIncome = outsourcingIncome;
        this.outstaffingIncome = outstaffingIncome;
        this.salaryExpenses = salaryExpenses;
        this.technicalExpenses = technicalExpenses;
        this.officeExpenses = officeExpenses;
        this.projectManager = projectManager;
        this.developer = developer;
        this.manualTester = manualTester;
        this.autoTester = autoTester;
    }

    public Integer getOutsourcingIncome() {
        return outsourcingIncome;
    }

    public void setOutsourcingIncome(Integer outsourcingIncome) {
        this.outsourcingIncome = outsourcingIncome;
    }

    public Integer getOutstaffingIncome() {
        return outstaffingIncome;
    }

    public void setOutstaffingIncome(Integer outstaffingIncome) {
        this.outstaffingIncome = outstaffingIncome;
    }

    public Integer getSalaryExpenses() {
        return salaryExpenses;
    }

    public void setSalaryExpenses(Integer salaryExpenses) {
        this.salaryExpenses = salaryExpenses;
    }

    public Integer getTechnicalExpenses() {
        return technicalExpenses;
    }

    public void setTechnicalExpenses(Integer technicalExpenses) {
        this.technicalExpenses = technicalExpenses;
    }

    public Integer getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(Integer officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public ManualTester getManualTester() {
        return manualTester;
    }

    public void setManualTester(ManualTester manualTester) {
        this.manualTester = manualTester;
    }

    public AutoTester getAutoTester() {
        return autoTester;
    }

    public void setAutoTester(AutoTester autoTester) {
        this.autoTester = autoTester;
    }

    public void doOutsource(){ //разработка ПО под заказ
        System.out.println("Мы разработали ПО!");
    }
    public void doOutstaff(){ //предоставление своих специалистов в другие компании
        System.out.println("Мы предоставиили вам своего специалиста!");
    }
}
