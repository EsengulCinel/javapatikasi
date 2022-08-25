package GenericSiniflar;

public class NullGenericMain {
    public static void main(String[] args) {

//        NullGeneric<Integer> n=new NullGeneric<>(30);
//
//        NullGeneric<String> a=new NullGeneric<>("sad");
//
//        n.run();
//        a.run();

        Integer x = 12;
        String c = "wqe";
        Double d = 3.12;

        Obj<Integer, String, Double> o = new Obj<>(x, c, d);
        o.showInfo();
    }
}
