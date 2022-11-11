let date = new Date();

console.log(date);

//현재시간에 1년 11개월 3일을 더함
date.setFullYear(date.getFullYear()+1);
date.setMonth(date.getMonth()+11);
date.setDate(date.getDate()+3);

console.log(date);