<%-- 
    Document   : create_kyc
    Created on : Jan 23, 2023, 12:59:44 PM
    Author     : Gulshan
--%>
<%@include file="flash.jsp" %>
<%@include file="bank_navi.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
/*            body {
  align-items: center;
  background-color: #000;
  display: flex;
  justify-content: center;
  height: 100vh;
}*/

.form {
  background-color: #15172b;
  border-radius: 20px;
  box-sizing: border-box;
  height: 520px;
  padding: 20px;
  width: 320px;
}

.title {
  color: #eee;
  font-family: sans-serif;
  font-size: 36px;
  font-weight: 600;
  margin-top: 30px;
}

.subtitle {
  color: #eee;
  font-family: sans-serif;
  font-size: 16px;
  font-weight: 600;
  margin-top: 10px;
}

.input-container {
  height: 50px;
  position: relative;
  width: 100%;
}

.ic1 {
  margin-top: 40px;
}

.ic2 {
  margin-top: 30px;
}

.input {
  background-color: #303245;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  font-size: 18px;
  height: 100%;
  outline: 0;
  padding: 4px 20px 0;
  width: 100%;
}

.cut {
  background-color: #15172b;
  border-radius: 10px;
  height: 20px;
  left: 20px;
  position: absolute;
  top: -20px;
  transform: translateY(0);
  transition: transform 200ms;
  width: 76px;
}

.cut-short {
  width: 50px;
}

.input:focus ~ .cut,
.input:not(:placeholder-shown) ~ .cut {
  transform: translateY(8px);
}

.placeholder {
  color: #65657b;
  font-family: sans-serif;
  left: 20px;
  line-height: 14px;
  pointer-events: none;
  position: absolute;
  transform-origin: 0 50%;
  transition: transform 200ms, color 200ms;
  top: 20px;
}

.input:focus ~ .placeholder,
.input:not(:placeholder-shown) ~ .placeholder {
  transform: translateY(-30px) translateX(10px) scale(0.75);
}

.input:not(:placeholder-shown) ~ .placeholder {
  color: #808097;
}

.input:focus ~ .placeholder {
  color: #dc2f55;
}

.submit {
  background-color: #08d;
  border-radius: 12px;
  border: 0;
  box-sizing: border-box;
  color: #eee;
  cursor: pointer;
  font-size: 18px;
  height: 50px;
  margin-top: 38px;

  text-align: center;
  width: 100%;
}

.submit:active {
  background-color: #06b;
}

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
    <center>
        <form action="create_account" method="POST" >
            <input id="firstname" class="input" type="text" name="pname" placeholder=" " value="<%=request.getParameter("pname")%>" />
              <input id="firstname" class="input" type="text" name="mobno" placeholder=" " value="<%=request.getParameter("mobno")%>" />
              <input id="firstname" class="input" type="text" name="email" placeholder=" " value="<%=request.getParameter("email")%>" />
              <input id="firstname" class="input" type="text" name="addre" placeholder=" " value="<%=request.getParameter("addre")%>" />
        <div class="form">
      <div class="title">Verify Kyc</div>
      <!--<div class="subtitle">Let's create your account!</div>-->
      <div class="input-container ic1">
          <input id="firstname" class="input" type="text" name="pannumber" placeholder=" " />
        <div class="cut"></div>
        <label for="firstname" class="placeholder">Unique ID</label>
      </div>
     
      <hr>
      <label style="color: white">OR</label>
      <div class="input-container ic2">
          <input id="email" class="input" type="file" name="adharfile"  placeholder=" " />
        <div class="cut cut-short"></div>
        <label for="email" class="placeholder">Adhar File</>
      </div>
       <div class="input-container ic2">
           <input id="email" class="input" type="file" name="panfile" placeholder=" " />
        <div class="cut cut-short"></div>
        <label for="email" class="placeholder">Pan Files</>
      </div>
       
      <button type="text" class="submit">submit</button>
    </div></form>
    </center>
    </body>
</html>
