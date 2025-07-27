const signup_form = document.getElementById("signup-form");

signup_form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const formData = new FormData(e.target);
  const params = new URLSearchParams(formData);

  try {
    const response = await fetch("signup", {
      method: "POST",
      headers: {
        "Content-type": "application/x-www-form-urlencoded",
      },
      body: params.toString(),
    });

    const message = await response.text(); 

    if (response.ok) {
      alert(message); 
      window.location.href = "/auth_app/home.html";
    } else {
      alert(message); 
    }
  } catch (e) {
    console.log("Error: ", e);
    alert("Something went wrong during signup.");
  }
});

document.getElementById("toggle-password").addEventListener("click", function () {
  const passwordInput = document.getElementById("password");
  const toggleIcon = this;

  if (passwordInput.type === "password") {
    passwordInput.type = "text";
    toggleIcon.classList.add("showing");
  } else {
    passwordInput.type = "password";
    toggleIcon.classList.remove("showing");
  }
});
