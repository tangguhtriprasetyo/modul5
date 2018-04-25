package tugas.bab6;

/**
 *
 * @author KELOMPOK32
 */
public class io {
    
   
    String y;

    public io() {
        this.y = ("Dari yang saya terawang, mending ");
    }
    
    public void opening(){
        System.out.println("WHAT WOMEN WANTS");
        System.out.print("Bingung apa yang cewekmu mau? ");
        System.out.println("Ditanyain mau apa jawabnya terserah");
        System.out.println("Tenang,Rileks. Kami akan membantumu");
        System.out.println(" ");
    }

    public void opening2(){
        System.out.println("1. Makanan");
        System.out.println("2. Hangout");
        System.out.println("3. Kado");
    }
    public void openingmakan(){
        System.out.println("1. Berkuah");
        System.out.println("2. Goreng");
        System.out.println("3. Bakaran");
    }
    public void openinghangout(){
        System.out.println("1. Indoor");
        System.out.println("2. Outdoor");
    }
    public void openingkado(){
        System.out.println("1. Berguna");
        System.out.println("2. Romantis");
        System.out.println("3. Mentahan");
    }
    public void makan1(){
        System.out.println(y + " ajak ke Bakso Pak Kumis");
    }
    public void makan2(){
        System.out.println(y + " ajak ke Nasi Goreng Pak Rebi");   
    }
    public void makan3(){
        System.out.println(y + " ajak ke Ikan Bakar Cianjur");
    }
    public void hangout1(){
        System.out.println(y + " ajak ke Taman KB, kan tempatnya outdoor tuu");
    }
    public void hangout2(){
        System.out.println(y + " ajak ke Burjo, kan tempatnya indoor tuu");
    }
    public void kado1(){
        System.out.println(y + " beliin aja palu, kan berguna tuu kalo ada yang rusak di kamarnya");
    }
    public void kado2(){
        System.out.println(y + " beliin aja alat solat, kan romantis tuu kayak lagi ijab kabul");
    }
    public void kado3(){
        System.out.println(y + " kasih aja uang 5000, kan bisa buat beli cilok dapet 10");     
    }
    
    public void salahinput(){
        System.out.println("Inputmu salah bro");
    }
    public void penutup(){
        System.out.println("Terimakasih telah menggunakan program ini.");
        }
    }
