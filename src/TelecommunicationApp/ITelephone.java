package TelecommunicationApp;
//metotları oluştur bodySİZ
public interface ITelephone {
    //power on
    //dial a number
    //answer phone call
    //call another phone
    //is ringing

    void powerON();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
