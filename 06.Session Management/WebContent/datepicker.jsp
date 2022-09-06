<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
 new JsDatePick({
        useMode:2,
        target:"aFieldId",        
        isStripped:false,
        selectedDate:{
            year:2009,
            month:4,
            day:16
       	},
        yearsRange: new Array(1971,2100),
        limitToToday:true,
    });
 </script>
</head>
<body>
<input type="text"  id="selectedDate" name="selectedDate">
</body>
</html>