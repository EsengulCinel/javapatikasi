package JAVA102;

public class Player {

    public String name;
    public int idno;
    public static int count = 0;

    public Player(String name, int idno) {
        this.name = name;
        this.idno = idno;
    }

    public  static void showName() {
        System.out.println(count);
    }

}
