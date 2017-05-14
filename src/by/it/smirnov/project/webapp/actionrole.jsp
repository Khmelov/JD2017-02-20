<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ include file="include/begin-html.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form class="form-horizontal" action="do?command=actionRole" method="POST">
<fieldset>

<input type="hidden" name="id" value="<c:if test="${role == null}" >0</c:if><c:if test="${role != null}" >${role.id}</c:if>" />

<!-- Form Name -->
<legend>
<c:if test="${role == null}" >Добавление новой роли</c:if>
<c:if test="${role != null}" >Редактирование роли</c:if>
</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="name">Наименование</label>
  <div class="col-md-4">
  <input id="name" name="name" type="text" placeholder="Наименование" required=""
    value="<c:if test="${role != null}" >${role.name}</c:if>"
    class="form-control input-md">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Сохранить</button>
  </div>
</div>

</fieldset>
</form>
<c:remove var="role" scope="session" />

<%@ include file="include/end-html.jsp" %>


