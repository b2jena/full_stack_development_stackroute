class employee7{
    empcode:number;
    empname:string;

    constructor(code:number,name:string){
        this.empname=name;
        this.empcode=code;
    }

    display=()=>console.log(this.empcode + " " + this.empname);
}
let emp7 = new employee7(1,"Bikash");
emp7.display();