$(function () { $("[data-toggle='tooltip']").tooltip(); });


$(document).ready(function(){
	$(".disclaimer_btn a").click(function(e){
		$(".main_area").css({"background":"none"});
		$(".main").hide();
		$(".footer_area").hide();
		$(".disclaimer").show();
		$(".disclaimer").css({"transform":"scale(0.1)"});
		$('.disclaimer').animate({transform:'scale(1,1)'}, 500);
		e.preventDefault();
	});
	
	$(".close_icon").click(function(e){
		$('.disclaimer').animate({transform:'scale(0,0)'}, 500, function(){
			$(".disclaimer").hide();
			$(".footer_area").show();
			$(".main").show();
			$(".main_area").css({"background":"rgba(0,0,0,0)"});
		});
		
		e.preventDefault();
	});
});

$(document).ready(function(){
  $('.bxslider').bxSlider({
	slideSelector	: '.slide',
	auto			: 'true',
	touchEnabled	: 'false',
	pause			: 8500,
	speed			: 3000,
	mode			: 'fade'
  });
});
