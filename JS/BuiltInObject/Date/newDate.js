//현재 시간기반
let dateA = new Date();
console.log(dateA);
//유닉스 타임(1970.1.1 0시0분0초부터 경과한 밀리초(ms)
let dateB = new Date(692281800000);
console.log(dateB);
//문자열 기반
let dateC = new Date("December 9, 1991 21:30:00");
console.log(dateC);
//년, 월-1, 일, 시간, 분, 초, 밀리초 를 기반
let dateD = new Date(1991, 12 - 1, 9, 21, 30, 0, 0);
console.log(dateD);