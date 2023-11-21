<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HEALTH CARE APP</title>
<style>  
body {
    background-color:lavender;
    }
</style>
</head>  
<body>
	<div align=center>
		<h1>Health Care Center</h1>
		<h1>${errorMsg}</h1>
		<form action="/showPage" method="post">
			<table>
				<tr>
					<td>PatientName:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="text" name="patientName"></td>
				</tr>
				<tr>
					<td>PhoneNumber:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="text" name="phoneNumber"></td>
				</tr>
				<tr>
					<td>Age:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="text" name="age"></td>
				</tr>
				<tr>
					<td>Consultation For:&nbsp; <select name="">
							<option>Optometry</option>
							<option>Psychology</option>
							<option>Pediatrist</option>
							<option>Physical therapy</option>
							<option>Dentistry</option>
					</select>
			</table>
			<input type="submit" value="BookAppointment" />
		</form>
	</div>
</body>
</html>