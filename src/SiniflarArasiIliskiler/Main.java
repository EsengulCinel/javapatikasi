package SiniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("A", "A", "111", "A", 10);
        Student st2 = new Student("B", "B", "222", "B", 100);
        Student st3 = new Student("C", "C", "333", "C", 50);

        //   System.out.println(st2.getNote());
        Instractor teacher = new Instractor("Mahmut", "Hoca", "CENG");

        //Course has a Instractor [composition ya da aggration Birleştirme deniliyor.]
        Course mat = new Course("MAT101", "101", teacher);
        System.out.println(mat.getInstractor().getName());
        //  Student[] stu = {st1, st2, st3};
        // System.out.println("Ortalama: " + mat.calcAvarege(stu));

    }


}
