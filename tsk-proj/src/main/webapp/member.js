$(document).ready(function() {

	var select = $("#taskSel");
	loadTasksData(select);

	var button = $("#btnTask");
	loadMemberTask(button);

	// $(document).on('click', '#saveBtn', function() {
	// alert("Clicked..")
	// })

});

function loadMemberTask(button) {
	var apiurl="";
}

function loadTasksData(select) {
	var apiUrl = "/role/list";

	$.ajax({
		async : true,
		type : "GET",
		url : apiUrl,
		success : function(list) {

			$.each(list, function(key, value) {
				var id = value['id'];
				var name = value['name'];

				var option = $("<option value=\"" + id + "\">" + name
						+ "</option>");
				select.append(option);
			});
		}
	});
}