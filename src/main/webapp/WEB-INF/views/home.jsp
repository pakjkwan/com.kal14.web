<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" href="${context}/resources/css/reset.css" />
<link rel="stylesheet" href="${context}/resources/css/kal.css" />
<link rel="stylesheet" href="${context}/resources/css/popup.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="${context}/resources/js/controller.main.js"></script> 
<script src="${context}/resources/js/popup.js"></script> 
<title>대한항공</title>
</head>
<body>
<div id="wrapper"></div>
<jsp:include page="/WEB-INF/views/common/sub-gnb-before-login.jsp" flush="false"/>
<jsp:include page="/WEB-INF/views/common/main-gnb.jsp" flush="false"/>		
   <div class="kal-container">
   		<ul class="kal-background-section">
   			<li class="kal-main-background1 imgcount open">
   				<div class="kal-maintext1">
   					<h2>꿈의 비행 787</h2>
   					<p>대한민국에서도 꿈의 비행이 시작됩니다.</p>
   				</div>
   			</li>
   			<li class="kal-main-background2 imgcount">
   				<div class="kal-maintext2">
   					<h2>대한항공 여행정보사이트</h2>
   					<p>각국의 여행정보 공유하고 활동포인트 혜택을 확인하세요</p>
   				</div>
   			</li>
   			<li class="kal-main-background3 imgcount">
   				<div class="kal-maintext3">
   					<h2>여행은 인생이다</h2>
   					<p>한진관광 KALPAK</p>
   				</div>
   			</li>
   		</ul>
   </div>
   <div class="kal-main-event-wrapper">
   		<a class="kal-event-text" href="#">진행중인 이벤트</a>
   </div>	
<jsp:include page="/WEB-INF/views/common/footer.jsp" flush="false"/>   
</body>
<script>
	 main.context.init('${context}'); 
</script>
</html>