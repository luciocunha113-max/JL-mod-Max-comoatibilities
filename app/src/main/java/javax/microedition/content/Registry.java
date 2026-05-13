package javax.microedition.content;

public class Registry {
    public static Registry getRegistry(String classname) {
        return new Registry();
    }

    public ContentHandler forID(String ID, boolean exact) {
        return null;
    }

    public ContentHandler[] findHandler(String callerId, String ID, String type, String suffix, String action) {
        return new ContentHandler[0];
    }
}
