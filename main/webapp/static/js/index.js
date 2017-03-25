/**
 * Created by person on 2017/3/7.
 */
$(function(){
        var winWidth=$(window).width();
        if(winWidth<=600){
            var $menu=$('<div class="menu"><span class="menuspan"><img src="img/logo.png"/></span><span class="menuimg"><img src="img/menu.png"/></span></div>');
            $('.logo').css('display','none');
            $('nav').css('display','none');
                 $('header').append($menu);
            $('.menu .menuimg').click(function(){
                    // $('nav').css('display','block')
                    //              .addClass('show');
                $('nav').slideToggle(200);


            })
        }

});
//自动刷新页面,当窗口大小改变时，刷新页面
$(function(){
    $(window).resize(function(){
        window.location.reload();
    })
});
