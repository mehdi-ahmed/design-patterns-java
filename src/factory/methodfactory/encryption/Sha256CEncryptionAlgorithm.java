package factory.methodfactory.encryption;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public String encrypt(String plainText) {
        return DigestUtils.sha256Hex(plainText);
    }
}
