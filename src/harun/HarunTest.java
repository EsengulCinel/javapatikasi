package harun;

import java.util.ArrayList;
import java.util.List;

public class HarunTest {

    public static void main(String[] args) {
        System.out.println(InterfaceExample.TCKN_KARAKTER_SINIRI);
        List<InterfaceExample> list = new ArrayList<>();
        list.add(new IntefaceTureyen2());
        list.add(new InterfaceTureyen1());
        for (InterfaceExample e : list) {
            e.topla(1, 2);
        }
        Person person = new BM("enes", "dongez", "Jforce");
        Person teacher = new Ogretmen("bilgisayar", "muhendis", "atauni");

        person.bilgiVer();

        teacher.bilgiVer();

    }
}
