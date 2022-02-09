
function MiAudio()  {


	var audioElement = new Audio('erase1.mp3');
    
	
	audioElement.play();
	
//	var audioElement = new Audio('car_horn.wav');
//	audioElement.addEventListener('loadeddata', () => {
//	  let duration = audioElement.duration;
	  // The duration variable now holds the duration (in seconds) of the audio clip 
	
	
	
}

function pedirVoto(){ 

	alert("Hola Mundo");
	if (confirm("Esta página está genial (ya la puedes ver). Me das tu voto?")){ 
	   window.open("http://www.loquesea.com/votar.php?idvoto=12111","","") 
	} 
} 