print("Sorteador")
# abertura da lista
listaSorteio = []
# repetição para cadastro de vários nomes
while True:
    d = input("Deseja inserir um doador? [S/N]")

# encerramento do programa
    if (d.upper() == 'N'):
        print("Encerrando registro...")
        break
# filtro do input
    elif (d.upper() != 'S'):
        print("Letra inválida, tente novamente...")
        continue
    else:
# input dos dados e inserção na lista
        nome = input("Digite o nome do doador:")
        valor = int(input("Digite o valor doado:"))
        x = valor // 10
        for i in range(x):
            listaSorteio.append(nome)

# impressão da lista na tela e embaralhamento para sorteio
import random
random.shuffle(listaSorteio)
sorteado = random.choice(listaSorteio)
print('Nomes cadastrados:', listaSorteio)
print("Embaralhando e sorteando o ganhador...")
print("O ganhador do sorteio foi {}!".format(sorteado))