# função para retornar a primeira letra do nome
def abrevNome(nome, sobrenome):
    return nome[0] + sobrenome

# entrada de dados
nome = input("Digite seu nome:")
sobrenome = input("Digite seu sobrenome:")
RU = input("Digite seu RU:")

# string de retorno para transformar em minúsculo no print
ret = (abrevNome(nome, sobrenome))

# print final do email
print("{} {}, seu email é {}{}@algoritmos.com.br".format(nome, sobrenome, ret.lower(), RU[5:]))

