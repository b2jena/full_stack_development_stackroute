var greeter = /** @class */ (function () {
    function greeter(message) {
        this.greeting = message;
    }
    greeter.prototype.greet = function () {
        return "Hello" + this.greeting;
    };
    return greeter;
}());
var g = new greeter("world");
var out = g.greet();
console.log(out);
