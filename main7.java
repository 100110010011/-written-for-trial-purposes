import java.util.*;

public class main7 {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("lütfen şifrelenek mesajı giriniz > ");
	String plainText = scan.nextLine();

  System.out.println("Metinin açık hali > "+plainText);
  Polybius polybiusObject =new Polybius();
  String result =polybiusObject.encryption(plainText);
  System.out.println("Metini şifrelenmiş Hali > "+result);
  
  result=polybiusObject.decryption(result);
  System.out.println("Metinin çözülmüş hali Hali > "+result);
  
    }  
}

