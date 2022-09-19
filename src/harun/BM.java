package harun;

public class BM extends Person{
    private String sirket;
    public BM(String name, String surname,String sirket) {
        super(name, surname);
        this.sirket=sirket;
    }

    @Override
    public void ozelBilgiVer() {
        System.out.println("BM sirket"+sirket);
    }
}
