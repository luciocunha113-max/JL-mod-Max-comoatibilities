package javax.microedition.apdu;

import javax.microedition.io.Connection;
import java.io.IOException;

public interface APDUConnection extends Connection {
    byte[] exchangeAPDU(byte[] commandAPDU) throws IOException;
    byte[] getATR();
}
