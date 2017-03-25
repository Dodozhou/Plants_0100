/**
 * Created by person on 2017/3/12.
 */
//待付款、待发货、待收货、待评价
var $cargonav1=$('.cargonav>ul>li:first-child');
var $cargonav2=$('.cargonav>ul>li:eq(1)');
var $cargonav3=$('.cargonav>ul>li:eq(2)');
var $cargonav4=$('.cargonav>ul>li:last-child');
var $cargocont1=$('.cargocont .ul1>li:first');
var $cargocont2=$('.cargocont .ul1>li:nth-child(2)');
var $cargocont3=$('.cargocont .ul1>li:nth-child(3)');
var $cargocont4=$('.cargocont .ul1>li:last');
$cargonav1.css('color','#0dc18d');
$('.cargocont>ul>li:not("#ul1li1")').css('display','none');
$cargonav1.click(function(){
    // $cargocont1.css('display','block');
    // $cargocont2.css('display','none');
    // $cargocont3.css('display','none');
    // $cargocont4.css('display','none');
    $cargonav1.css('color','#0dc18d');
    $('.cargonav>ul>li:not(".cargonav>ul>li:first")').css('color','#000');
    $('.cargocont>ul>li').css('display','none');
    $('#ul1li1').css('display','block');
});
$cargonav2.click(function(){
    $cargonav2.css('color','#0dc18d');
    $('.cargonav>ul>li:not(".cargonav>ul>li:nth-child(2)")').css('color','#000');
    $('.cargocont>ul>li').css('display','none');
    $('#ul1li2').css('display','block');
});
$cargonav3.click(function(){
    $cargonav3.css('color','#0dc18d');
    $('.cargonav>ul>li:not(".cargonav>ul>li:nth-child(3)")').css('color','#000');
    $('.cargocont>ul>li').css('display','none');
    $('#ul1li3').css('display','block');
});
$cargonav4.click(function(){
    $cargonav4.css('color','#0dc18d');
    $('.cargonav>ul>li:not(".cargonav>ul>li:last")').css('color','#000');
    $('.cargocont>ul>li').css('display','none');
    $('#ul1li4').css('display','block');
});

//多肉农场、多肉仓库
var $farmnav=$('#farmnav');
var $warehousenav=$('#warehousenav');
var $farm=$('#farm');
var $warehouse=$('#warehouse');
$farmnav.css('color','#0dc18d');
$warehousenav.css('color','#000');
$warehouse.css('display','none');
$farmnav.click(function(){
    $farmnav.css('color','#0dc18d');
    $warehousenav.css('color','#000');
    $farm.css('display','block');
    $warehouse.css('display','none');
});
$warehousenav.click(function(){
    $farmnav.css('color','#000');
    $warehousenav.css('color','#0dc18d');
    $farm.css('display','none');
    $warehouse.css('display','block');
});

//种植日记、多肉转让
var $pubnavli1=$('.pubnav ul li:first');
var $pubnavli2=$('.pubnav ul li:last');
var $pubcont1=$('.pubcont ul li:first');
var $pubcont2=$('.pubcont ul li:last');
$pubnavli1.css('color','#0dc18d');
$pubnavli2.css('color','#000');
$pubcont2.css('display','none');
$pubnavli1.click(function(){
    $pubnavli1.css('color','#0dc18d');
    $pubnavli2.css('color','#000');
    $pubcont1.css('display','block');
    $pubcont2.css('display','none');
});
$pubnavli2.click(function(){
    $pubnavli1.css('color','#000');
    $pubnavli2.css('color','#0dc18d');
    $pubcont1.css('display','none');
    $pubcont2.css('display','block');
});