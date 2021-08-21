function processData(x:any, y:any){
    return x + y;
}

let result1: any;
let result2: any;

result1 = processData("Bikash", "Jena");
console.log(result1);

result2 = processData(2,2);
console.log(result2);