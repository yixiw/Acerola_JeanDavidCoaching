function creerExercice(){

    var nomExe = document.getElementById("libelleExercice").value;
    var descriptionExe = document.getElementById("descriptionExercice").value;
    
    //récupérer le nombre de répétition ajouté
    var lstnbRepetExeAjoute = document.getElementsByName("lstNbRepetitionExeAjoute");
    var nbRepetExeAjoute="";
    for(var i=0; i<lstnbRepetExeAjoute.length; i++){
        nbRepetExeAjoute+=lstnbRepetExeAjoute[i].firstChild.nodeValue+",";
    }
    
    //récupérer les objectifs choisis.
    var lstobjectifExeChoisi = document.getElementsByName("lstObjectifExeChoisi");
    var objectifExeChoisi="";
    for(var i=0; i<lstobjectifExeChoisi.length; i++){
        objectifExeChoisi+=lstobjectifExeChoisi[i].firstChild.nodeValue+",";
    }
    
    // Object XMLHttpRequest
    var xhr = new XMLHttpRequest();
    var paramNom = "nomExe=" + encodeURIComponent(nomExe);
    var paramDes = "descriptionExe=" + encodeURIComponent(descriptionExe);
    var paramObj = "objectifExeChoisi=" + encodeURIComponent(objectifExeChoisi);
    var parmaNbRepet = "nbRepetExeAjoute=" + encodeURIComponent(nbRepetExeAjoute);
    alert("paramObj : "+paramObj);
    alert("parmaNbRepet : "+parmaNbRepet);
    
     // Requête au serveur avec les paramètres éventuels.
    xhr.open("GET","ServletCreerExercice?"+paramNom+"&"+paramDes+"&"+paramObj+"&"+parmaNbRepet);
    xhr.onload = function(){
        // Si la requête http s'est bien passée.
        if (xhr.status === 200){
            alert("tous la liste objectif : "+xhr.responseText);
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
    var idOE = document.getElementById("afficherListObjectifExercice").value;
    // Object XMLHttpRequest
    var xhr = new XMLHttpRequest();
    var param = "idOE=" + encodeURIComponent(idOE);
     // Requête au serveur avec les paramètres éventuels.
    xhr.open("GET","ServletAjouterObjectifExe?"+param);
    xhr.onload = function(){
        // Si la requête http s'est bien passée.
        if (xhr.status === 200){
            var elt = document.getElementById("afficherObjectifExerciceAjoute");
            var txt = xhr.responseText;
            elt.insertAdjacentHTML ('afterbegin',txt);
        }
    };
    // Envoie de la requête.
    xhr.send();
}
function ajouterNbRepetitionExe(){   
    var nbRepetition = document.getElementById("nbRepetition").value;
    var elt = document.getElementById("afficherNbRepAjoute");
    var txt = "<li value=\""+nbRepetition+"\" name=\"lstNbRepetitionExeAjoute\">"+nbRepetition+"</li>";
    elt.insertAdjacentHTML ('afterbegin',txt);
}

function prevoireImage(){
    var input = document.querySelector('input');
    var preview = document.querySelector('.preview');
    
    input.style.opacity = 0;
    
    while(preview.firstChild){
        preview.removeChild(preview.firstChild);
    }
    
    var curFiles = input.files;
    if(curFiles.length === 0){
        var param = document.createElement('p');
        param.textContent = 'No files currently selected for upload';
        preview.appendChild(para);
    }
    else{
        var list = document.createElement('ol');
        preview.appendChild(list);
        for (var i = 0; i<curFiles.length;i++){
            var listItem = document.createElement('li');
            var param = document.createElement('p');
            param.textContent = 'File name ' + curFiles[i].name + ', file size' + returnFileSize(curFiles[i].size)+'.';
            var image = document.createElement('img');
            image.src = window.URL.createObjectURL(curFiles[i]);

            listItem.appendChild(image);
            listItem.appendChild(param);
            
      list.appendChild(listItem);
        }
    }
}
function returnFileSize(number) {
  if(number < 1024) {
    return number + ' octets';
  } else if(number >= 1024 && number < 1048576) {
    return (number/1024).toFixed(1) + ' Ko';
  } else if(number >= 1048576) {
    return (number/1048576).toFixed(1) + ' Mo';
  }
}

document.addEventListener("DOMContentLoaded", () => {
//s'exécute une fois quand la page HTML est chargé.
//DOMcontentLoaded
//donc les id ici sont des élements initiaux de la page HTML, si on a un élement nouvelle ajouté par AJAX, il faut le traiter dans le AJAX
	document.getElementById("btnEnregistrerExe").addEventListener("click",creerExercice);
	window.addEventListener("load", afficherObjectifExe);
        document.getElementById("btnAfficherObjectifExe").addEventListener("click",afficherObjectifExe);
        document.getElementById("btnAjouterObjectifExe").addEventListener("click",ajouterObjectifExe);
        document.getElementById("btnAjouterNbRepExe").addEventListener("click",ajouterNbRepetitionExe);
}
);

