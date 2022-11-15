$('.show-btn').click(function(){
    $('.container div').fadeIn('fast')
})
$('.hide-btn').click(function(){
    $('.container div').fadeOut(2000) //2초
})
$('.toggle-btn').click(function(){
    $('.container div').fadeToggle()
})