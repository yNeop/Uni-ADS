# Exercicio 01

class Livro:
    def __init__(self, titulo, autor, paginas):
        self.titulo = titulo
        self.autor = autor
        self.paginas = paginas
    
    def mostrar_dados(self):
        print("Titulo:", self.titulo)
        print("Autor:", self.autor)
        print("Paginas:", self.paginas)

class Biblioteca:
    l1 = Livro("Alice in Wonderland", "Charles Lutwidge Dodgson", 192)
    l2 = Livro("Anne Frank: The Diary of a Young Girl", "Anne Frank", 368)
    l3 = Livro("The Anarchist Cookbook", "Willian Powell", 164)

    l1.mostrar_dados()
    print("")
    l2.mostrar_dados()
    print("")
    l3.mostrar_dados()