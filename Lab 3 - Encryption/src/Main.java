import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an encryption method: ");
        System.out.println("1. AES");
        System.out.println("2. DES");
        System.out.println("3. Caesar Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine();
        EncryptionController controller;

        try {
            switch (choice) {
                case 1:
                    controller = new AESEncryption();
                    break;
                case 2:
                    controller = new DESEncryption();
                    break;
                case 3:
                    controller = new CeaserCipher();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            System.out.print("Enter the input file path: ");
            String inputFilePath = scanner.next();
            System.out.print("Enter the output file path for encryption: ");
            String encryptedFilePath = scanner.next();
            controller.encryptFile(inputFilePath,encryptedFilePath);
            System.out.println("File encrypted successfully!");

            System.out.print("Enter the output file path for decryption: ");
            String decryptedFilePath = scanner.next();
            controller.decryptFile(encryptedFilePath, decryptedFilePath);
            System.out.println("File decrypted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}