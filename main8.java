import java.util.*;

public class main8{

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		int length = 256;
		
		System.out.print("Lütfen şifrelenecek mesaj'ı giriniz > ");
		String plainText = scan.nextLine();

		System.out.print("Metinin Açık hali > "+ plainText);
		SHA3 sha3Object= new SHA3();

		String digest = sha3Object.digest(plainText,length);
		System.out.print("Metinin şifrelenmiş hali >  "+digest);

	

	}
}
