let string = 'abcde';
//잘못된 String 객체의 메소드 사용
string.toUpperCase();
console.log(string);
//올바른 String 객체의 메소드 사용
string = string.toUpperCase();
console.log(string);