package factory.methodfactory.encryption;

import java.io.FileOutputStream;
import java.io.IOException;

public abstract class Encryptor {

    public void writeToDisk(String plainText, String fileName) {

        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String cypherText = encryptionAlgorithm.encrypt(plainText);

        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(cypherText.getBytes());
        } catch (IOException io) {
            io.printStackTrace();
        }


    }

    protected abstract EncryptionAlgorithm getEncryptionAlgorithm();

}
