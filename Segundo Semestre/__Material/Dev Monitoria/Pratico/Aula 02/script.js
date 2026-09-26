const input = document.getElementById("input-tarefa");
const lista = document.getElementById("lista-tarefa");

function addTarefa () {
    const valorTarefa = input.value;
    const li = document.createElement("li");

    li.innerHTML = `
        <img src="imgs/checkbox.png" alt="Verificado" class="opcao verificado">
        <p>${valorTarefa}</p>
        <img src="imgs/delete.png" alt="Excluir" class="opcao excluir">
    `;

    li.classList = "item-tarefa";

    li.querySelector(".excluir").onclick = () => {
        li.remove();
    }

    const verificado = li.querySelector(".verificado");

    verificado.onclick = () => {
        verificado.classList.remove("opcao");
        verificado.classList.add("tarefaVerificada");
    }

    lista.appendChild(li);

    input.value = "";
}