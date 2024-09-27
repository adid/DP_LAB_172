public abstract class EncryptionController implements IEncryption,IDecryption{
    public abstract void encryptFile(String inputFilePath, String encryptedFilePath) throws Exception;

    public abstract void decryptFile(String inputFilePath, String encryptedFilePath) throws Exception;
}
