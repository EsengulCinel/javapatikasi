package GenericMetotlar;

public class Print {

    public static <T> void pringArray(T[] arr){

        for(T i: arr){
            System.out.println(i);
        }

    }
}
