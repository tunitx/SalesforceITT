/**
 * 
 */
function logout() {
	  fetch("logout").then(() => location.href = "/auth_app/index.html");
	}
function viewUsers() {
	  fetch("users")
	    .then(res => {
	      if (!res.ok) {
	        throw new Error("Session Expired, please login again!");
	      }
	      return res.json();
	    })
	    .then(data => {
	      const tbody = document.querySelector("#userTable tbody");
	      tbody.innerHTML = "";
	      data.forEach(email => {
	        const row = document.createElement("tr");
	        row.innerHTML = `<td>${email}</td>`;
	        tbody.appendChild(row);
	      });
	    })
	    .catch(err => {
	      alert(err.message);  
	      console.log("Error:", err);
	      window.location.href = "/auth_app/index.html";  
	    });
	}
	
window.onload = function () {
	  fetch("session-info")
	    .then(res => {
	      if (!res.ok) throw new Error("Session expired. Please login again.");
	      return res.text();
	    })
	    .then(email => {
	      document.getElementById("welcomeText").textContent = `Welcome, ${email}`;
	    })
	    .catch(err => {
	      alert(err.message);
	      window.location.href = "/auth_app/index.html";
	    });
	};

