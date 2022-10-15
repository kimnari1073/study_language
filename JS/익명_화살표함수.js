//익명함수와 화살표함수의 차이점
//내부에서 this 키워드가 가지는 의미
(function () {console.log(this);})();
(() => {console.log(this);})();

