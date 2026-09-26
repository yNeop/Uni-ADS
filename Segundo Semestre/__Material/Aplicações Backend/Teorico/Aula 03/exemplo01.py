# Exemplo Lista

nomes = ["Ana", "Carlos", "Maria"]
print (nomes[0])
print (nomes[2])
print ("")

# Print todos da lista

for i in range(len(nomes)):
    print (nomes[i])
print ("")

# Print em lista, cochets acompanham com aspas e virgula

print (nomes)
print ("")

# Print todos da lista sem i

nomes[0] = "Amanda" # Substitui o primeiro nome

for nome in nomes:
    print(nome)
print ("")

# Adicionar e remover da lista

nomes.append("Fernanda")
nomes.append("Maria")
nomes.remove("Carlos")
nomes.remove("Maria")

for nome in nomes:
    print(nome)
print ("")