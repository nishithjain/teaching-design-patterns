using System;

/// <summary>
/// The CacheManager class implements the Singleton design pattern.
/// It ensures that only one instance of the CacheManager exists
/// and provides a global access point to it.
/// </summary>
public class CacheManager
{
    // Single instance of CacheManager
    private static CacheManager instance;

    // Private constructor to prevent instantiation
    private CacheManager() {}

    /// <summary>
    /// Provides the singleton instance of CacheManager.
    /// If the instance is null, it initializes a new one.
    /// Otherwise, it reuses the existing instance.
    /// </summary>
    /// <returns>The single instance of CacheManager.</returns>
    public static CacheManager GetInstance()
    {
        if (instance == null)
        {
            instance = new CacheManager();
        }
        else
        {
            Console.WriteLine("Reusing CacheManager");
        }
        return instance;
    }
    
    public override string ToString()
    {
    return $"CacheManager Instance HashCode: {GetHashCode()}";
    }
}

/// <summary>
/// The Main class demonstrates the usage of the CacheManager Singleton.
/// </summary>
public class MainClass
{
    public static void Main(string[] args)
    {
        // First call to GetInstance initializes the CacheManager
        CacheManager.GetInstance();

        // Second call reuses the existing CacheManager instance
        Console.WriteLine(CacheManager.GetInstance());
    }
}
