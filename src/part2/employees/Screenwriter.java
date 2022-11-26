package part2.employees;

public class Screenwriter extends Employee{ //Сценарист
    private String[] listOfGenres; //список жанров

    public Screenwriter(String name, Integer salary, String employeePosition, String[] listOfGenres) {
        super(name, salary, employeePosition);
        this.listOfGenres = listOfGenres;
    }

    public String[] getListOfGenres() {
        return listOfGenres;
    }

    public void setListOfGenres(String[] listOfGenres) {
        this.listOfGenres = listOfGenres;
    }

    public void writeScript(){ //Сценарист пишет сценарии для фильмов
        System.out.println("Сценарий написан!");
    }
}
