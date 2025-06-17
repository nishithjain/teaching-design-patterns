/**
 * Represents information about a batch, including its name, duration,
 * and location. Supports copying data from another instance.
 */
public class BatchInfo {
    private String name;
    private String duration;
    private String location;

    /**
     * Default constructor.
     */
    public BatchInfo() {}

    /**
     * Copy constructor. Creates a new instance by copying data from
     * another {@code BatchInfo} instance.
     *
     * @param other the {@code BatchInfo} instance to copy data from.
     */
    public BatchInfo(BatchInfo other) {
        this.name = other.name;
        this.duration = other.duration;
        this.location = other.location;
    }

    /**
     * Retrieves the name of the batch.
     *
     * @return the name of the batch.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the batch.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the duration of the batch.
     *
     * @return the duration of the batch.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the batch.
     *
     * @param duration the duration to set.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Retrieves the location of the batch.
     *
     * @return the location of the batch.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the batch.
     *
     * @param location the location to set.
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
