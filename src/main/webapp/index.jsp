<%--
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>--%>


<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 08/01/2024
  Time: 03:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
  <link rel="stylesheet" href="css/login.css">
  <title>My Uni</title>
</head>
<body>
<%
  if (session.getAttribute("token") != null) {
%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
  }
%>

<section class="h-70 gradient-form" style="background-color: #eee;">
  <div class="container py-5 h-100">
    <div
            class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-xl-10">
        <div class="card rounded-3 text-black">
          <div class="row g-0">
            <div class="col-lg-6">
              <div class="card-body p-md-5 mx-md-4">

                <div class="text-center">
                  <img src="img/ucd.jpg" style="width: 185px;" alt="logo">
                  <h4 class="mt-1 mb-5 pb-1">Université Chouaib Doukkali</h4>
                </div>

                <form action="login" method="post">
                  <p>Please login to your account</p>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example11">Email</label>
                    <input type="text" name="login" id="form2Example11"
                           class="form-control"
                           placeholder="User name or email address" />
                  </div>

                  <div class="form-outline mb-4">
                    <label class="form-label" for="form2Example22">Mot de
                      passe</label> <input type="password" placeholder="Mode de passe"
                                           id="form2Example22" name="password" class="form-control" />
                  </div>

                  <div class="text-center pt-1 mb-5 pb-1">
                    <button class="btn btn-primary btn-block fa-lg l-100 mb-3"
                            type="submit" name="connecter">Connecter</button>

                  </div>

                </form>

              </div>
            </div>
            <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
              <div class="text-white px-3 py-4 p-md-5 mx-md-4"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

</body>
</html>

