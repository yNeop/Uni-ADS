function fazerLogin() {
    const usuario =
    document.getElementById(
    "usuario").value;
    const senha =
    document.getElementById(
    "senha").value;
    const erro =
    document.getElementById("erro");
    if (usuario === "admin"
    && senha === "123") {
    document.getElementById(
    "login-container"
    ).style.display = "none";
    document.getElementById(
    "sistema"
    ).style.display = "block";
    carregarHeader();
    } else {
    erro.innerText =
    "Usuário ou senha inválidos!";
    }
}

function carregarHeader() {
    fetch("header.html")
    .then(response =>
    response.text())
    .then(data => {
    document.getElementById(
    "header"
    ).innerHTML = data;
    });
}