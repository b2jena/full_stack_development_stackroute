var Employee = /** @class */ (function () {
    function Employee(empcode, empname) {
        this.empcode = empcode;
        this.empname = empname;
    }
    return Employee;
}());
var emp = new Employee(100, "Bikash");
console.log("Employee Code : ", emp.empcode);
console.log("Employee Name : ", emp.empname);
