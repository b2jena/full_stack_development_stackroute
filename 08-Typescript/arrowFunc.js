var employee7 = /** @class */ (function () {
    function employee7(code, name) {
        var _this = this;
        this.display = function () { return console.log(_this.empcode + " " + _this.empname); };
        this.empname = name;
        this.empcode = code;
    }
    return employee7;
}());
var emp7 = new employee7(1, "Bikash");
emp7.display();
