package j30_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {

    public static void main(String[] args) {
        //map.containsKey();->Girilen Key değerinin  map'de varlığını  kontrol eder boolean  return eder.
        //map.containsValue();->Girilen value değerinin  map'de varlığını  kontrol eder boolean  return eder.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm = " + hm);//{Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.containsKey(\"Vatan\") = " + hm.containsKey("Vatan"));//true
        System.out.println("hm.containsKey(\"Vatannn\") = " + hm.containsKey("Vatannn"));//false

        System.out.println("hm.containsValue(\"111 Euro\") = " + hm.containsValue("111 Euro"));// true
        System.out.println("hm.containsValue(\"333 javaGoz\") = " + hm.containsValue("333 javaGoz"));// false
    }

}
