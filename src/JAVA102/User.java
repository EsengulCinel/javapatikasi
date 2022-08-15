package JAVA102;

public class User {
    public String name;
    public static int counter = 0;

    static {
        int random = (int) (Math.random() * 10);
        System.out.println("random sayi: "+ random);

        counter=random;
    }

    User(String name) {
        this.name = name;
        counter++;
    }

//    {
//        System.out.println("ben bir statik kod bloguyum");
//    }
}
