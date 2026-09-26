from flask import Flask
from flask_cors import CORS
from controller.cliente_controller import cliente_blueprint

app = Flask(__name__)
CORS(app)

# Registra as rotas mapeadas no Controller
app.register_blueprint(cliente_blueprint)

if __name__ == "__main__":
    app.run(debug=True, port=5000)
