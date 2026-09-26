class Pedido:
    def __init__(self, id, cliente, lanche, quantidade, status, data_criacao=None):
        self.id = id
        self.cliente = cliente
        self.lanche = lanche
        self.quantidade = quantidade
        self.status = status
        self.data_criacao = data_criacao

    def to_dict(self):
        return {
            "id": self.id,
            "cliente": self.cliente,
            "lanche": self.lanche,
            "quantidade": self.quantidade,
            "status": self.status,
            "data_criacao": str(self.data_criacao) if self.data_criacao else None,
        }
