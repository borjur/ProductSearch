
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Simple Struts/Spring application</title>
  <link rel="stylesheet" href="style/main.css" type="text/css">
</head>
<body>
<jsp:include page="index.html" flush="false"/>
<HR>
<BR/>Results for your search:
<TABLE border="1"><TR>
    <TH>Title</TH>
    <TH>Director</TH>
    <TH>Rated</TH>
    <TH>Starring</TH>
    <TH>YearMonth Release</TH></TR>
    <c:forEach items="${product_list}" var="dvd">
        <TR>
            <TD> ${dvd.title} </TD>
            <TD> ${dvd.director}</TD>
            <TD> ${dvd.rated} </TD>
            <TD> ${dvd.starring} </TD>
            <TD> ${dvd.releaseDate} </TD>
        </TR>
    </c:forEach>

</TABLE>

</body>
</html>