package JAVA102;

public class Daire {
    public int r;
    public final double pi = 3.14;

    Daire(int r) {
        this.r = r;
    }

    public void calArea() {
        double alan = pi * this.r * this.r;
        System.out.println(alan);
    }
}
