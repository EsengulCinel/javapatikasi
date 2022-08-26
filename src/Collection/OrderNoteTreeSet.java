package Collection;

import java.util.Comparator;

public class OrderNoteTreeSet implements Comparator<TreeSetStudent> {


    @Override
    public int compare(TreeSetStudent o1, TreeSetStudent o2) {



        return o1.getNote() - o2.getNote();

        //return 0 normalde aldığı elamanları sırasıyla karşılaştırıyor.
        //bu o1 ve o2'yi karşılaştırıcak. negatif bir değer çıkarsa o2'yi sıralamada başa alıcak demek.
    }
}
