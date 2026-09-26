function entrar() {
    var usuario = document.getElementById("usuario").value;
    var senha = document.getElementById("senha").value;

    if (usuario === "admin" && senha === "123") {
        window.location.href = "index.html";
    } else {
        alert("Usuário ou senha incorretos!");
    }
}