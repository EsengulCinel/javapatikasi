package Diziler;

public class Dizi {
    static int[] reverse(int[] listem) {
        int[] reverse = new int[listem.length];
        for (int i = 0, j = listem.length - 1; i < listem.length; i++, j--) {
                reverse[i]=listem[j];
        }
        return reverse;


    }
    static void print(int[] listem){

        for (int i=0; i<listem.length;i++){
            System.out.println(listem[i]);
        }
    }


    public static void main(String[] args) {

        //   int [] listem= new int[10];
        int[] listem = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] newListem = reverse(listem);
        print(listem);

    }
}
