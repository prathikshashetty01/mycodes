
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hcl", "root", "prathiksha123");
		String lan = request.getParameter("langs");
		if (lan != null) {
	%>
	<table>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Phone Number</td>
			<td>Email Id</td>
			<td>Languages</td>
		<tr>
			<%
			ResultSet rs = null;
			if (lan.equals("Any")) {
				PreparedStatement ps1 = con.prepareStatement("select a.fname,a.lname,a.phone,a.email,a.language from activity a  ");
				rs = ps1.executeQuery();
			} else {
				PreparedStatement ps1 = con
				.prepareStatement("select a.fname,a.lname,a.phone,a.email,a.language from activity a where a.language = ?");
				ps1.setString(1, lan);
				rs = ps1.executeQuery();
			}
			while (rs.next()) {
			%>
		
		<tr>
			<td><%=rs.getString("fname")%></td>
			<td><%=rs.getString("lname")%></td>
			<td><%=rs.getString("phone")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getString("language")%></td>
		</tr>
		<%
		}
		%>
		<%
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		%>
	</table>
</body>
</html>
