# Exercicio 02

class Conta:
    def __init__(self, numero_conta, titular, saldo):
        self.numero_conta = numero_conta
        self.titular = titular
        self.saldo = saldo
    
    def depositar(self, valor):
        self.saldo = self.saldo + valor
        print("Deposito realizado!")
        print("Novo saldo:", self.saldo)
    
    def sacar(self, valor):
        if valor <= self.saldo:
            self.saldo = self.saldo - valor
            print("Saque realizado com sucesso!")
        else:
            print("Saldo insuficiente!")
    
    def mostrar_dados2(self):
        print("Numero da conta:", self.numero_conta)
        print("Titular:", self.titular)
        print("Saldo:", self.saldo)
    
conta = Conta("12345-6", "Ana Souza", 1000)

conta.mostrar_dados2()
print("")
conta.depositar(500)
print("")
conta.sacar(300)
print("")
conta.mostrar_dados2()
input()