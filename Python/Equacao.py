# importa o matplot para criação do gráfico
import matplotlib.pyplot as plt

# função da equação que vai aplicar o cálculo de y
def equacao (x, a, b, c):
    y = a * x + b * x - c
    return y

# definição dos números de x e logo abaixo o a, b, e que são os últimos números do RU
x = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

a = 1
b = 8
c = 2

# laço de repetição para aplicar todos os cálculos, aplicando a lista x no laço, fazendo a equação e aplicando direto no gráfico
for i in range(10):
    i = x[i]
    plt.plot(i, equacao(i, a, b, c), marker="o")

# gráfico com título e legendas
plt.title('Equação linear')
plt.xlabel('Vetores')
plt.ylabel('Resultado')
plt.grid()
plt.legend([f'x={2} y={equacao(2, a, b, c)}', f'x={4} y={equacao(4, a, b, c)}', f'x={6} y={equacao(6, a, b, c)}', f'x={8} y={equacao(8, a, b, c)}', f'x={10} y={equacao(10, a, b, c)}', f'x={12} y={equacao(12, a, b, c)}', f'x={14} y={equacao(14, a, b, c)}', f'x={16} y={equacao(16, a, b, c)}', f'x={18} y={equacao(18, a, b, c)}', f'x={20} y={equacao(20, a, b, c)}'])
plt.show()