class Employee{
    empcode : number;
    empname : string;

    constructor(empcode : number, empname : string){
        this.empcode = empcode;
        this.empname = empname;
    }
}

let emp = new Employee(100, "Bikash");
console.log("Employee Code : ", emp.empcode);
console.log("Employee Name : ", emp.empname);

