import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.Cipher;

public class AES{

	public static SecretKey aesKey = null;

	public static final String ALGORITHM = "AES";

	public static final String KEY_FILE = "CryptoFiles/secret.key";

	public File createFile(String fileName){
	
		File file = new File(fileName);

		try{
		
			if(file.getParentFile() != null){
			
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
		}	catch(IOException e){
			
				e.printStackTrace();
			}
			return file;
		}

		public String readData(String fileAddress){
		
			StringBuilder out = new StringBuilder();
			InputStream in;

			try{
			
				in = new FileInputStream(fileAddress);
				
					BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
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
			 public void generateAesKey(){
			 
				 File file;
				 KeyGenerator keygenerator;

				 try{
				 
					 keygenerator = KeyGenerator.getInstance(ALGORITHM);
					 keygenerator.init(128);

					 aesKey = keygenerator.generateKey();
					 file = createFile(KEY_FILE);

					 ObjectOutputStream secretKeyOS = new ObjectOutputStream(
							 new FileOutputStream(file));
					 secretKeyOS.writeObject(aesKey);
					 secretKeyOS.close();
				 }catch(NoSuchAlgorithmException | IOException e){
				 
					e. printStackTrace();
					return "Beklenmedik Hata oluşumu  -> (89) "
				 }
			 }

			 // *** şifreleme metodu hatası *** 

			 public String encrypt(String plainTextAddress,String cipherTextAddress){
			 
				 try{
				 
					 ObjectInputStream inputStream = new ObjectInputStream(
							 new FileInputStream(KEY_FILE));
					 final SecretKey aesKey = (SecretKey) inputStream.readObject();
					 inputStream.close();

					 Cipher aesCipher = Cipher.getInstance(ALGORITHM);
					 aesCipher.init(Cipher.ENCRYPT_MODE,aesKey);

					 FileInputStream fis = new FileInputStream(plainTextAddress);
					 FileOutputStream fos = new FileOutputStream(cipherTextAddress);
					 CipherOutputStream cos = new CipherOutputStream(fos,aesCipher);

					 byte [] block = new byte [32];
					 int i;

					 while((i = fis.read(block)) != -1){
					 
						 cos.write(block,0,i);
					 }

					 cos.close();
					 fis.close();
					 fos.close();

					 String cipherText = readData(cipherTextAddress);

					 return "Şifreleme Tamamlandı "+"\n"+"şifreli Metin"
						 +cipherText;
				 }catch(Exception e){
				 
					 e.printStackTrace();

					 return "Şifrelama sırasında Beklenmedik bir hata oluştu";
				 }
			 }

			 public String decrypt(String ciphertextAddress,String plainTextAgainAddress){
			 
				 try{
				 
					 ObjectInputStream inputStream = new ObjectInputStream(
							 new FileInputStream(KEY_FILE));
					 final SecretKey aesKey = (SecretKey) inputStream.readObject();
					 inputStream.close();

					 Cipher aesCipher = Cipher.getInstance(ALGORITHM);
					 aesCipher.init(Cipher.DECRYPT_MODE,aesKey);

					 FileInputStream fis = new FileInputStream(ciphertextAddress);
					 FileOutputStream fos= new FileOutputStream(plainTextAgainAddress);

					 CipherInputStream cis =new CipherInputStream(fis,aesCipher);

					 byte[] block = new byte[32];
					 int i;

					 while((i = cis.read(block)) != -1){
					 
						 fos.write(block,0,i);
					 }

					 fos.close();
					 cis.close();
					 fis.close();

					 String plainTextAgain = readData(plainTextAgainAddress);
					 return "Şifre çözme işlemi tamamlandı "+"\n"+"Çözülen Metin :"
						 +plainTextAgain;
				 }catch(Exception ex){
					 ex.printStackTrace();
					 return "Şifreleme Çözme sırasında bir hata Oluştu";
				 	
					
				 }
			 }
		}
	

