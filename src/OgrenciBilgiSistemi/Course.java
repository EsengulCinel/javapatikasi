package OgrenciBilgiSistemi;

import java.util.SplittableRandom;

public class Course {
    Teacher teach; //teacher sınıfından nesne böyle de oluşturabiliriz.
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;
    }

    void addTeacher(Teacher teach) {
        if (teach.branch.equals(this.prefix)) {
            this.teach = teach;
         //   printTeacherInfo();

        } else {
            System.out.println("Ogretmen ve dersler bolumleri uyusmuyor");
        }

    }

    void printTeacherInfo() {
        this.teach.print();
    }
}
