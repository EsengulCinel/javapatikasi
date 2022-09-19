package harun;

import java.lang.*;

public interface InterfaceExample {
    Integer TCKN_KARAKTER_SINIRI=11;

    public static final Integer YKN_KARAKTER_SINIRI=11;

    int topla(int a,int b);

    default int cikar(int a,int b){//java 8den sonra
        return a-b;
    }
}
