const signup_form  = document.getElementById("signup-form");

signup_form.addEventListener("submit",async (e)=>{
    e.preventDefault();
    const signup_data = Object.fromEntries((new FormData(e.target)).entries()); 

    console.log(signup_data);

    try{
        const response = await fetch(uri, {
            method : "POST",
            headers : {
                "Content-type" : "application/json"
            },
            body : JSON.stringify(signup_data)

        });

        const data = response.json();
        if(response.ok){
            alert("Signup successfull!");
            window.location.href = "../home.html";
        }
    }
    catch(e){
        console.log(e);
    }
})