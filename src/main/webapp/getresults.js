 function getbalance() {
            var url;
            if (D1.value == "first")
                url = "http://localhost:1013/grades/first/" + T1.value;
            else if (D1.value == "second")
                url = "http://localhost:1013/grades/second/" + T1.value;
            else if (D1.value == "third")
                url = "http://localhost:1013/grades/third/" + T1.value;
            else
                url = "http://localhost:1013/grades/fourth/" + T1.value;

            callApi("GET", url, "", getResponse);
        }

        function getResponse(res) {
            var data = JSON.parse(res);

            if (data) {
                displayTable(data);
            } else {
                alert("Error: Invalid response format. Please check the API response.");
            }
        }

        function displayTable(data) {
            var tableHTML = "<table border='1'><tr><th>ID</th><th>Course 1</th><th>Course 2</th><th>Course 3</th><th>Course 4</th></tr>";
            tableHTML += "<tr><td>" + data.id + "</td><td>" + data.course1 + "</td><td>" + data.course2 + "</td><td>" + data.course3 + "</td><td>" + data.course4 + "</td></tr>";
            tableHTML += "</table>";

            var tableContainer = document.getElementById("table-container");
            tableContainer.innerHTML = tableHTML;
        }

        function callApi(METHOD, URL, DATA, SUCCESS) {
            var xhttp = new XMLHttpRequest();
            xhttp.open(METHOD, URL, true);
            xhttp.setRequestHeader('Content-Type', 'application/json');

            xhttp.onreadystatechange = function () {
                if (this.readyState == 4) {
                    if (this.status == 200)
                        SUCCESS(this.responseText);
                    else
                        alert("404: Service unavailable");
                }
            };

            xhttp.send(DATA);
        }