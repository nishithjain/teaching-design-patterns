/**
 * Represents an intern in the Engineering domain. Extends the {@code Intern}
 * class and provides functionality for cloning.
 */
public class EngineeringIntern extends Intern {

    /**
     * Default constructor.
     */
    public EngineeringIntern() {}

    /**
     * Copy constructor. Creates a new instance by copying data from another
     * {@code EngineeringIntern} instance.
     *
     * @param other the {@code EngineeringIntern} instance to copy data from.
     */
    public EngineeringIntern(EngineeringIntern other) {
        super();
    }

    /**
     * Creates a deep copy of this intern.
     *
     * @return a new {@code EngineeringIntern} instance with copied data.
     */
    @Override
    public EngineeringIntern clone1() {
        return new EngineeringIntern(this);
    }

    /**
     * Retrieves the name of the intern.
     *
     * @return the name of the intern.
     */
    @Override
    public String getName() {
        return name;
    }
}
