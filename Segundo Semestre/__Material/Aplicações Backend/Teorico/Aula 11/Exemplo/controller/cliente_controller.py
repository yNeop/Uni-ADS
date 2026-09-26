from flask import Blueprint, jsonify, render_template, request
from service.cliente_service import ClienteService

cliente_bp = Blueprint('cliente', __name__)
service = ClienteService()

# GET /clientes
@cliente_bp.route('/clientes', methods=['GET'])
def listar_clientes():
    clientes = service.listar_clientes()
    return jsonify(clientes)


# POST /formCadastrar
@cliente_bp.route('/formCadastrar', methods=['POST'])
def inserir_cliente():
    nome = request.form['nome']
    email = request.form['email']
    service.inserir_cliente(nome, email)
    return render_template('sucesso.html')

# EDITAR
@cliente_bp.route('/clientes/<int:id>', methods=['PUT'])
def atualizar_cliente(id):
    dados = request.get_json()
    nome = dados['nome']
    email = dados['email']
    service.atualizar_cliente(id, nome, email)
    return jsonify({
        'mensagem': 'Cliente atualizado com sucesso'
    })


# DELETAR
@cliente_bp.route('/clientes/<int:id>', methods=['DELETE'])
def deletar_cliente(id):
    service.deletar_cliente(id)
    return jsonify({
        'mensagem': 'Cliente deletado com sucesso'
    })