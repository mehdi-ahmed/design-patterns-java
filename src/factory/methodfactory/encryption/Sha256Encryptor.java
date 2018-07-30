package factory.methodfactory.encryption;

public class Sha256Encryptor extends Encryptor {

    @Override
    protected EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha256CEncryptionAlgorithm();
    }
}
