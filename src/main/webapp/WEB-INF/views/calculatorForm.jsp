<
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/calculate" method="get">

    <input type="number" name="firstNum" value="0" >
    <input type="number" name="secondNum" value="0">
    <select name="operator" >
      <option value="+">+Add</option>
      <option value="-">-Minus</option>
      <option value="*">*Multi</option>
      <option value="/">/Devide</option>
    </select>
    <br>
    <button type="submit">Calculate</button>
  </form>
  </body>
</html>
