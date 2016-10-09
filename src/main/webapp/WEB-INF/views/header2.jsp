<%-- 
    Document   : header
    Created on : 7 déc. 2014, 16:55:05
    Author     : Yoni
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!--Include jQuery-->
<script type="text/javascript" src="js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<link rel="stylesheet" href="css/header.css" />
<link rel="stylesheet" href="css/popup.css" />
<title>Reviews Project</title>
</head>


<div id="nav_container">
	<nav id="my_nav" class='navbar-default flexcontainer' role="navigation">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-brand " onclick="redirect('index')">
				ReviewsProject</div>
			<div class="navbar-brand ">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</div>
			<div class="navbar-brand "
				onclick="location.href = 'https://www.meistertask.com/app/project/4A7TFSnb/reviewsproyect'">
				<span class="glyphicon glyphicon-star" aria-hidden="true"> </span>
				Meister Task
			</div>




			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right open">

					<!--Test sur le userBean-->
					<c:choose>
						<c:when test="${sessionScope.uBean eq null}">
							<li><a class="nav_link" id="popup_login_lien"
								href="#popup_login">Connexion</a></li>
						</c:when>

						<c:otherwise>
							<li id="lien_droite">
								<table>
									<tr>
										<td><c:out value="${sessionScope.uBean.username}" /></td>
										<td class="dropdown my_dropdown"><a href="#"
											class="dropdown-toggle" data-toggle="dropdown" role="button"
											aria-haspopup="true"><span
												class="glyphicon glyphicon-th-list glyph_nav"
												aria-hidden="true"></span></a>
											<ul class="dropdown-menu" id="dropdown-reglage">
												<li><a onclick="redirect('account2')">Mon Compte <span
														class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
												<li><a onclick="redirect('logout')">Déconnexion <span
														class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a></li>
											</ul></td>
									</tr>
								</table>
							</li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>


	<!--Popup login-->
	<div id="popup_login" class="popupContainer" style="display: none;">

		<header class="popupHeader">
			<span class="header_title">Se connecter</span> <span
				class="popup_close"><i class="fa fa-times"></i></span>
		</header>

		<div id="tabs">
			<ul class="nav nav-tabs" id="popup_tabs">
				<li role="presentation" class="active"><a href="#"
					data-toggle="tab" id="login_form" name="login_form">Connexion</a></li>
				<li role="presentation"><a href="#" data-toggle="tab"
					id="register_form" name="register_form">Inscription</a></li>
			</ul>
		</div>

		<section class="popupBody">
			<div class="main_container">

				<!-- Login -->
				<div id="logform" class="user_login formulaire">
					<!--  <jsp:include page="logform.jsp"/> -->
				</div>

				<!--Inscription-->
				<div id="regform" class="user_register formulaire">
					<!-- <jsp:include page="regform.jsp"/> -->
				</div>

				<!--Boutons-->
				<!--            <div class="action_btns">
                                <div class="one_half">
                                    <a class="btn" href="#" id="login_form" name="login_form">Connexion</a></div>
                                <div class="one_half last">
                                    <a class="btn" href="#" id="register_form" name="register_form">Inscription</a></div>
                            </div>-->



			</div>
		</section>
	</div>
</div>
<script type="text/javascript" src="js/header.js"></script>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
