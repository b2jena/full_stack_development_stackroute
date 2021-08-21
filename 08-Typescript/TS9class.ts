class Person
{
    fname;
    lname;
    constructor(fname:string, lname:string){
        this.fname = fname;
        this.lname = lname;
    }
}

let p = new Person("Bikash", "Jena");

console.log(p.fname);
console.log(p.lname);