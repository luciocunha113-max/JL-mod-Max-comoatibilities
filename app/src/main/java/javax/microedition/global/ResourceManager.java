package javax.microedition.global;

import java.io.IOException;
import java.io.InputStream;

public class ResourceManager {
    public static ResourceManager getManager() {
        return new ResourceManager();
    }

    public String getString(int id) {
        return "";
    }

    public InputStream getData(int id) throws IOException {
        throw new IOException("Not implemented");
    }
}
