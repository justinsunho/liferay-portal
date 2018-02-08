AUI().ready(

	/* This function gets loaded when all the HTML, not including the portlets, is loaded. */
	function() {
		hideHeadingScroll();
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

	/* This function gets loaded when everything, including the portlets, is on the page. */
	function() {
	}
);

hideHeadingScroll(){
	var delta = 10;
	var lastScrollTop = 0;
	var navbarHeight = $('#banner').outerHeight();
	var scrolling;

	$(window).scroll(
		function(event) {
			scrolling = true;
		}
	);

	setInterval( 
		function() {
				if (scrolling) {
					moveBar();
					
					scrolling = false;
				}
		}, 
		250
	);

	function moveBar() {
		var scrollTop = $(this).scrollTop();

		if (Math.abs(lastScrollTop - scrollTop) > delta) {

			if (scrollTop > lastScrollTop && scrollTop > navbarHeight) {

				$('#banner').removeClass('nav-down').addClass('nav-up');

				if ($('#navbarSupportedContent').hasClass('navbar-collapse collapse in') {
					$('.navbar-collapse').removeClass('in');
					$('.navbar-collapse').attr('aria-expanded', 'false');
					
					$('.navbar-toggle').addClass('collapsed');
					$('.navbar-toggle').attr('aria-expanded', 'false');
				}
			}
			else {

				if (scrollTop + $(window).height() < $(document).height()) {
					$('#banner').removeClass('nav-up').addClass('nav-down');
				}
			}

			lastScrollTop = scrollTop;
		}
	}
}