/**
 * Created by person on 2017/3/11.
 */
$(function(){
    // $('.formcont form p').css('display','none');
    $('#safebox').click(function(){
        var $ischecked=$('#safebox').is(':checked');//获得true false
        // var $ischecked=$('#safebox').attr('checked');//获得属性checked或者undefined
        // alert($ischecked);
        if($ischecked){
            $('.tip').css('display','block');
        }else{
            $('.tip').css('display','none');
        }
    });


    $('.loginli').click(function(){
        $('#login').css('display','block');
        $('#register').css('display','none');
        $('.formnav ul li:first').css('background-color','#fff')
                                 .find('span')
                                 .css('color','#22a6d2');
        $('.formnav ul li:last').css('baackground-color','rgba(238,238,238,0.6)')
                                .find('span')
                                .css('color','#000');
    });
    $('.registerli').click(function(){
        $('#login').css('display','none');
        $('#register').css('display','block');
        $('.formnav ul li:first').css('background-color','rgba(238,238,238,0.6)')
                                 .find('span')
                                 .css('color','#000');
        $('.formnav ul li:last').css('background-color','#fff')
                                .find('span')
                                .css('color','#22a6d2');
    });

});

$('#register').css('display','none');
$('.registerli').css('background-color','rgba(238,238,238,0.6)');

var p=document.getElementsByClassName('lrtip');
for(var i=0;i<=p.length-1;i++){
    p[i].style.display='none';
}
//    登录验证和提示
var p1=document.getElementById('tip1');
var p2=document.getElementById('tip2');
document.getElementById('pwdtext').disabled='true';
function loginverify1(){
    var str1=document.getElementById('teltext').value;
    var atpos=str1.indexOf("@");
    var dotpos=str1.lastIndexOf('.');
    //意思就是说，输入的数据必须包含 @ 符号和点号(.)。同时，@ 不可以是邮件地址的首字符，并且 @ 之后需有至少一个点号：
    if(atpos<1||dotpos<atpos+2||dotpos+2>=str1.length){
        p1.style.display='block';
        p1.innerHTML='不是一个有效的Email地址';
        return false;
    }else{
        p1.style.display='none';
        return true;
    }
}
function log1result(){
    if(loginverify1()){
        document.getElementById('pwdtext').disabled=false;
    }
}
function loginverify2() {
    var log1result=loginverify1();
    if(log1result==true){
        var str2=document.getElementById('pwdtext').value;
        if(str2==''||str2==null){
            p2.style.display='block';
            p2.innerHTML='请输入密码';
            return false;
        }else{
            p2.style.display='none';
            return true;
        }
    }else{
        p2.style.display='none';
    }
}

//注册验证和提示
var rname=document.getElementById('rnametext');
var rtel=document.getElementById('rteltext');
var rpwd=document.getElementById('rpwdtext');
var rrpwd=document.getElementById('rrpwdtext');
rtel.disabled=true;
rpwd.disabled=true;
rrpwd.disabled=true;
var p3=document.getElementById('tip3');
var p4=document.getElementById('tip4');
var p5=document.getElementById('tip5');
var p6=document.getElementById('tip6');

function register1(){
    var   rnametext=rname.value;
    if(rnametext==''||rnametext==null){
        p3.style.display='block';
        p3.innerHTML='请输出有效用户名';
        return false;
    }else{
        p3.style.display='none';
        return true;
    }
}
function reg1result() {
    if(register1()==true){

        rtel.disabled=false;
    }
}

function register2(){
    var reg1result=register1();
    if(reg1result==true){
        var rteltext=rtel.value;
        var ratpos=rteltext.indexOf("@");
        var rdotpos=rteltext.lastIndexOf('.');
        if(ratpos<1||rdotpos<ratpos+2||rdotpos+2>=rteltext.length){
            p4.style.display='block';
            p4.innerHTML='不是一个有效的Email地址';
            return false;
        }else{
            p4.style.display='none';
            return true;
        }
    }else{
        p4.style.display='none';
    }
}
function reg2result() {
    if(register2()==true){
        rpwd.disabled=false;
    }
}
function register3(){
    var reg2result=register2();
    if(reg2result==true){
        var rpwdtext=rpwd.value;
        if(rpwdtext==''||rpwdtext==null||rpwdtext.length<=6){
            p5.style.display='block';
            p5.innerHTML='请输入不少于6位的有效密码';
            return false;
        }else{
            p5.style.display='none';
            return true;
        }
    }else{
        p5.style.display='none';
    }
}
function reg3result() {
    if(register3()==true){
        rrpwd.disabled=false;
    }
}
function register4(){
    var reg3result=register3();
    var rrpwdtext=rrpwd.value;
    if(reg3result==true){
        var rpwdtext=rpwd.value;
        if(rrpwdtext==rpwdtext){
            p6.style.display='none';
            return true;
        }
        else{
            p6.style.display='block';
            p6.innerHTML='两次输入的密码不一致';
            return false;
        }

    }else{
        p6.style.display='none';
    }
}
