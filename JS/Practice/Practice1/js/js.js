$('.login button').click(function(){
    let num = $('.login input').val()
    if (num =='') {
        alert('나이를 입력하세요.');
    }
    else if(num < 20){
        alert('미성년자입니다.')
    }
    else if(nul >= 20){
        alert('성인입니다.')
    }
    else {
        alert('오류입니다')
    }

})
$('.form-element button').click(function(){
    let birth_len = $('.form-element input').val().slice(0,4);
    alert(birth_len)
})
function birth_keyup(obj){
    let birth_len = obj.value.length;
    if(birth_len==4 || birth_len==7){
        obj.value += '-';
    }
}

