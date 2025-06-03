class Tree {
    constructor(name, heightInFeet, leafColor, isDicot, isNative) {
        this.name = name;
        this.heightInFeet = heightInFeet;
        this.leafColor = leafColor;
        this.isDicot = isDicot;
        this.isNative = isNative;
    }

    // Clone method for prototype pattern
    clone() {
        console.log(`Cloning tree: ${this.name}`);
        return new Tree(
            this.name,
            this.heightInFeet,
            this.leafColor,
            this.isDicot,
            this.isNative
        );
    }

    print() {
        console.log(`Tree Name: ${this.name}`);
        console.log(`Height: ${this.heightInFeet} feet`);
        console.log(`Leaf Color: ${this.leafColor}`);
        console.log(`Type: ${this.isDicot ? "Dicot" : "Monocot"}`);
        console.log(`Origin: ${this.isNative ? "Native" : "Imported"}`);
        console.log();
    }
}

class FruitTree extends Tree {
    constructor(name, heightInFeet, leafColor, isDicot, isNative, fruitType) {
        super(name, heightInFeet, leafColor, isDicot, isNative);
        this.fruitType = fruitType;
    }

    clone() {
        console.log(`Cloning fruit tree: ${this.name}`);
        return new FruitTree(
            this.name,
            this.heightInFeet,
            this.leafColor,
            this.isDicot,
            this.isNative,
            this.fruitType
        );
    }

    print() {
        super.print();
        console.log(`Fruit Type: ${this.fruitType}`);
        console.log();
    }
}

// Example usage
const oak = new Tree("Oak", 60.5, "Green", true, true);
const mango = new FruitTree("Mango", 35.0, "Dark Green", true, false, "Mango");

console.log("Original Trees:");
oak.print();
mango.print();

// Clone the trees
const clonedOak = oak.clone();
const clonedMango = mango.clone();

console.log("Cloned Trees:");
clonedOak.print();
clonedMango.print();

// Modify the clones
clonedOak.name = "Cloned Oak";
clonedOak.heightInFeet = 55.0;
clonedMango.fruitType = "Modified Mango";

console.log("Modified Clones:");
clonedOak.print();
clonedMango.print();

oak.print();
mango.print();