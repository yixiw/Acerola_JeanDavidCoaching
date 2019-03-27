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


