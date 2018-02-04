AUI().ready(

	/*
	This function gets loaded when all the HTML, not including the portlets, is
	loaded.
	*/

	function(){
		let i = 0;
			
		var button = document.getElementById('btnCollapse');	
		var text = document.getElementById('btnChild');

		function changeButtonColor(){
			i++;
			console.log(i);
			if(i % 2 == 1){
				button.style.backgroundColor = '#ff8600';
				text.style.color = '#FFF';
			}else{
				button.style.backgroundColor = '';
				text.style.color = '';
				}
			}

		$("#btnCollapse").click(changeButtonColor);
	

		// Hide Header on on scroll down
		var didScroll;
		var lastScrollTop = 0;
		var delta = 5;
		var navbarHeight = $("#banner").outerHeight();

		$(window).scroll(function(event){
		    didScroll = true;
		});

		setInterval(function() {
			console.log(navbarHeight);
		    if (didScroll) {
		        hasScrolled();
		        didScroll = false;
		    }
		}, 250);

		function hasScrolled() {
		    var st = $(this).scrollTop();
		    
		    // Make sure they scroll more than delta
		    if(Math.abs(lastScrollTop - st) <= delta){
		        return;
		    }
		    
		    // If they scrolled down and are past the navbar, add class .nav-up.
		    // This is necessary so you never see what is "behind" the navbar.
		    if (st > lastScrollTop && st > navbarHeight){
		        // Scroll Down
		        $("#banner").removeClass("nav-down").addClass("nav-up");
	            if($("#navbarSupportedContent").attr("class") == "navbar-collapse collapse in"){	
	            	$("#navbarSupportedContent").attr("class","navbar-collapse collapse");
	            	changeButtonColor();
		    		}
		    } else {
		        // Scroll Up
		        if(st + $(window).height() < $(document).height()) {
		        	console.log('7');
		            $("#banner").removeClass("nav-up").addClass("nav-down");

		        }
		    }
		    
		    lastScrollTop = st;
		}

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



Liferay.on(
	'allPortletsReady',

	/*
	This function gets loaded when everything, including the portlets, is on
	the page.
	*/
	function (){

	}
);