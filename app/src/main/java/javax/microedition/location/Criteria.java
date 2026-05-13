/*
 * JSR 179 - Location API stub implementation
 */

package javax.microedition.location;

public class Criteria {
    public static final int NO_REQUIREMENT = 0;
    public static final int POWER_USAGE_LOW = 1;
    public static final int POWER_USAGE_MEDIUM = 2;
    public static final int POWER_USAGE_HIGH = 3;

    private int horizontalAccuracy = NO_REQUIREMENT;
    private int verticalAccuracy = NO_REQUIREMENT;
    private int preferredResponseTime = NO_REQUIREMENT;
    private int powerConsumption = NO_REQUIREMENT;
    private boolean costAllowed = true;
    private boolean speedAndCourseRequired = false;
    private boolean altitudeRequired = false;
    private boolean addressInfoRequired = false;

    public Criteria() {
    }

    public int getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public void setHorizontalAccuracy(int accuracy) {
        this.horizontalAccuracy = accuracy;
    }

    public int getVerticalAccuracy() {
        return verticalAccuracy;
    }

    public void setVerticalAccuracy(int accuracy) {
        this.verticalAccuracy = accuracy;
    }

    public int getPreferredResponseTime() {
        return preferredResponseTime;
    }

    public void setPreferredResponseTime(int time) {
        this.preferredResponseTime = time;
    }

    public int getPreferredPowerConsumption() {
        return powerConsumption;
    }

    public void setPreferredPowerConsumption(int level) {
        this.powerConsumption = level;
    }

    public boolean isAllowedToCost() {
        return costAllowed;
    }

    public void setCostAllowed(boolean allowed) {
        this.costAllowed = allowed;
    }

    public boolean isSpeedAndCourseRequired() {
        return speedAndCourseRequired;
    }

    public void setSpeedAndCourseRequired(boolean required) {
        this.speedAndCourseRequired = required;
    }

    public boolean isAltitudeRequired() {
        return altitudeRequired;
    }

    public void setAltitudeRequired(boolean required) {
        this.altitudeRequired = required;
    }

    public boolean isAddressInfoRequired() {
        return addressInfoRequired;
    }

    public void setAddressInfoRequired(boolean required) {
        this.addressInfoRequired = required;
    }
}
