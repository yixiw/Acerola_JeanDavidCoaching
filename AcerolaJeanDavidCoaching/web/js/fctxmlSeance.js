function afficherSeanceNormale(){
    var xhr = new XMLHttpRequest();
    alert("open");
    xhr.open("GET", "ServletTypeSeance?bilan=0");
    alert("open");
    xhr.onload = function () {
        if (xhr.status === 200) {
            var listeSN = xhr.responseXML.getElementsByTagName("seance"); 
            var texte = "<option>--------</option>";
            alert("js");
            
            for(var i = 0; i < listeSN.length; i++){
                texte += "<option>" + listeSN[i].firstChild.nodeValue + "</option>";
                alert(listeSN[i].firstChild.nodeValue);
            }
            
            var elt = document.getElementById("seanceNormale");
            elt.innerHTML = texte;
            
        }
    }
    
    xhr.send();        
}

function afficherSeanceBilan(){
    var xhr = new XMLHttpRequest();
    alert("open");
    xhr.open("GET", "ServletTypeSeance?bilan=1");
    alert("open");
    xhr.onload = function () {
        if (xhr.status === 200) {
            var listeSN = xhr.responseXML.getElementsByTagName("seance"); 
            var texte = "<option>--------</option>";
            alert("js");
            
            for(var i = 0; i < listeSN.length; i++){
                texte += "<option>" + listeSN[i].firstChild.nodeValue + "</option>";
                alert(listeSN[i].firstChild.nodeValue);
            }
            
            var elt = document.getElementById("seanceBilan");
            elt.innerHTML = texte;
            
        }
    }
    
    xhr.send();    
}
/**
 * rechercher des noms de séance correspondent le mot que l'utilisateur saisit.
 * mettre à jour l'interface.
 * @returns {}
 */
function rechercherNomSeance() {
    //Créer un objet XMLHttpRequest
    var xhr = new XMLHttpRequest();
    var recherche = encodeURIComponent(document.getElementById("rechercherSeance").value);
    //Récupérer les noms de séances
    xhr.open("GET", "ServletConsulterSeance?nomSeance=" + recherche);
    xhr.onload = function () {
            if (xhr.status === 200) {
                document.getElementById("zoneAfficheSeance").style.display = "none";
                var listeSeance = xhr.responseXML.getElementsByTagName(""); //nom de balise
                var texte = "";
                
                if(listeSeance.length > 0){
                    document.getElementById("zoneAfficheSeance").style.display = "block";
                    for(var i = 0; i<listeSeance.length; i++){
                        texte += "<div class='zoneAfficheSeance'>" + listeSeance[i].firstChild.nodeValue + "</div>";
                    }
                } else {
                    document.getElementById("zoneAfficheSeance").style.display = "none";
                }
                
                var elt = document.getElementById("zoneAfficheSeance");
                elt.innerHTML = texte;
                
                var choix = document.querySelectorAll(".listeSeance");
                for(var i = 0; i < choix.length; i++){
                    choix[i].addEventListener("click", afficherDetailsR);
                }
            }
        };

    xhr.send();
}

/**
 * afficher les détaills d'une séance dans un tableau pour une séance normale.
 * @returns {}
 */
function afficherDetailsSN() {
    //Créer un objet XMLHttpRequest
    var xhr = new XMLHttpRequest();

    var sn = encodeURIComponent(document.getElementById("seanceNormale").value);
    if (sn !== "Séance Normale") {
        //Récupérer les détails de la séance via une requête
        xhr.open("GET", "servletDetailSeance?nomSeance=" + sn); //le nom de servlet à modifier
        xhr.onload = function () {
            if (xhr.status === 200) {
                var ordre = xhr.responseXML.getElementsByTagName("ordre");
                var nomExercice = xhr.responseXML.getElementsByTagName("nomExercice"); 
                var typeExercice = xhr.responseXML.getElementsByTagName("typeExercice"); 
                var series = xhr.responseXML.getElementsByTagName("series"); 
                var repetitions = xhr.responseXML.getElementsByTagName("repetitions"); 
                var tempsRepos = xhr.responseXML.getElementsByTagName("tempsRepos"); 
                var duree = xhr.responseXML.getElementsByTagName("duree");
                var texte = "";

                for (var i = 0; i < ordre.length; i++) {
                    texte += "<tr>";
                    texte += "<td>" + ordre[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + nomExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + typeExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + series[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + repetitions[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + tempsRepos[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + duree[i].firstChild.nodeValue + "</td>";
                    texte += "</tr>";
                }

                var elt = document.getElementById("details");
                elt.innerHTML = texte;
            }
        };

        xhr.send();

    }

}

/**
 * afficher les détaills d'une séance dans un tableau pour une séance bilan.
 * @returns {}
 */
function afficherDetailsSB() {
    //Créer un objet XMLHttpRequest
    var xhr = new XMLHttpRequest();

    var sb = encodeURIComponent(document.getElementById("seanceBilan").value);
    //Récupérer les détails de la séance via une requête
    if (sb !== "Séance Normale") {
        //Récupérer les détails de la séance via une requête
        xhr.open("GET", "servletDetailSeance?nomSeance=" + sb); //le nom de servlet à modifier
        xhr.onload = function () {
            if (xhr.status === 200) {
                var ordre = xhr.responseXML.getElementsByTagName("ordre");
                var nomExercice = xhr.responseXML.getElementsByTagName("nomExercice"); 
                var typeExercice = xhr.responseXML.getElementsByTagName("typeExercice"); 
                var series = xhr.responseXML.getElementsByTagName("series"); 
                var repetitions = xhr.responseXML.getElementsByTagName("repetitions"); 
                var tempsRepos = xhr.responseXML.getElementsByTagName("tempsRepos"); 
                var duree = xhr.responseXML.getElementsByTagName("duree");
                var texte = "";

                for (var i = 0; i < ordre.length; i++) {
                    texte += "<tr>";
                    texte += "<td>" + ordre[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + nomExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + typeExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + series[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + repetitions[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + tempsRepos[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + duree[i].firstChild.nodeValue + "</td>";
                    texte += "</tr>";
                }

                var elt = document.getElementById("details");
                elt.innerHTML = texte;
            }
        };

        xhr.send();

    }

}

/**
 * afficher les détaills d'une séance dans un tableau pour la zone de recherche.
 * @returns {}
 */
function afficherDetailsR() {
    //Créer un objet XMLHttpRequest
    var xhr = new XMLHttpRequest();

    var recherche = encodeURIComponent(document.getElementById("zoneAfficheSeance").value);
    if (recherche !== "")
        //Récupérer les détails de la séance via une requête
        xhr.open("GET", "servletDetailSeance?nomSeance=" + recherche); //le nom de servlet à modifier
        xhr.onload = function () {
            if (xhr.status === 200) {
                var ordre = xhr.responseXML.getElementsByTagName("ordre");
                var nomExercice = xhr.responseXML.getElementsByTagName("nomExercice"); 
                var typeExercice = xhr.responseXML.getElementsByTagName("typeExercice"); 
                var series = xhr.responseXML.getElementsByTagName("series"); 
                var repetitions = xhr.responseXML.getElementsByTagName("repetitions"); 
                var tempsRepos = xhr.responseXML.getElementsByTagName("tempsRepos"); 
                var duree = xhr.responseXML.getElementsByTagName("duree");
                var texte = "";

                for (var i = 0; i < ordre.length; i++) {
                    texte += "<tr>";
                    texte += "<td>" + ordre[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + nomExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + typeExercice[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + series[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + repetitions[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + tempsRepos[i].firstChild.nodeValue + "</td>";
                    texte += "<td>" + duree[i].firstChild.nodeValue + "</td>";
                    texte += "</tr>";
                }

                var elt = document.getElementById("details");
                elt.innerHTML = texte;
            }
        };

        xhr.send();

    }


document.addEventListener("DOMContentLoaded", () => {
    document.getElementById("SN").addEventListener("click",afficherSeanceNormale);
    document.getElementById("seanceBilan").addEventListener("click",afficherSeanceBilan);   
    document.getElementById("rechercherSeance").addEventListener("input", rechercherNomSeance);
    document.getElementById("seanceNormale").addEventListener("change", afficherDetailsSN);
    document.getElementById("seanceBilan").addEventListener("change", afficherDetailsSB);
    window.addEventListener("load",afficherSeanceNormale);
    window.addEventListener("load",afficherSeanceBilan);
}
);



