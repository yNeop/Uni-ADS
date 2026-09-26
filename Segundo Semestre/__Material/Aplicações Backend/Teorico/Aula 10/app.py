from flask import Flask
from controller.cliente_controller import cliente_bp

app = Flask(__name__)

# registrar rotas
app.register_blueprint(cliente_bp)

if __name__ == "__main__":
    app.run(debug=True)