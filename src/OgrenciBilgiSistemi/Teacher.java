package OgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno, String branch){
        this.name=name; //this.name'i parametre olarak aldıgım name'e eşitledim.
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Adi: "+this.name);
        System.out.println("Numarasi :"+ this.mpno);
        System.out.println("Bolum: "+ this.branch);
    }
}
