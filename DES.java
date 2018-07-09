import java.io.*;
import java.security.*;
import javax.crypto.*;

public class DES {

	public static SecretKey desKey= null;

	public static final String ALGORITHM = "DES";

	public static final String KEY_FILE = "CryptoFiles/secret.key";

	public File createFile(String fileName){
	
		File file = new File(fileName);

		try{
		
			if(file.getParentFile() != null){
			
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
		}catch(IOException e){
		
			e.printStackTrace();
		}
		return file;
	}

	public String readData(String fileAddress){
	
		StringBuilder out = new StringBuilder();
		InputStream in;

		try{
		
			in = new FileInputStream(fileAddress);
			BufferedReader reader = new
			BufferedReader(new InputStreamReader(in));
			String line;

			while((line = reader.readLine()) != null){
			
				out.append(line);
			}
		       reader.close();	
		}catch(IOException e){
		
			e.printStackTrace();
		}
		return out.toString();
	}

	public boolean areKeysPresent(){
	
		File desKey = new File(KEY_FILE);

		if(desKey.exists()){
		
			return true;
		}
		return false;


	}

	public void generateDesKey(){
	
		File file;
		KeyGenerator keygenerator;

		try{
		
			keygenerator = KeyGenerator.getInstance(ALGORITHM);
			desKey = keygenerator.generateKey();
			file = createFile(KEY_FILE);

			ObjectOutputStream secretKeyOS = new ObjectOutputStream(
					new FileOutputStream(file));
			secretKeyOS.writeObject(desKey);
			secretKeyOS.close();
		}catch(NoSuchAlgorithmException | IOException e){
		
			e.printStackTrace();
		}
	}

	public String encrypt(String plainTextAddress,String cipherTextAddress){
	
		try{
		
			ObjectInputStream inputStream = new ObjectInputStream(
					new FileInputStream(KEY_FILE));
			final SecretKey desKey =(SecretKey) inputStream.readObject();
			inputStream.close();

			Cipher desCipher = Cipher.getInstance(ALGORITHM);
			desCipher.init(Cipher.ENCRYPT_MODE,desKey);

			FileInputStream fis = new FileInputStream(plainTextAddress);
			FileOutputStream fos = new FileOutputStream(cipherTextAddress);
			CipherOutputStream cos = new CipherOutputStream(fos,desCipher);

			byte[] block = new byte[32];
			int i;

			while((i = fis.read(block)) != -1){
			
				cos.write(block,0,i);
			}
			cos.close();
			fis.close();
			fos.close();
			String cipherText = readData(cipherTextAddress);
			return"Şifreleme tamamlandı" +"\n"+"Şifreli Metin :"+cipherText;
		}catch(Exception e){
		
			e.printStackTrace();
			return"Şifreleme sırasında bir hata oluştu";
		}
	}

	public String decrypt(String cipherTextAddress,String plainTextAgainAddress){
	
	
		try{
		
			ObjectInputStream inputStream = new  ObjectInputStream(
					new FileInputStream(KEY_FILE));
			final SecretKey desKey = (SecretKey) inputStream.readObject();
			inputStream.close();

			Cipher desCipher = Cipher.getInstance(ALGORITHM);
			desCipher.init(Cipher.DECRYPT_MODE,desKey);

			FileInputStream fis = new FileInputStream(cipherTextAddress);
			FileOutputStream fos = new FileOutputStream(plainTextAgainAddress);

			CipherInputStream cis = new CipherInputStream(fis,desCipher);
			byte[] block = new byte[32];
			int i;

			while((i = cis.read(block)) != -1){
			
				fos.write(block,0,i);
			
			}
			fos.close();
			cis.close();
			fis.close();

			String plainTextAgain = readData(plainTextAgainAddress);
			return"Şifre Çözme işlemi Tamamlandı"+"\n"+"Çözülen Metin : "+plainTextAgain;
		}catch(Exception ex){
		
			ex.printStackTrace();
			return"Çözme Sırasında bir hata Oluştu";
		}
	}



}
