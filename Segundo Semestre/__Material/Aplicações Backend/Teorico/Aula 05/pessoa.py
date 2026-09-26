class Pessoa:
    # Metodo Construtor - método que será chamado quando um objeto for criado
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
    
    def apresentar(self):
        print("Olá, meu nome é", self.nome, "tenho", self.idade, "anos")