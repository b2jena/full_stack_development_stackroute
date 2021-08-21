class Person1{
    name:string;
    constructor(name : string){
        this.name = name;
    }
}

class Employee2 extends Person1{
    empcode: number;
    constructor(empcode:number, name:string){
        super(name);
        this.empcode = empcode;
    }
    displayName1():void{
        console.log("Name : " + this.name + "\nEmployee Code : " + this.empcode);
    }
}
let emp3 = new Employee2(100,"Bikash");

emp3.displayName1();
