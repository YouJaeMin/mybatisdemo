<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#all').click(function() {
			//실행후 처음 한번은 checkbox가 선택이 되지만 두번째 부터는
			//적용이 안된다. attr('checked',true)은 정적속성만 적용된다.
			$('[type=checkbox]').prop('checked', true);
		});

		$('#del').click(function() {
			$("form").submit();
		});

		/* $('#del').click(function() {
			// alert("cnt:"+$(":checked").size());
			var arr = new Array();
			$(":checked").each(function(index, value) {
				//alert($(value).val());
				arr[index] = $(value).val();
			});

			$.ajax({
				type : 'get',
				data : 'data=' + arr,
				url : 'myList',
				success : function(res) {
					$('body').html(res);
				}
			});
		}); */
	});
</script>
</head>
<body>

	<form action="test.jsp" name="frm" method="get">
		<table>
			<tr>
				<th><input type="button" id="all" value="전체" /> <input
					type="button" id="del" value="삭제" /></th>

				<th>employee_id</th>
				<th>name</th>
				<th>department_name</th>
				<th>street_address</th>
			</tr>

			<c:forEach items="${aList}" var="dto">
				<tr>
					<td><input type="checkbox" name="chk" value="${dto.employee_id}" /></td>
					<td>${dto.employee_id}</td>
					<td>${dto.first_name}</td>
					<td>${dto.getDept().department_name}</td>
					<td>${dto.getLoc().street_address}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>















