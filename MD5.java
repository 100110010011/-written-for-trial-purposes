import java.security.*;
public class MD5 {
    public String hash(String textToHash){
        String digestText=null;
        try{
            //MD5 özetleme algoritmasý kulanýcaðýmýzý belirtik
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] bytes=md.digest(textToHash.getBytes());
            
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<bytes.length;i++)
             sb.append(Integer.toString((bytes[i] & 0xff) + 0x100,16).substring(1));
            
            digestText=sb.toString();
            
                }catch(NoSuchAlgorithmException e){
                  e.printStackTrace();
                }
        return digestText;
    }
    
}
