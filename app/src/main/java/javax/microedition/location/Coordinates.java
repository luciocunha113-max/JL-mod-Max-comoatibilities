package javax.microedition.location;

public class Coordinates {
    protected double latitude;
    protected double longitude;
    protected float altitude;

    public Coordinates(double latitude, double longitude, float altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }
    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }
    public float getAltitude() { return altitude; }
    public void setAltitude(float altitude) { this.altitude = altitude; }

    public static float distance(Coordinates c1, Coordinates c2) {
        return 0.0f;
    }

    public static double azimuth(Coordinates c1, Coordinates c2) {
        return 0.0;
    }
}
