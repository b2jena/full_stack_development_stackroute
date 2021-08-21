abstract class Person5{
    name:string;
    constructor(name:string){
        this.name = name;
    }

    display5():void{
        console.log(this.name);
    }
    abstract find(string): Person5;
}

class Employee5 extends Person5{
    empCode : number;
    constructor(name:string, code:number){
        super(name);
        this.empCode = code;
    }
    find(name:string): Person5{
        return new Employee5(name,1);
    }
}

let emp5:Person5 = new Employee5("Bikash",100);
emp5.display5();

let emp6:Person5 = emp5.find("Ramesh");
emp6.display5();