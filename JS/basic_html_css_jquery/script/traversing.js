$('.menu li').mouseenter(function(){
    $(this).children('.sub-menu').stop().slideDown()
})
$('.menu li').mouseleave(function(){
    $(this).children('.sub-menu').stop().slideUp()
})
$('.btn span').click(function(){
    $(this).addClass('active')
    $(this).siblings().removeClass('active')
})
