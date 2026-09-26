# Exemplo Tupla

meses = ("Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dec")
print(meses)
print("")
# Não pode ser mudado, EX:
# meses [0] = "Primeiro" retorna erro de Syntax

for i in range(len(meses)):
    print(meses[i])
print("")

for mes in meses:
    print(mes)
print("")