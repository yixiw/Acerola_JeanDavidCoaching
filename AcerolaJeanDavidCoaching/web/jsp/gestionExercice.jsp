<%-- 
    Document   : gestionExercice
    Created on : 27 mars 2019, 15:53:18
    Author     : 21611960
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion des Exercices</title>
    </head>
    <body>
        <h1>Gestion des Exercices</h1>
        <div id = "boiteConsulter">
            <div id = "boiteConsulterGauche">
                <h2>Consulter les exercices</h2>
                <h3>Chercher par type des exercices</h3>
                <div id="listeTypeExercice">
                    <%--pour chaque type de l'exercice, on va afficher tous les exercices sous ce type en fonction de combobox--%>
                </div>
                <h3>Chercher par nom des exercices</h3>
                <input id="saisieExercice"type="text" name="nomExercice" value="" placeholder="Entrez le nom d'un exercice"/>
            </div>
            <div id = "boiteConsulterDroit">
                <h2>Informations détaillées de l'exercice choisi</h2>
                <div id="zoneAfficherInfoExe">
                    <%--print differente elements--%>
                </div>
            </div>
                <input type="submit" value="CreerExercice" />
        </div>
        <div id = "boiteCreer">
            <h3>Libelle</h3>
            <input type="text" name="libelleExercice" value="" id="libelleExercice"/>
            <h3>Description</h3>
            <textarea name="descriptionExercice" id="descriptionExercice" rows="4" cols="20"></textarea><br/>
            <h3>Choisir un image</h3>
            <input type="file" name="choisirMedia" id="choisirMedia" value="" />
            <div id="boiteCreerGauche">
                <h3>Objectif des exercices</h3>
                <select name="listeObjectifExercice" id="afficherListObjectifExercice">
                    <option>-----</option>
                </select>
                <input type="submit" value="Ajouter" name="btnAjouterObjectifExe" id="btnAjouterObjectifExe"/><br/>
                <div id="afficherObjectifExerciceAjoute">
                    <%--objectifs et bouton supprimer--%>
                </div><br/>
            </div>
            <div id="boiteCreerDroit">   
                <h3>Nombre de repetition</h3>
                <input type="number" name="nbRepetition" value="" id="nbRepetition"/>    
                <input type="submit" value="Ajouter" name="btnAjouterNbRepExe" /><br/>
                <div id="afficherNbRepAjoute">
                    <%--nb repetition et bouton supprimer--%>
                </div><br/>
            </div> 
                <input type="submit" value="Enregistrer" name="btnEnregistrerExe"/>
                <%-- envoyer des infos et vider les champs --%>
                <input type="submit" value="Annuler" name="btnAnnulerExe"/>
                <%-- n'envoyer pas et rester les contenu des champs--%>
        </div>
    </body>
</html>
