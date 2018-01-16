$(function(){
	//单个新增或修改
	$('#btn01').click(function(){
		var user = {userName:"大黄",age:"19"};
		var json = $.toJSON(user);//将JS对象转换为JSON对象
		$.ajax({
			type:"POST",
			url:"users/0",
			data:json,
			async:true,
			contentType:"application/json",
			success:function(data){
				console.log(data);
			}
		});
	});
	
	//单个传递字符串（可以传ID，就可以传userName,loginName,age）
	$('#btn02').click(function(){

		var id = "1";//单个传递字符串（推荐不要转换为JSON）
		$.ajax({
			type:"GET",
			url:"users/"+id,
			async:true,
			contentType:"application/json",
			success:function(data){
				console.log(data);
			}
		});
	});
	
});