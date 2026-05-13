package javax.microedition.content;

public interface ContentHandler {
    String getID();
    String[] getTypes();
    String[] getSuffixes();
    String[] getActions();
    String getAuthority();
    String getAppName();
}
