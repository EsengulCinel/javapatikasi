package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("aliHOCA","123","TRH");
        Teacher t2=new Teacher("grahambell","0000","FZK");
        Teacher t3=new Teacher("mahmutHoca","856","BIO");

        Course tarih=new Course("TARIH","101","TRH");
        tarih.addTeacher(t1);

        Course fizik =new Course("FIZIK","102","FZK");
        fizik.addTeacher(t2);

        Course bio=new Course("BIYOLOJI","123","BIO");
        bio.addTeacher(t3);

        Student std=new Student("ayse","852","TRH",fizik,tarih,bio);

        std.addBulkExamNote(50,51,56);
        std.isPass();

    }
}
