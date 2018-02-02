AUI().ready(

	/*
	This function gets loaded when all the HTML, not including the portlets, is
	loaded.
	*/
	function(){

	}
);

Liferay.Portlet.ready(

	/*
	This function gets loaded after each and every portlet on the page.

	portletId: the current portlet's id
	node: the Alloy Node object of the current portlet
	*/

	function(portletId, node) {
	}
);


let i = 0;
Liferay.on(
	'allPortletsReady',

	/*
	This function gets loaded when everything, including the portlets, is on
	the page.
	*/
	function (){
		var button = document.getElementById('btnCollapse');
		button.onClick = changeButtonColor();
			
			function changeButtonColor(){
				i++;
				console.log(i);
				if(i % 2 == 0){
					button.style.backgroundColor = '#ff8600';
					button.style.color = '#FFF';
				}else{
					button.style.backgroundColor = '';
					button.style.color = '';
					}
				}
	}
);