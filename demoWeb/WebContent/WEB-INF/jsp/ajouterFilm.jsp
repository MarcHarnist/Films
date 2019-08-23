<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un film</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>


	<div class="container-fluid m-3">
	<div class="row">
		<div class="col-lg-6 offset-lg-3 col-md-10 offset-md-1">
		<h1 class="display-1 m-5">Ajout d'un film</h1>
			<form role="form" method="post" action="<%=request.getContextPath()%>/AjouterServlet">
			
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="titre">Titre</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="titre" name="titre" value="Le nom de la rose">
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="annee">Année</label>
				</div>
					<div class="col-lg-10">
						<input type="number" min="1900" max="2099" step="1" name="annee" value="2019" />
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="style">Style</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="style" name="style" value="action">
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="realisateur">Réalisateur</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="realisateur" name="realisateur" value="Jean-Jacques Anneau">
					</div>
				</div>
					
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="duree">Durée</label>
				</div>
					<div class="col-lg-1">
						<input type="text" class="form-control" id="duree" name="heure" value="1">
					</div>
					<div class="col-lg-1">
						<input type="text" class="form-control" id="minutes" name="minutes" value="30">
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="vu">Vu</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="vu" value="vu">
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="acteur1">Acteur 1</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="acteur1" name="acteur1" value="Sean Connery">
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="acteur2">Acteur 2</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="acteur2" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="acteur3">Acteur 3</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="acteur3" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="acteur4">Acteur 4</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="acteur4" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-lg-2">
						<label for="acteur5">Acteur 5</label>
				</div>
					<div class="col-lg-10">
						<input type="text" class="form-control" id="acteur5" />
					</div>
				</div>
				
				<div class="form-group row">
					<div class="col-lg-2">
						
						<label for="synopsis">Synopsis</label>
				</div>
					<div class="col-lg-10">
						<textarea type="text" class="form-control" id="synopsis">Film d'action et d'intrigue</textarea>
					</div>
				</div>
				
				<div class="form-group">
				<button type="submit" class="btn btn-primary">
					Valider
				</button>
			</form>
		</div>
	</div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>