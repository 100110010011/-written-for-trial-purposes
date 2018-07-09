import java.math.*;
import java.security.*;

public class RSA{

	private final static BigInteger one = new BigInteger("1");
	private final static SecureRandom random = new SecureRandom();
	private final static int Key = 128;
	private BigInteger privateKey;
	private BigInteger publicKey;
	private BigInteger mod;

	public String KeyGeneration(){
	
		BigInteger p = BigInteger.probablePrime(Key,random);
		BigInteger q = BigInteger.probablePrime(Key,random);
		BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));
		mod = p.multiply(q);

		publicKey = new BigInteger("65537");
		privateKey = publicKey.modInverse(phi);
		String keys = "Public Key :" + publicKey +"\nPrivate key"
			+privateKey+"\nMod:"+mod;
		return keys;

	}

	BigInteger Encryption(BigInteger message){
	
		return message.modPow(publicKey,mod);
	}

	BigInteger Decryption(BigInteger encryted ){
		return encryted.modPow(privateKey,mod);
	

	}
}
