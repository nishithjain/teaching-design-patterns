import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BatchRegistry {
    private static Map<String, Batch> registry = new HashMap<>();

    public static void registerBatch(String name, Batch batch) {
        registry.put(name.toLowerCase(), batch);
    }

    public static Batch getBatch(String name) {
        return registry.get(name.toLowerCase());
    }

    public static Set<String> getBatchNames() {
        return registry.keySet();
    }
}
// This class serves as a registry for batches, allowing for easy registration and retrieval of Batch objects by name.
// It uses a HashMap to store the batches, ensuring that batch names are case-insensitive.