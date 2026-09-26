import requests
from geopy.geocoders import Nominatim

# 1. Converte "São Paulo" em coordenadas (Lat/Lon)
geolocator = Nominatim(user_agent="meu_app_clima")

cidade = input("Digite o nome da cidade seguido do estado: ")

location = geolocator.geocode(cidade)

if location:
    lat, lon = location.latitude, location.longitude
    
    # 2. Chama a API do Open-Meteo (sem chave necessária)
    url = f"https://api.open-meteo.com/v1/forecast?latitude={lat}&longitude={lon}&current_weather=true&hourly=temperature_2m"
    response = requests.get(url)
    data = response.json()
    
    # 3. Exibe o resultado
    clima_atual = data['current_weather']
    print(f"Temperatura agora em {cidade}: {clima_atual['temperature']}°C")
else:
    print("Cidade não encontrada")