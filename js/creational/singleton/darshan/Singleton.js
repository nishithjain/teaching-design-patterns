class SimCardManager {
    // Private static field to hold the single instance
    static #instance;

    // Private constructor to prevent direct instantiation
    constructor() {
        // Initialization code could go here
        console.log("SimCardManager instance created");
    }

    // Static method to get the singleton instance
    static getInstance() {
        if (!SimCardManager.#instance) {
            SimCardManager.#instance = new SimCardManager();
        }
        return SimCardManager.#instance;
    }

    // Instance method
    addSimCard(iccid, number) {
        console.log(`Adding SIM card ${iccid} with number ${number}`);
        // store the SIM card data
    }
}

// Complete main function implementation
function main() {
    // Get the singleton instance 
    const simManager1 = SimCardManager.getInstance();
    
    // Call the instance
    simManager1.addSimCard("1234567890", "555-1234");
    
    // Get the instance again
    const simManager2 = SimCardManager.getInstance();
    
    // Add another SIM card
    simManager2.addSimCard("9876543210", "555-5678");
    
    
    
    // Try to create a new instance directly 
    try {
        const wrongInstance = new SimCardManager();
    } catch (error) {
        console.log("Cannot instantiate directly:", error.message);
    }
}

// Execute main function
main();