package part2.employees;

public class Producer extends Employee{

    private String[] listOfAnimationProducts; //список анимационных продуктов

    public Producer(String name, Integer salary, String employeePosition, String[] listOfAnimationProducts) {
        super(name, salary, employeePosition);
        this.listOfAnimationProducts = listOfAnimationProducts;
    }

    public String[] getListOfAnimationProducts() {
        return listOfAnimationProducts;
    }

    public void setListOfAnimationProducts(String[] listOfAnimationProducts) {
        this.listOfAnimationProducts = listOfAnimationProducts;
    }
}
