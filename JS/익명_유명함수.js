함수1 = function () {console.log("1");};
함수1 = function () {console.log("2");};
함수1();

함수2 = function (){console.log("1");};
function 함수2() {console.log("2");};
함수2();

function 함수3() {console.log("1");};
함수3 = function () {console.log("2");};
함수3();

function 함수4() {console.log("1");};
function 함수4() {console.log("2");};
함수4();

//결과 예측하기