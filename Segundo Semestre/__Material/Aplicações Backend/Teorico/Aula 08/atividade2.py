import requests

# Entrada do usuário
cep = input("Digite o CEP (somente números): ").strip()

# Validação simples
if not cep.isdigit() or len(cep) != 8:
    print("CEP inválido! Digite exatamente 8 números.")
else:
    url = f"https://viacep.com.br/ws/{cep}/json/"

    try:
        resposta = requests.get(url)
        dados = resposta.json()

        # Verifica se o CEP existe
        if "erro" in dados:
            print("CEP não encontrado.")
        else:
            print("\n📍 Endereço encontrado:")
            print(f"Logradouro: {dados.get('logradouro', 'N/A')}")
            print(f"Bairro: {dados.get('bairro', 'N/A')}")
            print(f"Cidade: {dados.get('localidade', 'N/A')}")
            print(f"Estado: {dados.get('uf', 'N/A')}")

    except Exception as e:
        print("Erro ao consultar a API:", e)