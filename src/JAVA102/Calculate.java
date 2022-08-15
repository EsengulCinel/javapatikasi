package JAVA102;

public class Calculate {
    public static void calcAvarege(Course[] notes) {
        double total = 0;
        for (Course i : notes) {
            total += i.note;
        }
        double avg = total / notes.length;
        System.out.println("Ortalamaniz: " + avg);
    }
}
