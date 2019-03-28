<%-- 
    Document   : gestionExercice
    Created on : 27 mars 2019, 15:53:18
    Author     : 21611960
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
  <title>Gestion des Exercices</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav hidden-xs">
      <h2>Consulter Exercices</h2>
	  <h4>Chercher par nom des exercices</h4>
	    <div class="input-group">
			<input id="saisieExercice"type="text" name="nomExercice" class="form-control" placeholder="Entrez le nom d'un exercice">
			<div class="input-group-btn">
			  <button class="btn btn-default" type="submit">
				<i class="glyphicon glyphicon-search"></i>
			  </button>
			</div>
		</div>
	  <h4>Chercher par type des exercices</h4>
      <ul class="nav nav-pills nav-stacked" id="listeTypeExercice">
        <li class="active"><a href="#section1">type à afficher</a></li>
        <li><a href="#section2">type à afficher</a></li>
        <li><a href="#section3">type à afficher</a></li>
        <li><a href="#section3">type à afficher</a></li>
      </ul><br>
	  <input type="submit" value="CreerExercice" class="btn btn-default"/>
    </div>
    <br>
    
    <div class="col-sm-9">
      <div class="well">
        <h4>Informations détaillées de l'exercice choisi</h4>
        <p id="zoneAfficherInfoExe">à afficher</p>
      </div>
	  <!-- creer -->
      <div class="well">
          <h4>Créer un exercice</h4>
          <!-- 1eme ligne de partie creer -->
          <div class="row">
                <!-- colonne 1 -->
                <div class="col-sm-4">
                    <h5>Choisir une image</h5>
                    <input type="file" name="choisirMedia" id="choisirMedia" value="" accept="image/png, image/jpeg, image/jpg,.pdf"/>
                    <div class = "preview">
                        <p>Aucun fichier sélectionné pour le moment</p>
                    </div>
                
                </div>
                <!-- colonne 2 -->
                <div class="col-sm-3">
                    <h5>Libelle : </h5>
                    <input type="text" name="libelleExercice" value="" id="libelleExercice" class="form-control"/>
                </div>
                <!-- colonne 3 -->
                <div class="col-sm-4">
                    <h5>Description : </h5>
                    <textarea name="descriptionExercice" id="descriptionExercice" rows="4" cols="20" class="form-control"></textarea>
                </div>
          </div>
          <!-- 2eme ligne de partie creer -->
          <div class="row">
            <div class="col-sm-4">
                <h5>Objectif des exercices</h5>
                <select name="listeObjectifExercice" id="afficherListObjectifExercice">
                        <option>-----</option>
                </select>
                <input type="submit" value="Ajouter" name="btnAjouterObjectifExe" id="btnAjouterObjectifExe"/>
                <input type="submit" value="Afficher" name="btnAfficherObjectifExe" id="btnAfficherObjectifExe"/><br/>
                <ul id="afficherObjectifExerciceAjoute" class="list-group">
                        <%--objectifs et bouton supprimer--%>
                </ul><br/>
            </div>
            <div class="col-sm-4">
                <h5>Nombre de repetition</h5>
                <input type="number" name="nbRepetition" value="" id="nbRepetition"/>    
                <input type="submit" value="Ajouter" name="btnAjouterNbRepExe" id="btnAjouterNbRepExe"/><br/>
                <ul id="afficherNbRepAjoute" class="list-group">
                        <%--nb repetition et bouton supprimer--%>
                </ul><br/>
            </div>
          </div>
        <input type="submit" value="Enregistrer" name="btnEnregistrerExe" id="btnEnregistrerExe" class="btn btn-default"/>
        <%-- envoyer des infos et vider les champs --%>
        <input type="submit" value="Annuler" name="btnAnnulerExe" class="btn btn-primary"/>
        <%-- n'envoyer pas et rester les contenu des champs--%>
      </div>
    </div>
  </div>
</div>
<script type="text/JavaScript" src="js/fctxmlExercice.js"></script>
</body>
</html>
