package Giris;

public class MetotFonk {
    static void Hello(){
        System.out.println("A ve S");
    }

    static int power(int base, int exp){
        int result =1;
        for (int i=1;i<=exp;i++){
            result *=base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
        Hello();
    }
}
