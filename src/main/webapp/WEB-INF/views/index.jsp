<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<jsp:include page="header2.jsp" />

<div class="col-sm-4">
	<%--<jsp:include page="TestJSF.xhtml"/>--%>
</div>

<div class="col-sm-12">
	<!--<jsp:include page="category.jsp" /> -->
	<link rel="stylesheet" href="css/index.css" />

	<div class="row" id="Main_Rech_Barre">
		<div class="col-md-4"></div>





		<div class="col-md-4">
			<!--Barre de recherche principale-->
			<span class="h1">ReviewsProject&COPY;</span>
			<form action="controller" method="get">
				<div class="input-group input-group-lg">
					<input type="hidden" name='path' value="search" /> <input
						id="searchTxt" name='search_value' class="form-control"
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

		<div class="col-md-4"></div>
	</div>
</div>


</body><jsp:include page="footer.jsp" />
<script src="js/header.js" />
</html>