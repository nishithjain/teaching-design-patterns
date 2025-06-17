import java.util.Optional;

/**
 * Abstract base class representing an intern with attributes such as name,
 * age, university name, and contact details. Supports cloning and retrieving
 * batch information.
 */
public abstract class Intern {

    protected String name;
    protected int age = 0;
    protected String universityName;
    protected String gender;
    protected String phoneNumber;
    protected String email;
    protected BatchInfo batchInfo;

    /**
     * Default constructor.
     */
    public Intern() {}

    /**
     * Creates a deep copy of this intern.
     *
     * @return a new instance that is a copy of this intern.
     */
    public abstract Intern clone1();

    /**
     * Retrieves the name of the intern.
     *
     * @return the intern's name.
     */
    public abstract String getName();

    /**
     * Retrieves the age of the intern.
     *
     * @return the age of the intern.
     */
    public int getAge() {
        return age;
    }

    /**
     * Retrieves the batch information of the intern, if available.
     *
     * @return an {@code Optional} containing batch information or empty if not set.
     */
    public Optional<BatchInfo> getBatchInfo() {
        return Optional.ofNullable(batchInfo);
    }

    /**
     * Retrieves the email of the intern.
     *
     * @return the intern's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retrieves the gender of the intern.
     *
     * @return the intern's gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Retrieves the phone number of the intern.
     *
     * @return the intern's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Retrieves the university name associated with the intern.
     *
     * @return the intern's university name.
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Sets the name of the intern.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the intern.
     *
     * @param age the age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the university name of the intern.
     *
     * @param universityName the university name to set.
     */
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * Sets the gender of the intern.
     *
     * @param gender the gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Sets the phone number of the intern.
     *
     * @param phoneNumber the phone number to set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the email of the intern.
     *
     * @param email the email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the batch information for the intern.
     *
     * @param batchInfo the batch information to set.
     */
    public void setBatchInfo(BatchInfo batchInfo) {
        this.batchInfo = batchInfo;
    }
}
