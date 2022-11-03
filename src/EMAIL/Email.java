package EMAIL;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix="company.com";
    private int mailBoxCapacity =100;
    private String alternativeEmail;


    //our constructor to receive the firstname lastname . that's why we are using const :D
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email created :" + this.firstName + " " + this.lastName);


        //return the departnment
        this.department=setDepartment();
        System.out.println("department :" +this.department);

        //return a random password
        this.password=randomPassword(8);
        System.out.println("your password : " +this.password);

        //email i oluştrumak için gerekli ögeleri birleştirilelim
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department + "."+ companySuffix;
        System.out.println("Your email created : " + email);
    }


    //ask to departman and return the departman
    public String setDepartment() {

        System.out.print("enter a department \n1 for sales \n2 for development \n3 for accounting \n0 none: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) { return "sales"; }
        else if (departmentChoice == 2) {  return "development"; }
        else if (departmentChoice == 3) {return "accounting"; }
        else { return ""; }
    }

    //generate random password
    private String randomPassword(int length){  //uzunluğu parameter olarak alalım

        String passwordSet="ASDFGHJKLQWERTYUIOPZXCVBNM1234567890!!!!";
        char[] password=new char[length];
        for(int i=0; i<length;i++){
            int rand=  (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String (password);
    }
    //set the mailbox capacity
    //default deger old. için const eklemedik
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    //set the alternate mail
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail=altEmail;
    }
    //change password
    public void changePassword(String pass){
        this.password=pass;
    }

    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getAlternativeEmail() { return alternativeEmail; }
    public String getPassword() { return password;   }



    public void showInfo(){
         System.out.println( "DISPLAY NAME: " + firstName +" " +lastName+ " "+
                             "COMPANY EMAIL" + email + " "+
                             "MAILBOX CAPACITY" + mailBoxCapacity);
    }
}
