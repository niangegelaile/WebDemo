<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <span id="sp_text">lll</span>
    <button onclick="window.hello.javaMethod('pppppppp')">调用android方法</button>

    <script type="text/javascript">
        function show(info) {
           var sp_text= document.getElementById("sp_text");
            sp_text.innerHTML=info;
        }





    </script>



</body>
</html>