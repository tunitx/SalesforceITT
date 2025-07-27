/**
 *
 */

const uri = "http://localhost:8080/login";
const login_form = document.getElementById("login-form");

login_form.addEventListener("submit", async (e) => {
  e.preventDefault();
  console.log(e.target);
  const formData = new FormData(e.target);
  const login_data = Object.fromEntries(formData.entries());
  console.log(login_data);

  try {
    const response = await fetch("login", {
      method: "POST",
      headers: {
        "Content-type": "application/json",
      },
      body: JSON.stringify(login_data),
    });

    const data =  response.json();
    if (response.ok) {
      alert("Login successfull!");
      window.location.href = "../home.html";
    }
  } catch (e) {
    console.log(e);
  }
});
