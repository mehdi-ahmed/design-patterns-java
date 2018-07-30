package factory.methodfactory.encryption;

public class EncryptionFactoryMain {

    public static void main(String[] args) {


        PersistedFile persistedFile =
                new PersistedFile("/Users/mehdi/Documents/myProjects/java/design-patterns-java/test",
                        "Encrypt This !", new Sha256Encryptor());

        persistedFile.persist();

    }

}
