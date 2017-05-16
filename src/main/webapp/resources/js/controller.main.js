var main=main || {};
main.context=(function(){
	return {init : function(context){
		window.setInterval(function(){
			var next = ($('.open').index()+1)%('.imgcount').length;
			$('.open').removeClass('open').fadeOut(1500);
			$('.imgcount').eq(next).addClass('open').fadeIn(1000);
		},2500);
				$.getScript(context+'/resources/js/domain.session.js',function(){
						$.extend(new Session(context));
				
				})
			}};
})();