package harun;

public class Ogretmen extends  Person{
    private String okul;
    public Ogretmen(String name, String surname,String okul) {
        super(name, surname);
        this.okul=okul;
    }

    @Override
    public void ozelBilgiVer() {
        System.out.println("Ogretmen okul:"+okul);
    }
}
