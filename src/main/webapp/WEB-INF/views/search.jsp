<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE HTML>
<!--
	Phantom by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>ReviewsProject</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet" href="assets/css/main.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Logo -->
				<a href="index.html" class="logo"> <span class="symbol"><img
						src="images/logo.svg" alt="" /></span><span class="title">Reviews</span>
				</a>

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="index.html">Accueil</a></li>
				<li><a href="generic.html">Mode</a></li>
				<li><a href="generic.html">Sport</a></li>
				<li><a href="generic.html">High-Tech</a></li>
				<li><a href="elements.html">Mon compte</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">
			<div class="inner">
				<header class="welcome">
					<h1>Bienvenue sur ReviewsProject, votre meilleur allié pour
						faire vos achats en ligne</h1>
					<p>Entrer simplement l'objet de votre recherche, et RP s'occupe
						de trouver les meilleures offres en ligne ainsi que les
						commentaires qui y sont associés.</p>
				</header>
				<section class="search">
					<div class="searchbar">
						<input id="searchTxt" name='searchText' class="form-control"
							placeholder="Produit, film, album" /> <span
							class="input-group-btn"> <input id="searchButton"
							class="btn btn-default" type="submit" value="Chercher" />
					</div>
					<div id="btn">
						<strong>Rechercher</strong>
					</div>
				</section>

				<section class="subtitle">
					<header class="subtitle">
						<h2>Vous pouvez aussi consultez vos articles préférés selon
							leur catégorie</h2>
						<p>RP pourra vous donner des résultats plus rapidement si vous
							lui donner plus d'informations</p>
					</header>
				</section>

				<section class="tiles">
					<!-- <h1>Ou bien visitez les espaces de vos boutiques préférées sans attendre</h1> -->
					<article class="style1">
						<span class="image"> <img src="images/category_mode.jpg"
							alt="" />
						</span> <a href="generic.html">
							<h2>Mode</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
					<article class="style2">
						<span class="image"> <img src="images/category_sport.jpg"
							alt="" />
						</span> <a href="generic.html">
							<h2>Sport</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
					<article class="style3">
						<span class="image"> <img src="images/category_tech.jpg"
							alt="" />
						</span> <a href="generic.html">
							<h2>High-Tech</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
					<article class="style4">
						<span class="image"> <img src="images/pic04.jpg" alt="" />
						</span> <a href="generic.html">
							<h2>Tempus</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
					<article class="style5">
						<span class="image"> <img src="images/pic05.jpg" alt="" />
						</span> <a href="generic.html">
							<h2>Aliquam</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
					<article class="style6">
						<span class="image"> <img src="images/pic06.jpg" alt="" />
						</span> <a href="generic.html">
							<h2>Veroeros</h2>
							<div class="content">
								<p>Sed nisl arcu euismod sit amet nisi lorem etiam dolor
									veroeros et feugiat.</p>
							</div>
						</a>
					</article>
				</section>
			</div>
		</div>

		<!-- Footer -->
		<footer id="footer">
			<div class="inner">
				<section>
					<h2>Des infos</h2>
					<p>Lorem ipsum Sed nisl arcu euismod sit amet nisi lorem etiam
						dolor veroeros et feugiat.</p>
					<p>Lorem ipsum Sed nisl arcu euismod sit amet nisi lorem etiam
						dolor veroeros et feugiat.</p>
					<p>Lorem ipsum Sed nisl arcu euismod sit amet nisi lorem etiam
						dolor veroeros et feugiat.</p>
				</section>
				<section>
					<h2>Follow</h2>
					<ul class="icons">
						<li><a href="#" class="icon style2 fa-twitter"><span
								class="label">Twitter</span></a></li>
						<li><a href="#" class="icon style2 fa-facebook"><span
								class="label">Facebook</span></a></li>
						<li><a href="#" class="icon style2 fa-instagram"><span
								class="label">Instagram</span></a></li>
						<li><a href="#" class="icon style2 fa-dribbble"><span
								class="label">Dribbble</span></a></li>
						<li><a href="#" class="icon style2 fa-github"><span
								class="label">GitHub</span></a></li>
						<li><a href="#" class="icon style2 fa-500px"><span
								class="label">500px</span></a></li>
						<li><a href="#" class="icon style2 fa-phone"><span
								class="label">Phone</span></a></li>
						<li><a href="#" class="icon style2 fa-envelope-o"><span
								class="label">Email</span></a></li>
					</ul>
				</section>
				<ul class="copyright">
					<li>&copy; Untitled. All rights reserved</li>
					<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
				</ul>
			</div>
		</footer>

	</div>

	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script src="assets/js/main.js"></script>

</body>
</html>