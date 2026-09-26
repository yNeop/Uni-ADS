from datetime import datetime, timedelta
import bcrypt
import secrets

from models.usuario import Usuario
from repository.usuario_repository import UsuarioRepository


class UsuarioService:

    def __init__(self):
        self.repository = UsuarioRepository()
    
    def gerar_token_recuperacao(self, email):

        token = secrets.token_urlsafe(32)

        expiracao = datetime.now() + timedelta(minutes=30)

        self.repository.salvar_token(
            email,
            token,
            expiracao
        )

        return token

    def cadastrar(self, nome, email, senha):
        if not nome or not email or not senha:
            raise ValueError("Todos os campos são obrigatórios!")
        
        senha_criptografada = bcrypt.hashpw(senha.encode("utf-8"),bcrypt.gensalt())
        usuario = Usuario(None,nome,email,senha_criptografada.decode("utf-8"))
        self.repository.salvar(usuario)

    def trocar_senha(self, usuario_id, nova_senha):
        senha_criptografada = bcrypt.hashpw(nova_senha.encode("utf-8"),bcrypt.gensalt())
        self.repository.atualizar_senha(usuario_id,senha_criptografada.decode("utf-8"))
        
    def autenticar(self, email, senha):
        usuario = self.repository.buscar_por_email(email)
        if usuario is None:
            return None
        senha_banco = usuario["senha"]
        if bcrypt.checkpw(senha.encode("utf-8"),senha_banco.encode("utf-8")):
            print(usuario)
            print(type(usuario))
            return usuario
        
        return None
    
    def limpar_token(self, usuario_id):
        self.repository.limpar_token(usuario_id)
