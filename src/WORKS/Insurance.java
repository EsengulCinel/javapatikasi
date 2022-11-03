package WORKS;

import java.util.Date;

public abstract class Insurance {

    private String sIsim;
    private Double sUcret;
    private Date startDate;
    private Date endDate;

    //Ayrıca "calculate" isminde soyut bir fonksiyon tanımlanacaktır.
    // Bu soyut fonksiyon aşağıda kalıtım alınan sınıflarda doldurulacaktır.


    static class InvalidAuthenticationException extends Exception{
        public InvalidAuthenticationException(String message){
            super(message);
        }
    }
}
