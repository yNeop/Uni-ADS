from flask import Blueprint, request, jsonify, render_template
from service.cliente_service import ClienteService

# Criando um blueprint para organizar as rotas do controlador
cliente_blueprint = Blueprint("cliente", __name__)


@cliente_blueprint.route("/")
def index():
    return render_template("index.html")


@cliente_blueprint.route("/pedidos")
def pedidos():
    return render_template("pedidos.html")


@cliente_blueprint.route("/api/pedidos", methods=["GET"])
def listar_pedidos():
    pedidos = ClienteService.listar_todos()
    if pedidos is None:
        return jsonify({"error": "Erro de conexão com o banco"}), 500
    return jsonify(pedidos)


@cliente_blueprint.route("/api/pedidos", methods=["POST"])
def cadastrar_pedido():
    resultado = ClienteService.criar_pedido(request.json)
    if "error" in resultado:
        return jsonify({"error": resultado["error"]}), resultado["code"]
    return jsonify(resultado), 201


@cliente_blueprint.route("/api/pedidos/<int:id>", methods=["PUT"])
def editar_pedido(id):
    resultado = ClienteService.editar_pedido(id, request.json)
    if "error" in resultado:
        return jsonify({"error": resultado["error"]}), resultado["code"]
    return jsonify(resultado)


@cliente_blueprint.route("/api/pedidos/<int:id>", methods=["DELETE"])
def deletar_pedido(id):
    resultado = ClienteService.deletar_pedido(id)
    if "error" in resultado:
        return jsonify({"error": resultado["error"]}), resultado["code"]
    return jsonify({"message": resultado["message"]}), resultado["code"]


@cliente_blueprint.route("/api/pedidos/<int:id>/status", methods=["PATCH"])
def alterar_status(id):
    data = request.json
    resultado = ClienteService.alterar_status(id, data.get("status"))
    if "error" in resultado:
        return jsonify({"error": resultado["error"]}), resultado["code"]
    return jsonify({"message": resultado["message"]}), resultado["code"]


@cliente_blueprint.route("/api/pedidos/truncate", methods=["DELETE"])
def resetar_banco():
    resultado = ClienteService.limpar_todos_pedidos()
    if "error" in resultado:
        return jsonify({"error": resultado["error"]}), resultado["code"]
    return jsonify({"message": resultado["message"]}), resultado["code"]
