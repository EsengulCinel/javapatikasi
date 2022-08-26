package Collection;

import GenericInterface.Student;

import java.util.TreeSet;

public class TreeSetOrn {
    public static void main(String[] args) {

        TreeSet<TreeSetStudent> students = new TreeSet<>(new OrderNoteTreeSet().reversed());  //tree set içine bir comparator verdik bunu kullanacak
                                                                                                //.reversed() ile tam tersini yazdırabiliriz. sil istersen :D

        students.add(new TreeSetStudent("as",12));
        students.add(new TreeSetStudent("sa",13));
        students.add(new TreeSetStudent("nbr",45));
        students.add(new TreeSetStudent("ii",32));
        students.add(new TreeSetStudent("okbb",100));

        for(TreeSetStudent stu : students){
            System.out.println(stu.getName());
        }




    }
}
