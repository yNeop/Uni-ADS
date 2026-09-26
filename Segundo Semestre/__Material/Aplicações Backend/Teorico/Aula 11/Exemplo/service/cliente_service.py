from repository.cliente_repository import ClienteRepository
from models.cliente import Cliente

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

    def inserir_cliente(self, nome, email):
        cliente = Cliente(None, nome, email)
        self.repository.inserir(cliente)

    def atualizar_cliente(self, id, nome, email):
        cliente = Cliente(id, nome, email)
        self.repository.atualizar(cliente)

    def deletar_cliente(self, id):
        self.repository.deletar(id)
   
    
