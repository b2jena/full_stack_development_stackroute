var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person1 = /** @class */ (function () {
    function Person1(name) {
        this.name = name;
    }
    return Person1;
}());
var Employee2 = /** @class */ (function (_super) {
    __extends(Employee2, _super);
    function Employee2(empcode, name) {
        var _this = _super.call(this, name) || this;
        _this.empcode = empcode;
        return _this;
    }
    Employee2.prototype.displayName1 = function () {
        console.log("Name : " + this.name + "\nEmployee Code : " + this.empcode);
    };
    return Employee2;
}(Person1));
var emp3 = new Employee2(100, "Bikash");
emp3.displayName1();
