import java.util.*;
public class main2 {
    public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("Lütfen şifrelenecek mesajı giriniz > ");
        String plainText = scan.nextLine(); 

        System.out.println("Metinin açık hali: "+plainText);
        SHA1 sha1Object=new SHA1();
        String digestText=sha1Object.hash(plainText);
        System.out.println("Metinin SHA-1 ile Çıkartılmış özeti: "+digestText);
        
    }
    
}
