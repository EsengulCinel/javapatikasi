package SiniflarArasiIliskiler;

public class Course {
    private String courseName;
    private String code;

    private Instractor instractor;  //başka bir sınıfın veri tipini tutucaz.

    Course(String courseName, String code,Instractor instractor) {
        this.courseName = courseName;
        this.code = code;
        this.instractor=instractor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instractor getInstractor() {
        return instractor;
    }

    public void setInstractor(Instractor instractor) {
        this.instractor = instractor;
    }

    //Course uses a Student
    public double calcAvarege(Student[] students) { //veri tipi Studens sınıfı olan bir dizi alsın parametre olarak
        double avarege = 0.0;
        for (int i = 0; i < students.length; i++) {
            avarege += students[i].getNote();
        }
        return avarege / students.length;
    }
}
