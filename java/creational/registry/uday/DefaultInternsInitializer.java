/**
 * Utility class for registering default intern prototypes in the intern
 * registry. This class initializes predefined batches and associates them
 * with their corresponding intern types.
 */
public class DefaultInternsInitializer {

    /**
     * Registers default intern prototypes into the provided intern registry.
     * This includes prototypes for Engineering and Business Analyst interns
     * with predefined batch information.
     *
     * @param registry the {@code InternRegistry} to populate with default
     *                 intern prototypes.
     */
    public static void registerDefaultInterns(InternRegistry registry) {
        // Create Batch for Engineering Interns
        BatchInfo engBatch = new BatchInfo();
        engBatch.setName("2025-ENG");
        engBatch.setDuration("6 months");
        engBatch.setLocation("Bangalore");

        EngineeringIntern engineeringIntern = new EngineeringIntern();
        engineeringIntern.setBatchInfo(engBatch);
        registry.register(InternKeys.ENGINEERING, engineeringIntern);

        // Create Batch for Business Analyst Interns
        BatchInfo baBatch = new BatchInfo();
        baBatch.setName("2025-BA");
        baBatch.setDuration("5 months");
        baBatch.setLocation("Hyderabad");

        BusinessAnalystIntern newBaIntern = new BusinessAnalystIntern();
        newBaIntern.setBatchInfo(baBatch);
        registry.register(InternKeys.BUSINESS_ANALYST, newBaIntern);
    }
}
