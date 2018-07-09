public class main10{

	public static void main(String [] argss){
		DES desObject = new  DES();

		if(!desObject.areKeysPresent())
			desObject.generateDesKey();

		String plainText = desObject.readData("CryptoFiles/plainText.txt");
		System.out.print("Şifrelenecek Mesaj :"+plainText);

		String result = desObject.encrypt("CryptoFiles/plainText.txt",
			"CryptoFiles/cipherText.txt");
		System.out.print(result);

		result = desObject.decrypt("CryptoFiles/cipherText.txt",
				"CryptpFiles/plainTextAgain.txt");
		System.out.print(result);




	}
}
