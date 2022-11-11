let arrayA = ['고구마','감자','바나나'];
let arrayB = [
    {name:'고구마',price:1000},
    {name:'감자',price:500},
    {name:'바나나',price:400}
];
//기본 배열(arrayA) 정렬
arrayA.sort();
console.log(arrayA);
console.log(arrayA.reverse());

//객체 내부의 숫자로 정렬
arrayB.sort((itemA, itemB) => {
 return itemA.price - itemB.price;
})
console.log(arrayB);

//객체 내부의 문자열로 정렬
arrayB.sort((itemA,itemB) => {
    if (itemA.name < itemB.name) return -1;
    else if(itemA.name > itemB.name) return 1;
    else return 0;
});
console.log(arrayB);