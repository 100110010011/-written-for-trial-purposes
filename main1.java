import java.util.*;
public class main1 {
public static void main(String [] args){
   Scanner scan = new Scanner(System.in);
   System.out.print("Lütfen şifrelenecek mesajı giriniz > ");
   String plainText = scan.nextLine();  
    System.out.println("Metinin Açık Hali: "+plainText);
    MD5 md5Object =new MD5();
    
    String digestText=md5Object.hash(plainText);
    System.out.println("Metinin MD5 ile çıkartılmış özeti : "+digestText);
}    
}
