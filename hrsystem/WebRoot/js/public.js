// head.html �ĵ����� JS
// $(".goOut").click(function(){
//    $(".closeOut").show();
//  });
//  $(".p1").click(function(){
//    $(".closeOut").hide();
//  });
//  $(".no").click(function(){
//    $(".closeOut").hide();
//  });
 // head.html �ĵ����� JS  end


//function ipout(){
//	document.getElementById('lgform').submit();
//}
/*	$(document).ready(function() {
		$('#lgdip').blur(function(event) {
			var val = $(this).val();
			$.post('yanzheng.action', {code: val}, function(data, textStatus, xhr) {
				optional stuff to do after success 
				//data �Ǻ�̨���ص����ݣ����������ж���ȷ���  
				if (data) {
					$('label#lglab').text('ͨ����֤')
				}else{
					$('label#lglab').text('����������');
					//Ȼ���ٽ�ֹfrom�ύ
				}
				
			});
		});
	});*/
// left.html ���л��ڵ�  JS1
$(function(){
	// ���չ���¼����л�ͼƬ
	$(".leftsidebar_box dt").click(function(){
		// �ȴ�������д��ڵĽڵ�,���ж��Ƿ����
		$('.icon1').hide();
		$('.icon2').show();
		$(".leftsidebar_box dt").removeClass('menu_chioce1');
		if ($(this).parent().find('dd').is(":hidden")) {
			$(this).parent().find('.icon1').show();
			$(this).parent().find('.icon2').hide();
			$(this).parent().find('.icon3').show();
			$(this).parent().find('.icon4').hide();
			$(this).addClass('menu_chioce1');
		}else{
			$(this).parent().find('.icon1').hide();
			$(this).parent().find('.icon2').show();
			$(this).parent().find('.icon3').hide();
			$(this).parent().find('.icon4').show();
			$(this).removeClass('menu_chioce1');
		}
		$(this).parent().find('dd').removeClass("menu_chioce");
		$(".menu_chioce").slideUp();
		$(this).parent().find('dd').slideToggle();
		$(this).parent().find('dd').addClass("menu_chioce");

		
	});
	$(".cks").click(function(){
		// �ȴ�������д��ڵĽڵ�,���ж��Ƿ����
		$(".icon5").hide();
		$('.coin11').hide();
		$('.coin22').show();
		$(this).parent().find('.coin11').show();
		$(this).parent().find('.coin22').hide();
		$(".leftsidebar_box .cks").removeClass('menu_chioce2');
		if ($(this).parent().find('.icon5').is(":hidden")) {
			$(this).addClass('menu_chioce2');
			$(this).parent().find('.icon5').show();
		}else{
			$(this).removeClass('menu_chioce2');
			$(this).parent().find('.icon5').hide();
		}

		
	});
})
// left.html ���л��ڵ�  JS end