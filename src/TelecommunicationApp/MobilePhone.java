package TelecommunicationApp;

public class MobilePhone implements ITelephone{

    private String phoneNumberHere;
    private boolean isRinging;
    private boolean isPowerON;

    public MobilePhone(String phoneNumber){
        this.phoneNumberHere=phoneNumberHere;
    }
    @Override
    public void powerON() {
        isPowerON=true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerON){
            System.out.println("ansering the desk phone");
            isRinging=false;
        }else {
            System.out.println("not rinign");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber==phoneNumberHere  && isPowerON){
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
