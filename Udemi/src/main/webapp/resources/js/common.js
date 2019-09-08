/*---------------------------------------------------Task Management-------------------------------------------------------*/
$(document).ready(function() {
	$("button").click(function() {
		$("#hideshow").toggle();
	});
});

/* Transfer data from one input fielfd to another */
function transferDataFromOneInputToAnother() {

	var text1 = document.getElementById("Name1").value;
	document.getElementById("Name2").value = text1;

}
/*-----------------------------------------------------------------------for Task/Phase----------------------------------------------------*/

/*$(function() {
	$('.selectpicker').selectpicker();
});
*/
/* Delete Group(Panel) */
function deleteFun(panelId) {

	if (confirm("Are you sure To Delete Group?")) {
		$('#' + panelId).remove();
	}

}

/* delete User from group */
function removeElement(parentDiv, childDiv) {
	if (confirm("Are you Remove User from Group?")) {
		var child = document.getElementById(childDiv);
		var parent = document.getElementById(parentDiv);
		parent.removeChild(child);
	}

}

function showfield(name) {

	if (name == "") {
		document.getElementById('inputBoxDiv').style.display = "block";
		document.getElementById('dropDownDiv').style.display = 'none';
	} else {
		document.getElementById('inputBoxDiv').style.display = "none";

	}

}
