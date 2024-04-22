import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//1- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
// (Input için Scanner ve döngü için for döngüsü kullanınız)

      /**  Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç ürün almak istiyorsunuz ? :");
        int amount = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < amount; i++)
        {
            System.out.print("Ürünün fiyatını giriniz :");
            double price = scanner.nextDouble();
            total += price;
        }
        System.out.println("Ürünlerin toplam fiyatı :" + total);
**/

//2- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
//While döngüsü ve Do-While döngüsü, belirli bir koşul doğru olduğu sürece bir kod bloğunu tekrar tekrar çalıştırmak için kullanılan kontrol yapılarıdır.
// Bir koşulun başlangıçta doğru olup olmadığını kontrol eder ve koşul doğru olduğu sürece döngü bloğunu çalıştırır. Koşul yanlış olduğunda döngü sona erer.
        /**
         int count = 0;
         while (count < 5) {
         System.out.println("Count: " + count);
         count++;
         }
//Count değişkeni 0'dan başlayarak 5'e kadar olan sayıları yazdıracak bir while döngüsü bulunmaktadır.
         int count = 0;
         do {
         System.out.println("Count: " + count);
         count++;
         } while (count < 5);
//Count değişkeni 0'dan başlayarak 5'e kadar olan sayıları yazdıracak bir do-while döngüsü bulunmaktadır. Koşul doğru olduğu sürece döngü devam eder.
         //Her iki döngü de belirli bir koşul doğru olduğu sürece çalışır, ancak while döngüsü koşulu kontrol ederken, do-while döngüsü döngü bloğunu en az bir kez çalıştırır ve sonra koşulu kontrol eder.
         **/


//3-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
// (While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)

      /**  Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);

        int guess= 0;


        while(guess != randomNumber)
        {
            System.out.println("1 ile 10 arasında rastgele sayı giriniz");
            guess= scanner.nextInt();
        }
        System.out.println("Tahmin ettiğiniz sayı=" + randomNumber);
       **/

      //4- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

     /**   Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number= scanner.nextInt();
        int sum = 0;
        for(int i=1 ; i< number ; i++)
        {

            if(number%i==0)
                sum +=i;
        }
       if(sum==number)
       {
           System.out.println(number+ "Mükemmel sayıdır.");
       }
       else
           System.out.println(number+"Mükemmel sayı değildir");
       **/
        //5- String metotlarını araştırınız. Her bir metot için örnek yapınız.
        /**
        // Java'da String sınıfı, metin tabanlı verileri işlemek için kullanılan bir sınıftır. String sınıfı birçok faydalı metot içerir. Örnekler:
        // 1) length(): Bir dizenin karakter sayısını döndürür
        String str = "Hello, World!";
        int length = str.length(); // length = 13
         //2) charAt(int index): Belirtilen dizindeki karakteri döndürür.
         String str = "Hello";
         char ch = str.charAt(0); // ch = 'H'
         //3(substring(int beginIndex): Belirtilen başlangıç dizininden sona kadar olan bir alt dize döndürür.
         String str = "Hello, World!";
         String subStr = str.substring(7); // subStr = "World!"
         //4)substring(int beginIndex, int endIndex): Belirtilen başlangıç ve bitiş dizinleri arasındaki alt dizeyi döndürür.
         String str = "Hello, World!";
         String subStr = str.substring(7, 12); // subStr = "World"
         //5)toLowerCase(): Diziyi küçük harflere dönüştürür.
         String str = "HELLO";
         String lowerCaseStr = str.toLowerCase(); // lowerCaseStr = "hello"
         //6)toUpperCase(): Diziyi büyük harflere dönüştürür.
         String str = "hello";
         String upperCaseStr = str.toUpperCase(); // upperCaseStr = "HELLO"
         //7)trim(): Başındaki ve sonundaki boşlukları kaldırır.
         String str = "  Hello, World!  ";
         String trimmedStr = str.trim(); // trimmedStr = "Hello, World!"
        //8)startsWith(String prefix): Belirtilen önek ile başlayıp başlamadığını kontrol eder.
         String str = "Hello, World!";
         boolean startsWithHello = str.startsWith("Hello"); // startsWithHello = true
        //9)endsWith(String suffix): Belirtilen sonek ile bitip bitmediğini kontrol eder.
         String str = "Hello, World!";
         boolean endsWithWorld = str.endsWith("World!"); // endsWithWorld = true
        //10)contains(CharSequence s): Belirtilen karakter dizisini içerip içermediğini kontrol eder.
         String str = "Hello, World!";
         boolean containsWorld = str.contains("World"); // containsWorld = true
         **/
        //6- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve
        // daha sonra not ortalamasını hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
        /**
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci sayısını giriniz :");
        int studentAmount = scanner.nextInt();

        for (int i = 1; i <= studentAmount; i++)
        {
            System.out.print("Öğrenci" + i + "bilgilerini giriniz" );
            System.out.println("Öğrenci adı: ");
            String name =scanner.next();
            System.out.println("Öğrenci soyadı: ");
            String surname =scanner.next();
            System.out.println("Birinci sınav notu: ");
            double exam1 =scanner.nextDouble();
            System.out.println("İkinci sınav notu: ");
            double exam2 =scanner.nextDouble();
            System.out.println("Üçüncü sınav notu: ");
            double exam3 =scanner.nextDouble();

            double average = (exam1 + exam2 + exam3) / 3;

            System.out.println(name + "" + surname + "isimli öğrencinin not ortalaması :" + average);

        }
         **/
    }
}
