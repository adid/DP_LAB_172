import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class DESEncryption extends EncryptionController{
    @Override
    public void encryptFile(String inputFilePath, String encryptedFilePath) throws Exception {
        try {
            SecretKey key = KeyGenerator.getInstance("DES").generateKey();

            FileOutputStream fosKey = new FileOutputStream("..\\KEY");
            SecretKeyFactory keyfac = SecretKeyFactory.getInstance("DES");
            DESKeySpec keyspec = (DESKeySpec) keyfac.getKeySpec(key, DESKeySpec.class);
            fosKey.write(keyspec.getKey());
            fosKey.close();

            Cipher crypt = Cipher.getInstance("DES");
            crypt.init(Cipher.ENCRYPT_MODE, key);

            FileInputStream fis = new FileInputStream(inputFilePath);
            FileOutputStream fos = new FileOutputStream(encryptedFilePath);
            byte[] arrayBytes = new byte[8];
            int bytesReads;
            while ((bytesReads = fis.read(arrayBytes)) != -1) {
                fos.write(crypt.doFinal(arrayBytes), 0, bytesReads);
            }
            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void decryptFile(String encryptedFilePath, String outputFilePath) throws Exception {
        try {
            FileInputStream fisKey = new FileInputStream("..\\KEY");
            byte[] arrayKey = new byte[fisKey.available()];
            fisKey.read(arrayKey);
            SecretKey key = new SecretKeySpec(arrayKey, "DES");

            Cipher decrypt = Cipher.getInstance("DES");
            decrypt.init(Cipher.DECRYPT_MODE, key);

            FileInputStream fis = new FileInputStream(encryptedFilePath);
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            byte[] encText = new byte[16];
            int bytesReads;
            while ((bytesReads = fis.read(encText)) != -1) {
                fis.read(decrypt.doFinal(encText), 0, bytesReads);
            }
            fis.close();
            System.out.println(new String(encText));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
