function darkMode(){
			if (document.getElementById("theme").innerText == "Dark Mode Theme"){
				document.getElementById("theme").innerHTML = "Light Mode Theme";
				localStorage.setItem("mode", "dark");
			}else{
				document.getElementById("theme").innerHTML = "Dark Mode Theme";
				localStorage.setItem("mode", "light");
			}
			document.body.classList.toggle("darkTheme");
			
}
function getTheme(){
	if (localStorage.getItem("mode") == "dark"){
		darkMode();
	}
}