package GenericSiniflar;

public class GenericMain {
    public static void main(String[] args) {
        String s =null;
        Nullable nullable = new Nullable(s);
        nullable.run();


        Integer a=null;
        NullableInt nullableInt=new NullableInt(a);
        nullableInt.run();

    }
}
