package part2.employees;

public class Animator extends Employee{
    private String[] listOfSkills; //список умений

    public Animator(String name, Integer salary, String employeePosition, String[] listOfSkills) {
        super(name, salary, employeePosition);
        this.listOfSkills = listOfSkills;
        listOfSkills[0] = drawFace();
        listOfSkills[1] = drawBackground();

    }

    public String[] getListOfSkills() {
        return listOfSkills;
    }

    public void setListOfSkills(String[] listOfSkills) {
        this.listOfSkills = listOfSkills;
    }


//умения
    public String drawFace(){
        System.out.println("Лицо нарисовано");
        return null;
    }
    public String drawBackground(){
        System.out.println("Задник нарисован");
        return null;
    }
}
