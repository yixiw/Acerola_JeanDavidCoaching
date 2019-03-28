<%-- 
    Document   : gestionSeance
    Created on : 27 mars 2019, 15:52:10
    Author     : yuwei
--%>

<%@page import="java.util.List"%>
<%@page import="bd.BD"%>
<%@page import="java.util.ArrayList"%>
<%@page import="metier.Seancestandard"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion Séance</title>
    </head>
    <body>
        <!--afficher le titre-->
        <h1>Consulter une séance</h1>
        
        <!--afficher les séances par type-->
        <h2>Par type de séance</h2>
        <b>Séance Normale</b>
        <select id="seanceNormale">
            <option>--------</option>
        </select>
        <input id="SN" type="button" value="Modifier"/>

        <b>Séance Bilan</b>
        <select id="seanceBilan">
            <option>--------</option>
        </select>
        
        <!--afficher les séances par nom-->
        <h2>Par nom de séance</h2>
        <div>
            <input id="rechercherSeance" class="rechercherSeance" type="text" placeholder="Saisissez le nom de sécance"/>
            <div id="zoneAfficheSeance"/>
        </div>
        
        <!--afficher les détails de la séance-->
        <h2>Détails de la séance</h2>
        <table border="1">
            <tr>
                <th>Ordre</th>
                <th>Nom Exercice</th>
                <th>Type Exercice</th>
                <th>Séries</th>
                <th>Répétitions</th>
                <th>Temps repos(min)</th>
                <th>Durés(min)</th>
            </tr>
            <div id="details"></div>
            <tr>
                <td><input type="button" value="Modifier"></td>
                <td><input type="button" value="Supprimer"></td>
            </tr> 
        </table>
        <script type="text/JavaScript" src="js/seancexml.js"></script>
    </body>
</html>
