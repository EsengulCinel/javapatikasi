package JAVA102;

public class Main {
    public static void main(String[] args) {
//First a = new First("Hello");
//a.showStr();
//Player p1=new Player("esen",23);
//p1.showName();
//Player.showName();

        Course mat = new Course("MATEMATIK", "MAT-101", 70);
        Course fizik = new Course("FIZIK", "FIZIK-101", 20);
        Course kimya = new Course("KIMYA", "KIMYA-101", 100);

        //  int[] notlar = {70, 20, 100};
        // int[] notlar={mat.note,fizik.note,kimya.note};
        Course[] dersler={mat,fizik,kimya};
        Calculate.calcAvarege(dersler);

    }

}
