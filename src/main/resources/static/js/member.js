$("#btnUpdate").click(function(){
	var dataParam ={
		"id" : $("#id").val(),
		"name" : $("#name").val(),
		"password" : $("#password").val(),
		"email" : $("#email").val(),
		"addr" : $("#addr").val(),
		"memo" : $("#memo").val()
	}
	$.ajax({
		type:'PUT',
		url:"/update/",
		data:JSON.stringify(dataParam),
		contentType: "application/json;charset=utf-8"
	})
	.done(function(resp){
		alert(resp+" :update success")
		location.href = "/list"
	})
	.fail(function(e){
		alert(e+" :failed to update")
	})
})