package SiniflarArasiIliskiler;

public class Instractor {
    private String name;
    private String surname;
    private String deparmant;

    public Instractor(String name, String surname, String deparmant) {
        this.name = name;
        this.surname = surname;
        this.deparmant = deparmant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDeparmant() {
        return deparmant;
    }

    public void setDeparmant(String deparmant) {
        this.deparmant = deparmant;
    }


}
