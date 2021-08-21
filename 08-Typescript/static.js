var Circle = /** @class */ (function () {
    function Circle() {
        this.t1 = 3;
    }
    Circle.pi = 3.14;
    return Circle;
}());
Circle.pi; //return 3.14
var circleObj = new Circle();
console.log(Circle.pi);
