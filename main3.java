import java.util.*;
public class main3 {
    public static void main(String [] args ){
        Scanner scan = new Scanner(System.in);
	System.out.print("şifrelenecek mesajı giriniz > ");
	String text = scan.nextLine();
        System.out.println("Metinin açık hali: " + text+"\n");
        
        int  a =7,b=3,ax=23;
        Affine affineObject = new Affine();
        //þifreleme metodu sonucu þifreli mesaj ekrande listelenir
        String cipherText=affineObject.encrypt(a,b,text);
        System.out.println("Metinin şifrelenmiş hali: "+cipherText +"\n");
        //þifre çözme metodu açýk mesaj ekranda listelenir 
        String cleanText=affineObject.decrypt(ax,b,cipherText);
        System.out.println("Metinin çözülmüş Hali : " +cleanText);
        
    }
    
}
   
