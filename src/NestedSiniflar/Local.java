package NestedSiniflar;

public class Local {

    public void run(){

        class Yerel {
            private int a;

            public Yerel(int a){
                this.a=a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y=new Yerel(12);
        System.out.println("Local nesnesi calisti");
    }

    public void print(){

    }
}
