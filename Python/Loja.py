# importa o pandas e o matplot para ler a tabela e fazer gráficos
import pandas as pd
import matplotlib.pyplot as plt

# Faz a entrada da planilha que está na mesma pasta que o código, define o separador vírgula entre os campos e o encoding para não ter caracteres estranhos
csv = pd.read_csv('Stores.csv', sep=',', encoding='ISO 8859-1')
# Renomeia as colunas da tabela
csv = csv.rename(columns={'ï»¿Store ID ':'ID', 'Store_Area':'Loja', 'Items_Available':'Itens Disponíveis', 'Daily_Customer_Count':'Visitantes Diários', 'Store_Sales':'Vendas US$'})
print(csv)

# Cálcula o mínimo, máximo, média e desvio padrão de cada coluna, sendo elas, os itens disponíveis, clientes e vendas
itens = csv['Itens Disponíveis']
max = itens.values.max()
min = itens.values.min()
med = itens.values.mean()
des = itens.values.std()

# Depois de cálcular aplica no gráfico com título e as legendas informadas, faz isso para as três colunas e apresenta o gráfico (Eu não consegui entender muito bem oque era pra usar no eixo X, então informei um número similar ao exercício 2)
plt.title('Itens Disponíveis')
plt.xlabel('Ordem')
plt.ylabel('Resultado')
plt.grid()
plt.plot(1, max, marker='o')
plt.plot(2, min, marker='o')
plt.plot(3, med, marker='o')
plt.plot(4, des, marker='o')
plt.legend([f'x={1} y={max}', f'x={2} y={min}', f'x={3} y={med}', f'x={4} y={des}'])
plt.show()

visitantes = csv['Visitantes Diários']
max = visitantes.values.max()
min = visitantes.values.min()
med = visitantes.values.mean()
des = visitantes.values.std()

plt.title('Visitantes Diários')
plt.xlabel('Ordem')
plt.ylabel('Resultado')
plt.grid()
plt.plot(1, max, marker='o')
plt.plot(2, min, marker='o')
plt.plot(3, med, marker='o')
plt.plot(4, des, marker='o')
plt.legend([f'x={1} y={max}', f'x={2} y={min}', f'x={3} y={med}', f'x={4} y={des}'])
plt.show()

vendas = csv['Vendas US$']
max = vendas.values.max()
min = vendas.values.min()
med = vendas.values.mean()
des = vendas.values.std()

plt.title('VendasUS$')
plt.xlabel('Ordem')
plt.ylabel('Resultado')
plt.grid()
plt.plot(1, max, marker='o')
plt.plot(2, min, marker='o')
plt.plot(3, med, marker='o')
plt.plot(4, des, marker='o')
plt.legend([f'x={1} y={max}', f'x={2} y={min}', f'x={3} y={med}', f'x={4} y={des}'])
plt.show()