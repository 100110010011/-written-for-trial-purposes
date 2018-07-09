import java.math.*;
import java.util.*;

public class main11 {

	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
	
		RSA rsaObject = new RSA();
		String keys = rsaObject.KeyGeneration();
		System.out.print(keys);

		System.out.print("\n\nŞifrelenecek mesajı giriniz > ");
		String plainText =scan.nextLine();

		String [] cipherText = new String[plainText.length()];
		String cipherTextt="";
		String [] asciiText= new String [plainText.length()];
		String asciiTextt="";
		for(int i = 0; i< plainText.length();i++){
		
			asciiText[i] = (int) plainText.charAt(i)+"";
			asciiTextt += asciiText[i];
			cipherText[i] = rsaObject.Encryption(new BigInteger(asciiText [i]))
			.toString();

			cipherTextt += "\n" + cipherText[i];
		}

		System.out.print("-----------------------------------------------------------------");
		System.out.print("\nAçık hali Ascii Hali : \n "+asciiTextt+"\n");
		System.out.print("\nMesajın şifrelenmiş Hali: \n" +cipherTextt+"\n");

		String[] decipherAsciiText= new String[cipherText.length];
		String decipherAsciiTextt = "";

		String decipherTextt="";
		for(int i= 0; i<cipherText.length;i++){
		
			decipherAsciiText[i] = rsaObject.Decryption(
					new BigInteger(cipherText[i])).toString();
			decipherAsciiTextt += decipherAsciiText[i];

			decipherTextt += Character.toString((char) Integer
					.parseInt(decipherAsciiText[i]));
		}

		System.out.print("\nMetinin Deşifre Edilmiş Hali : \n"+decipherAsciiTextt);
		System.out.println("\nMesaj Açık hali : \n" + decipherTextt);
		System.out.print("----------------------------------------------------------");
	}
}                                                                                                         
                                                            
