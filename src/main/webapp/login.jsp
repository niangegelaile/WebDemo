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
    body{padding: 0px;margin: 0px;}
    .title{ width: 100%;height:50px; }
    .content{
      width: 100%;
      height: calc(100% - 100px);
      /*background:#0166FF;*/
      display:flex;
      flex-direction: row;
      align-items: center;
     }
    .login_pan{
      padding: 10px;
      /*width: 30%;*/
      /*height: 50%;*/
      margin: auto auto;
      background:#CCCCFF;
     }
    table{
      /*width: 100%;*/
      /*height: 100%;*/
    }
    tr{
      /*height: 25%;*/
      /*width: 100%;*/
    }
    .td_title{
      width: 50px;
    }
    .td_content{
      /*width: 70%;*/
    }
    input{
      width:100%;
    }
    .bottom{background: white; width: 100%;height: 50px}
    </style>
  </head>
  <body>
    <div class="title">
    </div>

    <div class="content">

        <form class="login_pan">
          <table>
            <tr>
              <td class="td_title">账号：</td>
              <td class=" .td_content"><input id="account" type="text" maxlength="6"/></td>
            </tr>
            <tr >
              <td class="td_title">密码：</td>
              <td class=" .td_content"><input id="password" type="password" maxlength="6"/></td>
            </tr>
            <tr>
              <td colspan="2"> <button id="but_login">登录</button></td>
            </tr>
          </table>

        </form>


    </div>
    <div class="bottom"></div>

  <script>


    var but_login=document.getElementById("but_login");
    but_login.onclick=function () {
        var accountInput=document.getElementById("account");
        var passwordInput=document.getElementById("password");
//        alert(accountInput.value);
        $.ajax({
            url : '<%=request.getContextPath()%>/user/login',//不加request.getContextPath()也可以
            data:{account:accountInput.value,password:passwordInput.value},
            cache : false,
            async : true,
            type : "POST",
            dataType : "json",
            success : function (result){
                console.log(JSON.stringify(result))
                if(String(result.result)==="true"){
                    window.location.href='/page/index'
                }else {
                    alert(result)
                }

            }
        });
    }

  </script>
  </body>
</html>
