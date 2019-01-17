 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>


 <!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<!-- Favicon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon" />
        <link rel="icon" href="${pageContext.request.contextPath}/resources/images/favicon.ico" type="image/x-icon" />
        <!-- Google font (font-family: 'Montserrat', sans-serif;) -->
        <link
          href="../../../../fonts.googleapis.com/cssf757.css?family=Montserrat:400,500,600,700"
          rel="stylesheet"
        />
        <!-- Google font (font-family: 'Open Sans', sans-serif;) -->
        <link
          href="../../../../fonts.googleapis.com/css44ae.css?family=Open+Sans:300i,400,400i,600,700"
          rel="stylesheet"
        />
        <!-- Bootstrap Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
        <!-- Icons Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/themify-icons.css" />
        <!-- Font Awesome Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/fontawesome-all.min.css" />
        <!-- OWL Carousel Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css" />
        <!-- Slick Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/slick.css" />
        <!-- Magnific Popup Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/magnific-popup.css" />
        <!-- Custom Css -->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
        <!-- Paradise Slider Main Style Sheet -->
        <link
          href="${pageContext.request.contextPath}/resources/css/full_width_animated_layers_002.css"
          rel="stylesheet"
          media="all"
        />
      </head>
      <body>
       
        <!-- *****Main Wrapper***** -->
        <div id="home" class="main-wrapper">
          <header class="main-header">
            <div class="main_navbar">
              <!-- MAIN NAVBAR -->
              <nav class="navbar navbar-expand-lg navbar-dark">
                <div class="container">
                  <a class="navbar-brand logo-sticky" href="index.html"><b>Michelin Insurance</b></a>
                    <ul class="navbar-nav mr-auto">
                      <li class="nav-item">
                        <a href="register" class="nav-link">Buy Insurance</a>
                      </li>
                      <li class="nav-item">
                        <a href="login" class="nav-link">Renew Insurance</a>
                      </li>
                      <li class="nav-item">
                        <a href="login" class="nav-link">Claim Insurance</a>
                      </li>
                      <li class="nav-item">
                        <a href="calculate_premium_estimate" class="nav-link">Calculate Premium</a>
                      </li>
                      <li class="nav-item">
                        <a href="welcome" class="nav-link">Admin</a>
                      </li>
                      <li class="nav-item">
                        <a href="login" class="nav-link">Register</a>
                      </li>
    
                    </ul>
                  </div>
                </div>
              </nav>
            </div>
          </header>
    <title>Vehicle Insurance</title>

<style>

@import url(https://fonts.googleapis.com/css?family=Roboto:300);

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: rgb(117, 112, 112);
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: rgb(76, 119, 175);;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  background:#323630;; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #323630, #323630);
  background: -moz-linear-gradient(right, #323630, #323630);
  background: -o-linear-gradient(right, #323630,#323630);
  background: linear-gradient(to left, #323630, #323630);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
</style>

<script>
 $('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});
</script>

  </head>
  <body>
 <%--  <c:url var="loginAction" value="/login/verification" ></c:url> --%>
    <div class="login-page">
 <div class="form"> 
  <!--   <form class="register-form">
      <input type="text" placeholder="name"/>
      <input type="password" placeholder="password"/>
      <input type="text" placeholder="email address"/>
      <button>create</button>
      <p class="message">Already registered? <a href="index">Sign In</a></p>
    </form> -->
<%--  <form class="login-form"  action="/" method="POST" >  --%>

<%-- <form:form action="${loginAction}"> --%>
<form:form method="post" action="loginverification">
 
      <input type="email" placeholder="email" name="email"/>
      <input type="password" placeholder="password" name="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register">Create an account</a></p>
        <p class="message">Forgot password? <a href="register">Click here</a></p>
  </form:form>
 
  </div>
</div>


   <!-- ***** Footer section start ***** -->
          <footer class="footer">
            <div class="container">
              <div class="row">
                <div class="col-md-4 pr-30">
                  <div class="footer_about">
                    <h3>About Us</h3>
                    <div class="line-title-left"></div>
                    <p class="text-white">
                        Michelin Insurance provides Insurance for Vehicles. The company offers 2-wheeler and 4-wheeler
                        Insurance to individual customers . Customer can Buy,renew and Claim Insurance Online.
                    </p>
                  </div>
               
                </div>
                <div class="col-md-4">
                  
                </div>
                <div class="col-md-4">
                  <div class="footer_address">
                    <h3>address</h3>
                    <div class="line-title-left"></div>
                    <ul class="address-list">
                      <li>
                        <p>
                          <i class="fas fa-map-marker"></i>Andheri,Mumbai-400055,India
                        
                        </p>
                      </li>
                      <li>
                        <p><i class="fas fa-mobile-alt"></i>(022) 2245683298</p>
                      </li>
                      <li>
                        <p><i class="far fa-envelope"></i>michelin@gmail.com</p>
                      </li>
                    </ul>
                    <ul class="footer_social list-inline">
                      <li class="list-inline-item">
                        <a href="www.fb.com"><i class="fab fa-facebook-f"></i></a>
                      </li>
                      <li class="list-inline-item">
                        <a href="www.twitter.com"><i class="fab fa-twitter"></i></a>
                      </li>
                      <li class="list-inline-item">
                        <a href="www.google.com"><i class="fab fa-google-plus-g"></i></a>
                      </li>
                      
              
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </footer>
          <div class="sub-footer">
            <div class="container">
              <div class="row">
                <div class="col-md-12">
                  <p class="text-center">All Rights Reserved.</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- ***** End Main Wrapper ***** -->
    
        <!-- Jquery-2.2.4 JS -->
        <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.4.min.js"></script>
        <!-- login JS -->
        <script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
        <!-- Bootstrap-4 Beta JS -->
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
        <!-- Touch Swipe JS File Version - 1.6.18 -->
        <script src="${pageContext.request.contextPath}/resources/js/jquery.touchSwipe.min.js"></script>
        <!-- Paradise Slider Main JS File -->
        <script src="${pageContext.request.contextPath}/resources/js/paradise_slider_min.js"></script>
        <!-- Jquery Easing Js -->
        <script src="../../../../cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
        <!-- Slick Js -->
        <script src="${pageContext.request.contextPath}/resources/js/slick.min.js"></script>
        <!-- Magnific Popup Js -->
        <script src="${pageContext.request.contextPath}/resources/js/magnific-popup.js"></script>
        <!-- OWL Carousel Js -->
        <script src="${pageContext.request.contextPath}/resources/js/owl-carousel.min.js"></script>
        <!-- Custom JS -->
        <script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
      </body>
    
      <!--
        Mirrored from site.codeglamour.com/html/18/enegix/ by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 25 Nov 2018 12:55:57 GMT
      -->
    </html>
    
  </body>
</html>