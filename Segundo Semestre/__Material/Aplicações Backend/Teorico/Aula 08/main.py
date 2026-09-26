import requests

url = "https://economia.awesomeapi.com.br/json/last/USD-BRL"

try: 
    
    resposta = requests.get(url)
    if resposta.status_code == 200:
        dados = resposta.json()
        valor_dolar = dados["USDBRL"]["bid"]
        print("Cotação do Dólar:")
        print("R$", valor_dolar)
    else:
        print("Erro ao acesar")

except Exception as e:
    print("Erro:", e)