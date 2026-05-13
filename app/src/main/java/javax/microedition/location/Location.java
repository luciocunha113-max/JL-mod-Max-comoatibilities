/*
 * JSR 179 - Location API stub implementation
 */

package javax.microedition.location;

public class Location {
    public static final int MTE_SATELLITE = 0x00000001;
    public static final int MTE_TIME_OF_DAY = 0x00000002;
    public static final int MTA_ASSISTED = 0x00010000;
    public static final int MTA_UNASSISTED = 0x00020000;
    public static final int MTY_TERMINALBASED = 0x01000000;
    public static final int MTY_NETWORKBASED = 0x02000000;

    public QualifiedCoordinates getQualifiedCoordinates() {
        return null;
    }

    public float getSpeed() {
        return 0.0f;
    }

    public float getCourse() {
        return 0.0f;
    }

    public long getTimestamp() {
        return System.currentTimeMillis();
    }

    public AddressInfo getAddressInfo() {
        return null;
    }

    public boolean isValid() {
        return false;
    }

    public static Location convertToGeocentricCoordinates(Location location) {
        return location;
    }
}
