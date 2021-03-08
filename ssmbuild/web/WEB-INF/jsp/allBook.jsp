<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>查看书籍</title>
  <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <div class="row clearfix">
    <div class="col-md-12 column">
      <div class="page-header">
        <h1>
          <small>书籍列表——显示所有书籍</small>
        </h1>
      </div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-4">
      <a href="${pageContext.request.contextPath}/book/toAddBook" class="btn btn-primary active" role="button">添加书籍</a>
      <a href="${pageContext.request.contextPath}/book/allBook" class="btn btn-primary active" role="button">显示所有书籍</a>
    </div>
    <div class="col-md-8">
      <form action="${pageContext.request.contextPath}/book/queryBookByName" class="form-inline" style="float: right">
        <span style="color: red;font-weight: bold">${errorMsg}</span>
        <input type="text" name="bookName" class="form-control input-md" placeholder="输入查询书籍名称" required>
        <input type="submit" value="搜索" class="btn btn-primary">
      </form>
    </div>
  </div>
  <div class="row clearfix">
      <div class="col-md-12 column">
        <table class="table table-hover table-striped">
          <thead>
            <tr>
              <th>书籍编号</th>
              <th>书籍名称</th>
              <th>书籍数量</th>
              <th>书籍描述</th>
              <th>操作</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="book" items="${booksList}">
              <tr>
                <td>${book.bookID}</td>
                <td>${book.bookName}</td>
                <td>${book.bookCounts}</td>
                <td>${book.detail}</td>
                <td>
                  <a href="${pageContext.request.contextPath}/book/toUpdate?id=${book.bookID}" class="btn btn-info">修改</a>
                  &nbsp;|&nbsp;
                  <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.bookID}" class="btn btn-warning">删除</a>
                </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
  </div>
</div>

</body>
</html>
