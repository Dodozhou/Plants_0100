/**
 * Created by hp on 2017/3/25.
 */
$(document).ready(function () {
    $.getJSON("http://localhost:8888/find/景天科",function (dr) {
        $.each(dr,function (index) {
            $("#index_dr").after(
                "<li class='in_ceil'>"+
                "<a href='/detail/"+dr[index].id+
                "'><figure><img class='in_img' src='"+dr[index].imgs+
                "' alt='"+dr[index].plantname+
                "'/><figcaption>"+dr[index].plantname+"</figcaption></figure></a></li>"
            );
        })
    })

});

