<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>GETTING STARTED WITH BRACKETS</title>
        <meta name="description" content="An interactive getting started guide for Brackets.">
        <link rel="stylesheet" href="main.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="mainJavaScript.js"></script>
    </head>
    <body>
        <div class="headerContainer">
    <img src="images/logo.png">
        </div>

        <nav id="mainNav" style="background-color: green">
    <div>
    
    </div>
        <nav id="mainNav">
    <div>
    
    </div>
    
    <ul class="socialMedia">
        <li>&nbsp; &nbsp; &nbsp; &nbsp;</li>
        <li><a href="https://www.youtube.com/channel/UC6LXsLDriyFQCxvaIyL6cuQ" target="_blank"><img src="http://niftybuttons.com/classic/youtube.png"></a></li>
        <li><a href="https://twitter.com/bojcpchurch" target="_blank"><img src="http://niftybuttons.com/classic/twitter.png"></a></li>
        <li><a href="https://www.facebook.com/bojcpchurch" target="_blank"><img src="http://niftybuttons.com/classic/facebook.png"></a></li>
        <li><a href="https://www.linkedin.com/in/bojcp-church-759b3bb8?trk=hp-identity-name" target="_blank"><img src="http://niftybuttons.com/classic/linkedin.png"></a></li>
    </ul>
   
    <ul class="buttons">
        <li><a href="appointments.php"> Logout </a></li>
        <li id="contact"><a href="contactus.php">Contact Us</a></li>
        <li id="events">Login
            <div class="dropblock" id="servdrop">
                <ul>
                    <li><h3>Are you a?</h3></li><br />
                    <li><a href="login.spring">Customer</a></li>
                    <li><a href="${pageContext.request.contextPath}/showFormForAdd">Doctor</a></li>
                    <li><a href="${pageContext.request.contextPath}/admin/showDoctorTypeForm">Admin</a></li>
                </ul>
            </div>
        </li>
        <li><a href="about.php" style="color: lightgray;"> About </a></li>
        <li><a href="../index.php"> Home </a></li>  
    </ul>
</nav>
       
=======
>>>>>>> 038b94becfbb7955ee9edaa0dab49cf32c3841e6

<a href="${pageContext.request.contextPath}/admin/listDoctorTypes">listDoctorTypes</a>
<a href="${pageContext.request.contextPath}/admin/showDoctorTypeForm">showDoctorTypeForm</a>
<a href="${pageContext.request.contextPath}/listDoctors">listDoctors</a>
<a href="${pageContext.request.contextPath}/showFormForAdd">showFormForAdd</a>

<a href="${pageContext.request.contextPath}/admin/showLocationForm">showLocationForm</a>

<a href="registerUser.spring">Register page</a>
	<a href="login.spring">Login</a>