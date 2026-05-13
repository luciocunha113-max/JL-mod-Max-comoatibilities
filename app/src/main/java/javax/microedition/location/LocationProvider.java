/*
 * JSR 179 - Location API stub implementation
 * This is a minimal stub to provide API compatibility
 */

package javax.microedition.location;

public abstract class LocationProvider {
    public static final int AVAILABLE = 1;
    public static final int TEMPORARILY_UNAVAILABLE = 2;
    public static final int OUT_OF_SERVICE = 3;

    public static LocationProvider getInstance(Criteria criteria) throws LocationException {
        throw new LocationException("Location API not implemented");
    }

    public abstract Location getLocation(int timeout) throws LocationException, InterruptedException;

    public abstract int getState();

    public static Location getLastKnownLocation() {
        return null;
    }

    public void reset() {
        // Stub
    }

    public void setLocationListener(LocationListener listener, int interval, int timeout, int maxAge) {
        // Stub
    }
}
