import java.util.HashMap;
import java.util.Map;

/**
 * A registry for managing intern prototypes. Allows registering prototypes
 * with specific keys and creating new intern instances by cloning the
 * registered prototypes.
 */
public class InternRegistry {

    private final Map<String, Intern> registry = new HashMap<>();

    /**
     * Registers an intern prototype with a specific key.
     *
     * @param key       the key to associate with the prototype.
     * @param prototype the intern prototype to register.
     */
    public void register(String key, Intern prototype) {
        registry.put(key, prototype);
    }

    /**
     * Creates a new intern instance by cloning the prototype associated
     * with the specified key.
     *
     * @param key the key associated with the desired intern prototype.
     * @return a new intern instance, or {@code null} if no prototype is
     *         associated with the key.
     */
    public Intern create(String key) {
        Intern prototype = registry.get(key);
        if (prototype != null) {
            return prototype.clone1();
        }
        return null;
    }
}
