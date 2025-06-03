//there is no copy constructor in js 
// by using clone we achieve prototype 
// prototype is copying of an object or instance of object without creating the object once again  

class Player{
    constructor(name,health){
        this.name=name;
        this.health=health;
    }
    clone(){
        return new Player(this.name,this.health);
    }

    print(){
        console.log(`Player:${this.name},Health:${this.health}`);
    }
}

class BotPlayer extends Player{                                        
    constructor(name,health,weapon){
        super(name,health);
        this.weapon=weapon;
    }

    clone(){
        console.log("my bot player object is being copied ");
        return new BotPlayer(this.name,this.health,this.weapon);            //creates the copy of bot player 
    }

    print(){
        console.log(`BotPlayer:${this.name},Health:${this.health},weapon:${this.weapon}`);
    }
}

class RealPlayer extends Player{
    constructor(name,health,weapon) {
        super(name,health);
        this.weapon=weapon;
    }

    clone(){
        console.log("my real player object is being copied ");
        return new RealPlayer(this.name,this.health,this.weapon);             //creates the copy of real player 
        
    }

    print(){
        console.log(`RealPlayer:${this.name},Health:${this.health},Weapon:${this.weapon}`);
    }
}


const bot=new BotPlayer("bot-1", 100, "M416");
const real=new RealPlayer("real-1", 95, "AKM");

bot.print();                                                           // Original bot
real.print();                                                          // Original real player

const copybotplayer = bot.clone();                                     // Cloned bot
const copyrealplayer = real.clone();                                   // Cloned real player

copybotplayer.print();                                                 
copyrealplayer.print();                                                
