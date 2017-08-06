<%--
  Created by IntelliJ IDEA.
  User: ange
  Date: 2017/4/22
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/login.css"/>--%>
    <style>
    body{padding: 0px;margin: 0px;font-size: 50px}
    .title{ width: 100%;height: 100px; }
    .title_left{ align:left;  width: 30%;background: #F88C34;height: 100px;float: left}
    .title_center{align:center; width: 40%;height: 100px;float: left}
    .title_right{ align:right; width: 30%;background:#7BBD39;height: 100px;float: right}
    .title_bottom{background:#7BBD39;width: 100%;height: 1px}
    .content{background:#0166FF;width: 100%;height: 800px;position: relative}
    .login_pan{background:#CCCCFF; width: 20%;height: 500px;position: absolute;right: 80px;top: 100px}
    .login_pan form{ background: #0f0;width: 100% ;height: 250px;}
    .login_pan form div{text-align: center}
    .login_pan form div div{float: left;font-size: 15px;width: 50px;height: 20px;margin-left: 10%;text-align: center}
    .login_pan form div input{float: none;height: 20px;text-align: center}
    .bottom{background: #F88C34; width: 100%;height: 100px}
    </style>
  </head>
  <body>
    <div class="title">
      <div class="title_left"></div>
      <div class="title_center"></div>
      <div class="title_right"></div>
    </div>
    <div class="title_bottom"></div>
    <div class="content">
      <div class="login_pan">
        <form>
          <div style="margin-top: 20px"><div>账号：</div><input id="account" type="text" maxlength="6"/></div>
          <div style="margin-top: 20px"><div>密码：</div><input id="password" type="password" maxlength="6"/></div>
        </form>
        <button id="but_login">登录</button>
      </div>
    </div>
    <div class="bottom"></div>

  <script>


    var but_login=document.getElementById("but_login");
    but_login.onclick=function () {
        var accountInput=document.getElementById("account");
        var passwordInput=document.getElementById("password");
//        alert(accountInput.value);
        $.ajax({
            url : '<%=request.getContextPath()%>/user/login',
            data:{account:accountInput.value,password:passwordInput.value},
            cache : false,
            async : true,
            type : "POST",
            dataType : "json",
            success : function (result){
                   alert(result);
            }
        });
    }

  </script>
  </body>
</html>
