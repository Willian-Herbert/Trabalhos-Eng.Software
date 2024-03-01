# importar a raiz
from math import sqrt

# classe calculadora com as funções de operação
class calculadora:
    
    def soma (numero1, numero2):
        return numero1 + numero2
    
    def subtracao (numero1, numero2):
        return numero1 - numero2

    def multiplicacao (numero1, numero2):
        return numero1 * numero2

    def divisao (numero1, numero2):
        return numero1 / numero2

    def expoente (numero1, numero2):
        return numero1 ** numero2

    def resto (numero1, numero2):
        return numero1 % numero2

    def raiz (numero1, numero2):
        return sqrt(numero1 + numero2)

# laço de repetição para fazer vários cálculos
while True:
    print("Bem vindo a calculadora!")
    print()
    print("OPERAÇÕES")
    print("--------------------------------------------------")
    print("1 - Soma;\n2 - Subtração;\n3 - Multiplicação;\n4 - Divisão;\n5 - Exponenciação;\n6 - Resto;\n7 - Raíz quadrada da soma;\n0 - Sair;")
    print("--------------------------------------------------")
    op = int(input("Qual operação deseja realizar?"))

# if com cada operação disponível, solicita os dois números a serem calculados e aplica na operação escolhida, resultando em um total e printando na tela
    if (op == 1):
        print("Quais números deseja somar?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.soma(num1, num2)
        print("A soma dos números é {}.".format(total))

    elif (op == 2):
        print("Quais números deseja subtrair?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.subtracao(num1, num2)
        print("A subtração dos números é {}.".format(total))

    elif (op == 3):
        print("Quais números deseja multiplicar?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.multiplicacao(num1, num2)
        print("A multiplicação dos números é {}.".format(total))

    elif (op == 4):
        print("Quais números deseja dividir?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.divisao(num1, num2)
        print("A divisao dos números é {}.".format(total))

    elif (op == 5):
        print("Quais números deseja exponenciar?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.expoente(num1, num2)
        print("A exponenciação dos números é {}.".format(total))

    elif (op == 6):
        print("Quais números deseja utilizar?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.resto(num1, num2)
        print("O resto dos números é {}.".format(total))

    elif (op == 7):
        print("Quais números deseja aplicar a raíz?")
        num1 = int(input("Número 1:"))
        num2 = int(input("Número 2:"))
        total = calculadora.raiz(num1, num2)
        print("A raíz da soma dos números é {}.".format(total))

# encerra o laço de repetição caso escolhido operação 0
    elif (op == 0):
        print("Encerrando programa...")
        break

# verificação caso tenha sido inserido um valor incorreto de operação
    else:
        print("Entrada inválida, tente novamente.")
        continue

# possibilidade de encerrar o programa após um cálculo
    f = input("Deseja fazer mais alguma operação? [S/N]")
    if (f.upper() == 'N'):
        print("Encerrando programa...")
        break