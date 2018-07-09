public class main9 {

	public static void main(String [] args){

		AES  aesObject = new AES();
	
		String plainText = aesObject.readData("CryptoFiles/plainText.txt");
		System.out.println("Şifrelenecek dosya metin :"+plainText);

		if(!aesObject.areKeysPresent())
			aesObject.generateAesKey();

		String result = aesObject.encrypt("CryptoFiles/plainText.txt",
				"CryptoFiles/cipherText.txt");
		System.out.print(result);

		result = aesObject.decrypt("CryptoFiles/cipherText.txt",
				"CryptoFiles/plainTextAgain.txt");
		System.out.print(result);
	}
}
