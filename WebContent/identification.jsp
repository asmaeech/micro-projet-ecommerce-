<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>identification</title>
</head>
<body>
<h2>Identifiez-vous</h2>
<form name="form" action="" method="post" onsubmit="return validate()">
        <table align="center">
         <td>E-mail</td>
         <td><input type="text" name="email" /></td>
         </tr>
         <tr>
         <td>Mot de passe</td>
         <td><input type="password" name="password" /></td>
         </tr>
         <td><input type="submit" value="OK"></input></td>
         </tr>
        </table>
    </form>
</body>
</html>