package Encapsulation;

public class Book {
    private String name;
    private int pageNumber;

    public Book(String name, int pageNumber) {
        this.name = name;
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }

    public Book(String küçük_prens, int pageNumber, String s, String s1) {
    }

    public int showPageNumber() {
        return this.pageNumber;
    }

    public void changePageNumber(int pageNumber) {
        if (pageNumber < 0) {
            pageNumber = 0;
        }
         this.pageNumber = pageNumber;
    }

    public String getName(){
       return this.name=name;
    }
    public void setName(String name){
         this.name=name;
    }
}
