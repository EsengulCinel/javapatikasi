package GenericInterface;

public interface IDatabase <T>{

    public boolean insert(T data); //örneğin veritanına veri ekliycek

    public boolean delete(T data); //silecek

    public boolean update(T data);

    public T select();

}
