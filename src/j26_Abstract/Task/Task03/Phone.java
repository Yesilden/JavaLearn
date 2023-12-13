package j26_Abstract.Task.Task03;

import java.util.ArrayList;

abstract class Phone {
    static ArrayList<String> cart = new ArrayList<>();

    static int getSum(ArrayList<String> list) {
        int toplam = 0;

        for (String m : list) {
            
            int n = Integer.parseInt(m);

            toplam += n;

        }

        return toplam;
    }
}





class Apple {


}

class Samsung {


}

class head {


}



 /*
    4 class oluşturulmuştur. Phone, Apple, Samsung, Main
​
    Phone'u super class yapın.
​
    cart isimli, String'i alarak bir static arraylist oluşturun.
​
    getSum isimli, arraylist'i parametre aldığınız bir method oluşturun.
​
    ve return tipi int;
                     arraylist'in içindeki bütün seçenekleri elde edin ve sayısal olmayan karakterleri(a b c... A B C...) ve özel karakterleri (.,!'^+...)
                     sonra bunları int'e çevirin.
                     tüm sayıları toplayın.
​
    ismi options olan bir abstract method oluşturun.
​
    Apple class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.
​
    Eğer birinci String 64 GB ve 5.5 inch ise
                             cart arraylist'ine "$750" ekleyin.
​
    Eğer birinci String 64 GB ve 6.5 inch ise
                             cart arraylist'ine "$850" ekleyin.
​
    Eğer birinci String 128 GB ve 5.5 inch ise
                             cart arraylist'ine "$950" ekleyin.
​
    Eğer birinci String 128 GB ve 6.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.
​
    Samsung class'ın içinde;
                Phone class'ı extend edin.
                option method'u override edin.
                parametre olarak 2 String vardır.
​
    Eğer birinci String 256 GB ve 5.5 inch ise
                             cart arraylist'ine "$1000" ekleyin.
​
    Eğer birinci String 256 GB ve 7.5 inch ise
                             cart arraylist'ine "$1200" ekleyin.
​
    Eğer birinci String 512 GB ve 5.5 inch ise
                             cart arraylist'ine "$1300" ekleyin.
​
    Eğer birinci String 512 GB ve 6.5 inch ise
                             cart arraylist'ine "$1400" ekleyin.
​
​
    Main class'ının içinde;
             scanner class object yarat.
                  iki adet String oluşturun str1, str2 ve scanner object'ini String'lere atayın.
​
    apple class'ı için object oluştur.
    options method'unu apple class'ının içine çağır.
    options parametreleri, daha önce oluşturulan iki String'lerdir.
​
    İki adaet String oluşturun. str3 ve str4, sonra scanner object'i bu String'lere atayın.
               samsung class'ı için object oluşturun.
               options method'unu samsung class'ının içinde çağırın.
               options parametreleri daha önce oluşturulan iki String'dir.
​
    getSum method'unu Phone class'ının içinde çağırın.
​
    sonucu yazdırın.
​
     */