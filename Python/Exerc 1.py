# while True para deixar o programa rodando até dar o break
while True:
    # Entrada de dados do aluno
    aluno = input("Digite o nome do aluno:")
    nota = float(input("Digite a nota do aluno:"))
    # Qualificação da nota do aluno
    if (0.0 <= nota < 3.0):
        conceito = "E"
    elif (3.0 <= nota < 5.0):
        conceito = "D"
    elif (5.0 <= nota < 7.0):
        conceito = "C"
    elif (7.0 <= nota < 9.0):
        conceito = "B"
    elif (9.0 <= nota <= 10):
        conceito = "A"
    else:
        # Caso seja digitado uma nota inválida encerra-se o programa
        print("Nota inválida!")
        print("Encerrando programa...")
        break
    # Impressão dos dados finais e instruções de saída
    print("O(a) aluno(a) {} obteve a nota {} e se enquadra no conceito {}".format(aluno, nota, conceito))
    print("Para sair digite uma nota inválida (< 0 ou > 10)")
    print("------------------------------------------------------------------------")
    # Ultimo print apenas para deixar mais organizado entre uma nota e outra