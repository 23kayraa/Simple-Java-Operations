package tr.edu.medipol.yova;

public class Hesapla {

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int cikart(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int bol(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            throw new IllegalArgumentException("İkinci sayı sıfır olamaz");
        }
        return sayi1 / sayi2;
    }
}
