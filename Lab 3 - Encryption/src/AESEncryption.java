import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryption extends EncryptionController{


    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        SecretKeySpec secretKey = AESEncryptionMethod.getSecretKey();
        AESEncryptionMethod.doCrypto(Cipher.ENCRYPT_MODE, secretKey, inputFilePath, outputFilePath);
        System.out.println("File encrypted successfully.");
    }

    // Decrypt file
    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        SecretKeySpec secretKey = AESEncryptionMethod.getSecretKey();
        AESEncryptionMethod.doCrypto(Cipher.DECRYPT_MODE, secretKey, inputFilePath, outputFilePath);
        System.out.println("File decrypted successfully.");
    }
}
