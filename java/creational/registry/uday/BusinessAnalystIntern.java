/**
 * Represents a Business Analyst intern with domain-specific details such as 
 * tools known and data sources used. Extends the {@code Intern} class, providing 
 * additional fields and methods specific to Business Analyst interns.
 */
public class BusinessAnalystIntern extends Intern {

    private String dataSourcesUsed;
    private String toolsKnown;

    /**
     * Default constructor.
     * Initializes a new instance of {@code BusinessAnalystIntern} with no data.
     */
    public BusinessAnalystIntern() {
    }

    /**
     * Copy constructor.
     * Creates a new {@code BusinessAnalystIntern} instance by copying data 
     * from an existing {@code BusinessAnalystIntern} instance.
     *
     * @param other the {@code BusinessAnalystIntern} instance to copy data from.
     *              Must not be {@code null}.
     */
    public BusinessAnalystIntern(BusinessAnalystIntern other) {
        super();
        this.dataSourcesUsed = other.dataSourcesUsed;
        this.toolsKnown = other.toolsKnown;
        this.batchInfo = other.batchInfo; // Copy BatchInfo from the other instance
    }

    /**
     * Retrieves the data sources used by this intern.
     *
     * @return a {@code String} representing the data sources used by the intern.
     */
    public String getDataSourcesUsed() {
        return dataSourcesUsed;
    }

    /**
     * Sets the data sources used by this intern.
     *
     * @param sources a {@code String} representing the data sources to set.
     */
    public void setDataSourcesUsed(String sources) {
        this.dataSourcesUsed = sources;
    }

    /**
     * Retrieves the tools known by this intern.
     *
     * @return a {@code String} representing the tools known by the intern.
     */
    public String getToolsKnown() {
        return toolsKnown;
    }

    /**
     * Sets the tools known by this intern.
     *
     * @param tools a {@code String} representing the tools to set.
     */
    public void setToolsKnown(String tools) {
        this.toolsKnown = tools;
    }

    /**
     * Creates a deep copy of this {@code BusinessAnalystIntern} instance.
     *
     * @return a new {@code BusinessAnalystIntern} instance with the same data 
     *         as this instance, including {@code BatchInfo}.
     */
    @Override
    public BusinessAnalystIntern clone1() {
        BusinessAnalystIntern copy = new BusinessAnalystIntern(this);
        copy.setBatchInfo(this.getBatchInfo().orElse(null)); // Copy BatchInfo if present
        return copy;
    }

    /**
     * Retrieves the name of this intern.
     *
     * @return a {@code String} representing the name of the intern.
     */
    @Override
    public String getName() {
        return name;
    }
}
