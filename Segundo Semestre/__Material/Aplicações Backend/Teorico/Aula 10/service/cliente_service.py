from repository.cliente_repository import ClienteRepository

class ClienteService:

    def __init__(self):
        self.repository = ClienteRepository()

    def listar_clientes(self):
        clientes = self.repository.listar_todos()
        return [c.to_dict() for c in clientes]

    def buscar_cliente(self, id):
        cliente = self.repository.buscar_por_id(id)
        if cliente:
            return cliente.to_dict()
        return None
    
