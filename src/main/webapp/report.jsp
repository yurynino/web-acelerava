<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.List" %>
<%@ page import="com.acelerava.domain.Question" %>
<%
	Integer grade = (Integer) request.getAttribute("grade");
%>
<head>
	<script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>	
	<script type="text/javascript" src="../js/Chart.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			var data = {
			    labels: ["", "Mapas", "Cultura", "Regiones"],
			    datasets: [
			        {
			            label: "Evaluaciones",
			            fillColor: "rgba(151,187,205,0.2)",
			            strokeColor: "rgba(151,187,205,1)",
			            pointColor: "rgba(151,187,205,1)",
			            pointStrokeColor: "#fff",
			            pointHighlightFill: "#fff",
			            pointHighlightStroke: "rgba(151,187,205,1)",
			            data: [0, 3, 6, 9]
			        }
			    ]
			};
		
			var ctx = $("#myChart").get(0).getContext("2d");
			new Chart(ctx).Line(data);
		});
	</script>
</head>
<body>
	<ul class="section">
		<li>
			<h1>
				<span></span> <a>Reporte</a>
			</h1>
			
			<%
				if (grade != null) {
			%>
				<div class="alert-success">
					Tu &uacute;ltima calificaci&oacute;n fue: <%=grade %> 
				</div>
			<%
				}
			%>
			
			<div style="text-align: center;">
				<canvas id="myChart" width="400" height="400"></canvas>
			</div>
		</li>
	</ul>
</body>