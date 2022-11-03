package WORKS;

public class Address implements IAddress {

    //fonksiyonlar buraya
    // Ev adresi ("HomeAddress") ve İş adresi ("BusinessAddress")

    private String address;

    private void HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAdress() {

        return address;
    }
}
