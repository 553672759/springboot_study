 $("#login-button").click(function(event){
		 event.preventDefault();
	 
	 $('.wrapper').addClass('form-success');
	 var form = document.getElementById('form');
	form.submit();
});