$(function(){
    // var oShow = document.getElementById('show');
    // var oGline = document.getElementById('logo');
    // var aLi = oGline.getElementsByTagName('li');
    // var oCont = document.getElementById('content');
    $('#slc').click(function(){
        $('#show')
            .addClass('active')
            .removeClass('dis');
        $('#content')
            .removeClass('active')
            .addClass('dis');
        $('#head')
        .removeClass('active')
        .addClass('dis');
    });
});