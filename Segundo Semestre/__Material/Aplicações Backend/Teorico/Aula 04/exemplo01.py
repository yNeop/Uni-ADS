def saudacao():
    print("Olá, boa noite")

def mensagem(nome):
    print("Olá, boa noite", nome)

def soma(n1,n2):
    print("Soma =", (n1 + n2))

def calcular_media(nota1,nota2):
    media = (nota1+nota2) / 2
    return media

def cotacao(real,cotacao_dolar=5.23):
    resultado = real / cotacao_dolar
    return resultado

def verificar_par(numero):
    if numero % 2 == 0:
        print("Número PAR")
    else:
        print("Numero IMPAR")

def tabuada(numero):
    for i in range(1,10):
        print(numero,"x", i,"=", numero*i)

saudacao()
mensagem("Rosa")
mensagem("Salvador")
soma(5,3)
soma(10,20)
print("A media é igual",calcular_media(6.5,4.5))
print("O valor da conversão em dolar", cotacao(1000, 5.19))
verificar_par(7)
verificar_par(10)
tabuada(5)