<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
 <link rel="stylesheet" href="/resources/css/index.css" />
<body>
	<div class="col-md-4">
		<!--Barre de recherche principale-->
		<span class="h1">ReviewsProject&COPY;</span>
		<form action="search" method="get">
			<div class="input-group input-group-lg">
				<input
					id="searchTxt" name='searchText' class="form-control"
					placeholder="Produit, film, album" /> <span
					class="input-group-btn"> <input id="searchButton"
					class="btn btn-default" type="submit" value="Chercher" />
				</span>
			</div>
			<!--Fin de la barre -->
		</form>
		<!-- /input-group -->
	</div>
	<!-- /.col-lg-6 -->
</body>
</html>