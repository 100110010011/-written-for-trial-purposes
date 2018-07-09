
public class Affine {
private String alphabet="abcçdefgðhýijklmnoöpqrsþtuüvwxyz";
private int c =alphabet.length();
/* þifreleme iþleminde için öncelik þifrelenecek mesajýn karakteri indez deðeri çýktýlarý
ve bu deðerler basit bir fomksiyon sokulur(a*x+b)
fonksiyon çýkan deðerler alfabedeki harf sayýsý büyük olmasý
için mod iþlemine tabi tutulur
çýkan index deðeri  alfabedeki karakter karþýlýk þifreli mesaj oluþturur
*/
public String encrypt(int a,int b,String text)
{
    int [] textIndex = new int [text.length()];
    for(int i=0;i<text.length();i++){
        int x = alphabet.indexOf(text.charAt(i));
        textIndex[i]=(a*x+b)%c;
        
    }
    return ConvertToText(textIndex);
}       
public String decrypt( int ax,int b,String cipherText)
{
    int [] textIndex = new int[cipherText.length()];
    for(int i=0;i <cipherText.length();i++){
        int x = alphabet.indexOf(cipherText.charAt(i));
        textIndex[i]=(ax*(x-b))%c;
        if(textIndex[i]<0)textIndex[i]+=c;
        
    }
    return ConvertToText(textIndex);
}
/*bu metot kendisiyle gelen index deðerini karakter karþýlýklý bulup 
birleþtirir ve çýkan sonucu döndürür*/
public String ConvertToText(int [] textIndex)
{String text = " ";
for(int i=0;i<textIndex.length;i++)
    text += alphabet.charAt(textIndex[i]);
return text;
    
}
    
}
