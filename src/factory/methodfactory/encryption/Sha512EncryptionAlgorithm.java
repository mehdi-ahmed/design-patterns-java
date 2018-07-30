package factory.methodfactory.encryption;

import org.apache.commons.codec.digest.DigestUtils;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {


    @Override
    public String encrypt(String plainText) {
        return DigestUtils.sha512Hex(plainText);
    }
}
