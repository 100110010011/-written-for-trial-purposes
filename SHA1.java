import java.security.*;
//sucure hashin algorithm þifrelemesi
public class SHA1 {
public String hash(String textToHash){
    String digestText=null;
    try{
        //Sha-1 özetleme algoritmasý kulanýcaðýmýzý belirtik
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] bytes=md.digest(textToHash.getBytes());
        
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<bytes.length;i++)
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100,16).substring(1));
        digestText=sb.toString();
        
        
    }catch(NoSuchAlgorithmException e){
        e.printStackTrace();
    }
    return digestText;
}    
    
    
    
}
