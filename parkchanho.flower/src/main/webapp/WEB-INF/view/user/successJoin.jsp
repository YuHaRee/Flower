<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<title>CHANHO Flower</title>

<%@ include file ='../include/lib.jsp'%>

<script>
</script>
<style>
<%@ include file ="../../../res/lib.css"%>
div {
	text-align: center
}
</style>
<div class='container'>
	<%@ include file='../include/header.jsp' %>
	<br><br><br>
	<div class='row d-flex justify-content-center mt-5'>
		<div class='col'>
			<h5 style='color:#0f56ba'><b>가입완료</b></h5><hr><br><br>
			<div class='row d-flex justify-content-center' style="height:30px">
				<p>가입 완료 되었습니다.<br>이용 해 주셔서 감사합니다 :)</p> </div>
			<div class='row d-flex justify-content-center'>
				<button type="button" class="btn btn-outline-secondary m-5 d-flex justify-content-center"
					onclick="location.href='<%=request.getContextPath() %>/'">메인으로</button>
			</div>
		</div>
	</div>
	
</div>
<%@ include file='../include/footer.jsp' %>