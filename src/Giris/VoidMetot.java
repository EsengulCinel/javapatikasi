package Giris;

public class VoidMetot {
    static void show() {
        System.out.println("Show metodu..");
        return;
    }

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return;
    }

    static void print() {
        System.out.println("bos olan");

    }
    static void print(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        show();
        sum(4, 5);
        print();
        print(2, 4);
    }
}
