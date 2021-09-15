<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>고객 수정</h2>

<form action="${contextPath}/orders/update" method="post">
  

  <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="Enter ID" name="orderId" required>
  </div>
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter custId" name="custId" required>
  </div>
  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter bookId" name="bookId" required>
  </div>
  <div class="container">
    <label for="orderPrice"><b>orderPrice</b></label>
    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
  </div>
  <div class="container">
    <label for="orderDate"><b>orderDate</b></label>
    <input type="date" placeholder="Enter ID" name="orderDate" required>
  </div>
  <button type="submit">Join</button>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>