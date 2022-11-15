$('.show-btn').click(function(){
    $('p').css({'display':'block'});
    $('div').show();
})
$('.hide-btn').click(function(){
    $('p').css({'display':'none'});
    $('div').hide();
})
$('.btn').mouseenter(function(){
    $('div').show();
})
$('.btn').mouseleave(function(){
    $('div').hide();
})


