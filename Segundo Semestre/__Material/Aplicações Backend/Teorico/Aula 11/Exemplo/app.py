from flask import Flask, render_template
from controller.cliente_controller import cliente_bp

app = Flask(__name__)

# registra o blueprint
app.register_blueprint(cliente_bp)


# página inicial
@app.route('/')
def home():
    return render_template('index.html')


# página cadastrar
@app.route('/cadastrar')
def cadastrar():
    return render_template('cadastrar.html')


# página listar
@app.route('/listar')
def listar():
    return render_template('listar.html')


if __name__ == '__main__':
    app.run(debug=True)