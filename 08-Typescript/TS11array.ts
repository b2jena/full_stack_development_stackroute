let fruits: string[] = ["Apple, Banana, Orange"];

for(var i = 0;i<fruits.length;i++){
    console.log(fruits[i]);
}

for(var i=0;i<fruits.length;i++){
    for(var j=0;j<fruits[i].length;j++){
        console.log("At Index : " + i + " value is : " + fruits[i][j]);
    }
}

