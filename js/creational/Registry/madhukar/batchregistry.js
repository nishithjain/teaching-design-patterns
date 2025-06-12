const batches = new Map();

const BatchRegistry = {
  register: (key, batch) => batches.set(key, batch),  //here we set the key value 
  get: (key) => {                                     //returns batch prototype
    const batch = batches.get(key);                   //returns the batch details of the prototype
    if (!batch) throw new Error("Batch not found");   //checks if the batch is present in registry or not 
    return batch.clone();                             //calls the clone function in batch 
  }
};

export default BatchRegistry;
