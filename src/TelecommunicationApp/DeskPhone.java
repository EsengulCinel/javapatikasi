package TelecommunicationApp;

public class DeskPhone implements ITelephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber=myNumber;
    }

    @Override
    public void powerON() {
        System.out.println("Desk phone is always powered");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("ansering the desk phone");
            isRinging=false;
        }else {
            System.out.println("not rinign");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber==myNumber){
            isRinging=true;
            System.out.println("phone ringin");
        }else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
