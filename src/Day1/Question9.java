package Day1;

public class Question9 {
    public static void main(String[] args) {

        double productPrice = 123.456;

        int productPriceAli = (int) productPrice;

        int velisBudget = 120;

        byte velisBudgetByte = (byte) velisBudget;

        int totalPrice = productPriceAli + velisBudgetByte;

        System.out.println("Ali'nin fiyatı (tam sayı olarak): " + productPriceAli + " TL");
        System.out.println("Veli'nin birikimi (byte olarak): " + velisBudgetByte + " TL");
        System.out.println("Ali ve Veli'nin toplam fiyatı: " + totalPrice + " TL");
    }
     /*9- Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
    Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
    Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
    Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

    Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.*/
}
