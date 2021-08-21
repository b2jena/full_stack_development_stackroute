var Person = /** @class */ (function () {
    function Person(fname, lname) {
        this.fname = fname;
        this.lname = lname;
    }
    return Person;
}());
var p = new Person("Bikash", "Jena");
console.log(p.fname);
console.log(p.lname);
