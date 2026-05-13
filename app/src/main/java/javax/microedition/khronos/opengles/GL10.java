package javax.microedition.khronos.opengles;

import java.nio.*;

public interface GL10 extends GL {
    // Common GL constants
    int GL_DEPTH_BUFFER_BIT = 0x00000100;
    int GL_COLOR_BUFFER_BIT = 0x00004000;
    int GL_TRIANGLES = 0x0004;
    int GL_TEXTURE_2D = 0x0DE1;
    
    // Stub methods - minimal interface
    void glClear(int mask);
    void glClearColor(float red, float green, float blue, float alpha);
    void glEnable(int cap);
    void glDisable(int cap);
    void glViewport(int x, int y, int width, int height);
}
