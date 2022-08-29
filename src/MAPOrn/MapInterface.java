package MAPOrn;

import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();

        country.put("TR", "Turkiye");        //.put ile eleman ekledik.
        country.put("TR", "TurkiyeYeni");   //set metodu olmadığı için verdiğimiz bu son değeri alır.
        country.put("GR", "ALMANYA");
        country.put("EN", "Ingiltere");

//        System.out.println(country.get("TR"));
//        country.remove("EN");           //silmek için
//        System.out.println(country.get("EN"));

        for (String countryKey : country.keySet()){
             System.out.println(countryKey);  // KEY aldık
            System.out.println(country.get(countryKey)); //KEY'lerin valuelarını bu şekilde de dönebiliriz.
        }
//
//        for (String countyKEY : country.values()){
//            System.out.println(countyKEY);
//        }
    }
}
