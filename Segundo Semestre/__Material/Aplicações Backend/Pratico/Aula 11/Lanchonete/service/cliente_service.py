from repository.cliente_repository import ClienteRepository


class ClienteService:

    @staticmethod
    def listar_todos():
        return ClienteRepository.fetch_all()

    @staticmethod
    def criar_pedido(data):
        cliente = data.get("cliente")
        lanche = data.get("lanche")
        quantidade = data.get("quantidade")
        status = data.get("status", "pendente")

        if not all([cliente, lanche, quantidade]):
            return {"error": "Campos obrigatórios faltando", "code": 400}

        novo_id = ClienteRepository.create(cliente, lanche, quantidade, status)
        if novo_id:
            return ClienteRepository.fetch_by_id(novo_id)
        return {"error": "Erro ao criar pedido", "code": 500}

    @staticmethod
    def editar_pedido(pedido_id, data):
        pedido = ClienteRepository.fetch_by_id(pedido_id)
        if not pedido:
            return {"error": "Pedido não encontrado", "code": 404}

        updates = []
        values = []
        for campo in ["cliente", "lanche", "quantidade", "status"]:
            if campo in data and data[campo] is not None:
                updates.append(f"{campo} = %s")
                values.append(data[campo])

        if not updates:
            return {"error": "Nenhum campo para atualizar", "code": 400}

        if ClienteRepository.update(pedido_id, updates, values):
            return ClienteRepository.fetch_by_id(pedido_id)
        return {"error": "Erro ao atualizar", "code": 500}

    @staticmethod
    def deletar_pedido(pedido_id):
        pedido = ClienteRepository.fetch_by_id(pedido_id)
        if not pedido:
            return {"error": "Pedido não encontrado", "code": 404}

        if ClienteRepository.delete(pedido_id):
            return {"message": "Pedido deletado com sucesso", "code": 200}
        return {"error": "Erro ao deletar", "code": 500}

    @staticmethod
    def alterar_status(pedido_id, novo_status):
        status_validos = ["pendente", "preparando", "pronto", "entregue"]
        if not novo_status or novo_status not in status_validos:
            return {"error": "Status inválido", "code": 400}

        pedido = ClienteRepository.fetch_by_id(pedido_id)
        if not pedido:
            return {"error": "Pedido não encontrado", "code": 404}

        if ClienteRepository.update(pedido_id, ["status = %s"], [novo_status]):
            return {"message": "Status atualizado com sucesso", "code": 200}
        return {"error": "Erro ao atualizar status", "code": 500}

    @staticmethod
    def limpar_todos_pedidos():
        if ClienteRepository.truncate():
            return {
                "message": "Todos os pedidos foram apagados e o contador resetado!",
                "code": 200,
            }
        return {"error": "Erro ao resetar banco de dados", "code": 500}
