/**
 * 
 */


 var userEmail = document.getElementById("email");
 var emailResult = document.getElementById("emailResult");
 let userName = document.getElementById("name");
 let userPassword = document.getElementById("pw");
 let userPassword2 = document.getElementById("pw2");
 let userPhone = document.getElementById("phonenumber");
 let userAddress = document.getElementById("address");
 
 
 if(userEmail.value==''){
	emailResult.innerText="야";
	 userEmail.focus();
	 return false;
 }
 
 
 
