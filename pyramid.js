let width = 14;
let length = 8;
let output = '';


for(let i = 0; i<length;i++){
    for(let j = 0; j<width+1;j++){
        if(j >= width/2-i && j <= width/2+i )
            output += '*';
        else
            output += ' ';
    }    
    output += '\n';
}

console.log(output);
