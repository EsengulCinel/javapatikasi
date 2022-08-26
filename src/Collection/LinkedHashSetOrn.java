package Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetOrn {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(12);
        lSet.add(12);
        lSet.add(22);
        lSet.add(23);

        Iterator<Integer> itr= lSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
