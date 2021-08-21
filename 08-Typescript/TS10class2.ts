class greeter{
    greeting : string;
    constructor(message : string){
        this.greeting = message;
    }
    greet(){
        return "Hello" + this.greeting;
    }
}

let g = new greeter("world");
let out = g.greet();
console.log(out);


