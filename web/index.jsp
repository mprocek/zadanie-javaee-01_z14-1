
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Przelicznik</title>
  </head>
  <body>
  <h1>Przelicznik metryczny</h1>
  <form method="post" action="/metryczny">
    <input type="number" name="metry" min="0" value="0"><br>
    <input type="number" name="centymetry" min="0" value="0"><br>
    <input type="number" name="milimetry" min="0" value="0"><br>
    <input type="submit" value="Przelicz"><br>
  </form>
  <br>
  <h1>Przelicznik wag</h1>
  <form method="post" action="/wag">
    <input type="number" name="kilogramy" min="0" value="0"><br>
    <input type="number" name="gramy" min="0" value="0"><br>
    <input type="number" name="miligramy" min="0" value="0"><br>
    <input type="submit" value="Przelicz"><br>
  </form>
  <br>
  </body>
</html>
