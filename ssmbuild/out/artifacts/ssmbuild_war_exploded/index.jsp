<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>查询书籍页面</title>
    <style>
      a{
        text-decoration: none;
        line-height: 50px;
        color: bisque;
      }
      a:hover{
        color: chocolate;
      }
      h1{
        width: 200px;
        height: 50px;
        background-color: #8EC5FC;
        background-image: linear-gradient(62deg, #8EC5FC 0%, #E0C3FC 100%);
        text-align: center;
        margin: 100px auto;
      }
    </style>
  </head>
  <body>
  <h1><a href="${pageContext.request.contextPath}/book/allBook">进入书籍</a></h1>
  </body>
</html>
