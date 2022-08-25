package GenericInterface;

public class Student<T> implements IDatabase<T> {


    @Override
    public boolean insert(T data) {
        System.out.println("eklendi");
        return false;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("silindi");

        return false;
    }

    @Override
    public boolean update(T data) {
        System.out.println("guncellendi");

        return false;
    }

    @Override
    public T select() {
        System.out.println("secildi");
        return null;

    }
}
