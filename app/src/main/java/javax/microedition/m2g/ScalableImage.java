package javax.microedition.m2g;

import java.io.IOException;
import java.io.InputStream;

public class ScalableImage {
    public static ScalableImage createImage(InputStream stream, ExternalResourceHandler handler) throws IOException {
        return new ScalableImage();
    }

    public static ScalableImage createImage(String url, ExternalResourceHandler handler) throws IOException {
        return new ScalableImage();
    }

    public void setViewportWidth(int width) { }
    public void setViewportHeight(int height) { }
    public int getViewportWidth() { return 0; }
    public int getViewportHeight() { return 0; }
    public void requestCompleted(String uri, InputStream resourceData) { }
}
