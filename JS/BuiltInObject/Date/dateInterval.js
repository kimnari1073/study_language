let now = new Date();
let born = new Date(2000,4-1,11);

let interval = now.getTime() - born.getTime();
interval = Math.floor(interval / (1000*60*60*24));

console.log(`태어난지 ${interval}일 지났습니다.`);

