/**
 * The CacheManager class implements the Singleton design pattern.
 * It ensures that only one instance of the CacheManager exists
 * and provides a global access point to it.
 */
class CacheManager {

    // Single instance of CacheManager
    private static CacheManager instance;

    // Private constructor to prevent instantiation
    private CacheManager() {}

    /**
     * Provides the singleton instance of CacheManager.
     * If the instance is null, it initializes a new one.
     * Otherwise, it reuses the existing instance.
     *
     * @return the single instance of CacheManager
     */
    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        } else {
            System.out.println("Reusing CacheManager");
        }
        return instance;
    }
}

/**
 * The Main class demonstrates the usage of the CacheManager Singleton.
 */
class Main {

    public static void main(String[] args) {
        // First call to getInstance initializes the CacheManager
        CacheManager.getInstance();

        // Second call reuses the existing CacheManager instance
        System.out.println(CacheManager.getInstance());
    }
}
