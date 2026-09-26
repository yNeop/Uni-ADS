from flask import Blueprint, jsonify
from service.cliente_service import ClienteService

cliente_bp = Blueprint('cliente', __name__)

service = ClienteService()

# GET /clientes
@cliente_bp.route('/clientes', methods=['GET'])
def listar_clientes():
    clientes = service.listar_clientes()
    return jsonify(clientes)

# GET /clientes/1
@cliente_bp.route('/clientes/<int:id>', methods=['GET'])
def buscar_cliente(id):
    cliente = service.buscar_cliente(id)

    if cliente:
        return jsonify(cliente)
    
    return jsonify({"erro": "Cliente não encontrado"}), 404

