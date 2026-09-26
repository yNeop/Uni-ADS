import requests

url = "https://economia.awesomeapi.com.br/json/last/USD-BRL"

valorInput = float(input("Digite um Valor em Dolar: "))

# Faz a requisição para a API
response = requests.get(url)

# Converte a resposta para JSON
dados = response.json()

# Pega a cotação atual do dólar (campo 'bid')
cotacao = float(dados['USDBRL']['bid'])

# Converte o valor
valor_em_reais = valorInput * cotacao

# Exibe o resultado
print(f"Cotação atual do dólar: R$ {cotacao:.2f}")
print(f"Valor informado: $ {valorInput:.2f}")
print(f"Valor em reais: R$ {valor_em_reais:.2f}")