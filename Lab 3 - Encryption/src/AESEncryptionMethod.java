import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class AESEncryptionMethod {

    private static final String AES_KEY = "1234567890abcdef";
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";

    // Get SecretKeySpec from the static AES key
    static SecretKeySpec getSecretKey() {
        return new SecretKeySpec(AES_KEY.getBytes(), ALGORITHM);
    }

    // Core cryptography method
    static void doCrypto(int cipherMode, SecretKeySpec key, String inputFilePath, String outputFilePath) throws Exception {
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(cipherMode, key);

        File inputFile = new File(inputFilePath);
        File outputFile = new File(outputFilePath);

        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile)) {

            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(outputBytes);
        }
    }
}
