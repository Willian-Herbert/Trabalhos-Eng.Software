class Counter
{
    //Função para verificar quais números são primos.
    static void Contagem()
    {
        //Variável que conta quantas saidas tem dentro de um número.
        int Contador = 0;

        //Input do número para ser verificado. Entra como string e é convertido para inteiro.
        Console.WriteLine("Insira um número para buscar os números primos dentro dele:");
        int Input = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine("Voce digitou {0}, seus números primos são:", Input);

        //Faz a contagem dos números de 1 até o inteiro digitado e aplica no for de dentro 1 por 1. 
        for (int Num = 1; Num <= Input; Num++)
        {
            Contador = 0;

            //Aplica os números do For de fora. Números primos tem 2 resultados possíveis, igualando o contador a 2, fazendo printar o número.
            for (int i = 1; i <= Num; i++)
            {
                if (Num % i == 0)
                {
                    Contador += 1;
                }
            }

            //Printa os números que possuem 2 saídas, sendo apenas os primos.
            if (Contador == 2)
            {
                Console.WriteLine(Num);
            }
        }
    }

    static void Main()
    {
        //Inicia a Thread executando a função Contagem. O Join trava a Main Thread, printando o fim da execução somente após o fim da Thread1.
        Thread Thread1 = new Thread(Contagem);
        Thread1.Start();
        Thread1.Join();
        Console.WriteLine("Fim da Execuçao.");
    }
}