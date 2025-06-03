const Printer=(function (){
  let instance;

  function createInstance(){
    return {                      //here closure is used (creating a function inside a function function and using outer function variable) 
      print(msg) {
        console.log("printing:",msg);
      }
    };
  }
  return {
    getInstance(){
      if (!instance){                 //checking if instance is created before or not 
        instance = createInstance();
      }
      return instance;
    }
  };
})();// --->() here iife is done (immediately invoked function expression)it executes expression immediately 

const p1 = Printer.getInstance();//instance one is been created 
const p2 = Printer.getInstance();//instance two is been created 

p1.print("print a");
p2.print("print b");
console.log(p1 === p2); //checking if it is same instance 



