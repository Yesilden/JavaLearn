package Denemesayfası;

public class x {


    public static void main(String[] args) {
        try {
            checkAge(-3);
            System.out.println("ndn");
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Yaş negatif olaaamaz");
        } else {
            System.out.println("Yaş negatif değil");
        }


    }


}
