package GenericSiniflar;

public class NullGeneric <T>{
    private final T value;

    public NullGeneric(T value) {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run() {
        if (isNull()) {

            System.out.println("deger atanmadi");
        } else
            System.out.println(this.getValue());
    }

}
