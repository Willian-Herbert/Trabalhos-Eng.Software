# importa o itemgetter
from operator import itemgetter
# criação da lista vazia
listaEstoque = []
while True:
    # criação do dicionário
    produto = {}
    print("Estoque de produtos")
    while True:
        # entrada de dados e break caso digitado 0
        produto['Código'] = int(input("Digite o código do produto:"))
        if (produto['Código'] == 0):
            print("Programa encerrado...")
            break
        produto['Estoque'] = input("Digite o estoque atual do produto:")
        produto['Mínimo'] = input("Digite o estoque mínimo do produto:")
        # adiciona uma cópia do dicionário a lista
        listaEstoque.append(produto.copy())
        # ordena de acordo com o código
        listaOrdenada = sorted(listaEstoque, key=itemgetter('Código'))
        # printa na tela a lista
        print(listaOrdenada)
        print("-" * 100)
    break
