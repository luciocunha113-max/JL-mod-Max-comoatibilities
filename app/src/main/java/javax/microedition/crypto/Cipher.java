package javax.microedition.crypto;

public class Cipher {
    public static final int ENCRYPT_MODE = 1;
    public static final int DECRYPT_MODE = 2;

    public static Cipher getInstance(String transformation) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("Not implemented");
    }

    public void init(int mode, java.security.Key key) { }
    
    public byte[] doFinal(byte[] input) {
        return new byte[0];
    }
}
