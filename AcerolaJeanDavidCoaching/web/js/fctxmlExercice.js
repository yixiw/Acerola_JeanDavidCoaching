function creerExercice(){

    var nomExe = document.getElementById("libelleExercice").value;
    var descriptionExe = document.getElementById("descriptionExercice").value;
    // Object XMLHttpRequest
    var xhr = new XMLHttpRequest();
    var paramNom = "nomExe=" + encodeURIComponent(nomExe);
    var paramDes = "descriptionExe=" + encodeURIComponent(descriptionExe);
     // Requête au serveur avec les paramètres éventuels.
    xhr.open("GET","ServletCreerExercice?"+paramNom+"&"+paramDes);
    xhr.onload = function(){
        // Si la requête http s'est bien passée.
        if (xhr.status === 200){
            
        }
    };
    // Envoie de la requête.
    xhr.send();
}

function afficherObjectifExe(){
    // Objet XMLHttpRequest.
    var xhr = new XMLHttpRequest();

    // Requête au serveur avec les paramètres éventuels.
    xhr.open("GET","ServletAfficherObjectifExe");

    // On précise ce que l'on va faire quand on aura reçu la réponse du serveur.
    xhr.onload = function()
            {
            // Si la requête http s'est bien passée.
            if (xhr.status === 200)
                    {
                    // Elément html que l'on va mettre à jour.
                    var elt = document.getElementById("afficherListObjectifExercice");
                    elt.innerHTML = xhr.responseText;
                    }
            };

    // Envoie de la requête.
    xhr.send();
    
}

function ajouterObjectifExe(){
    var libelleOE = document.getElementById("afficherObjectifExerciceAjoute").value;
    // Object XMLHttpRequest
    var xhr = new XMLHttpRequest();
    var param = "libelleOE=" + encodeURIComponent(libelleOE);
     // Requête au serveur avec les paramètres éventuels.
    xhr.open("GET","ServletAjouterObjectifExe?"+param);
    xhr.onload = function(){
        // Si la requête http s'est bien passée.
        if (xhr.status === 200){
            
        }
    };
    // Envoie de la requête.
    xhr.send();
}

document.addEventListener("DOMContentLoaded", () => {
//s'exécute une fois quand la page HTML est chargé.
//DOMcontentLoaded
//donc les id ici sont des élements initiaux de la page HTML, si on a un élement nouvelle ajouté par AJAX, il faut le traiter dans le AJAX
	document.getElementById("btnEnregistrerExe").addEventListener("click",creerExercice);
	//window.addEventListener("load", afficherObjectifExe);
        document.getElementById("btnAfficherObjectifExe").addEventListener("click",afficherObjectifExe);
}
);

