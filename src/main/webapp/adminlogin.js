function save() {
    var name = $('#T1').val();
    var password = $('#T2').val();

    $.ajax({
        type: 'POST',
        url: 'http://localhost:1013/login/validate',
        contentType: 'application/json',
        data: JSON.stringify({
            "name": name,
            "password": password
        }),
        success: function(response) {
            if (response === "Login successful") {
                window.location.href = "admin_home.html";
            } else {
                alert("Enter details correctly");
            }
        },
        error: function(error) {
            alert("Error: " + JSON.stringify(error));
        }
    });
}
