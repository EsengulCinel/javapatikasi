package harun;

public abstract class Person {

    private String name;

    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void ozelBilgiVer();
    public void bilgiVer() {
        System.out.println("Name :"+name+" Surname:"+surname);
        ozelBilgiVer();
    }


}
