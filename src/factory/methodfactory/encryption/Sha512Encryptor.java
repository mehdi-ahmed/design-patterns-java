package factory.methodfactory.encryption;

public class Sha512Encryptor extends Encryptor {


    @Override
    protected EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha512EncryptionAlgorithm();
    }
}
