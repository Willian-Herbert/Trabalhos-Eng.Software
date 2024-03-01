//Classe para definir atributos do Produto.
public class Produto
{
    public string Nome = "TV";
    public double Preco = 900;
    public int Quantidade = 10;
    public double VlTotEst = 9000;
    public void AddProd(int Qtd)
    {
        Quantidade += Qtd;
    }
    public void RemProd(int RQtd)
    {
        Quantidade -= RQtd;
    }
}
public class Televisao
{
    public static void Main()
    {
        //Definição da variável de decisão.
        var Input = "0";

        //Criação do produto.
        Produto TV1 = new Produto();

        //Output das informações iniciais do produto.
        Console.WriteLine("Esse é o estoque atual do produto:");
        Console.WriteLine("Nome do Produto: {0}", TV1.Nome);
        Console.WriteLine("Valor do Produto: {0:C2}", TV1.Preco);
        Console.WriteLine("Quantidade em Estoque: {0}", TV1.Quantidade);
        Console.WriteLine("Valor Total do Estoque: {0:C2}", TV1.VlTotEst);
        Console.WriteLine("--------------------------------------------");

        //Decisão da próxima operação.
        Console.WriteLine("Oque deseja fazer a seguir?");
        Console.WriteLine("1 - Adicionar Estoque, 2 - Remover Estoque, 3 - Sair.");

        //Repetição até apertar o botão de sair ou negativar o estoque do produto.
        while (Input != "3" && TV1.Quantidade >= 0)
        {
            Input = Console.ReadLine();
            if (Input == "1")
            {
                //Input da quantidade a ser adicionada.
                Console.WriteLine("Adicionar produtos selecionado. Quantas unidades deseja adicionar?");
                int QtdAdd = Convert.ToInt32(Console.ReadLine());

                //Adiciona os produtos através do método AddProd e refaz o cálculo do total do estoque.
                TV1.AddProd(QtdAdd);
                TV1.VlTotEst = TV1.Quantidade * TV1.Preco;

                //Output do estoque atual do produto.
                Console.WriteLine("Produto adicionado com sucesso. Dados atualizados do produto:");
                Console.WriteLine("Nome do Produto: {0}", TV1.Nome);
                Console.WriteLine("Valor do Produto: {0:C2}", TV1.Preco);
                Console.WriteLine("Quantidade em Estoque: {0}", TV1.Quantidade);
                Console.WriteLine("Valor Total do Estoque: {0:C2}", TV1.VlTotEst);
                Console.WriteLine("--------------------------------------------");
            }

            else if (Input == "2")
            {
                //Input da quantidade a ser removida.
                Console.WriteLine("Remover produtos selecionado. Quantas unidades deseja remover?");
                int QtdRem = Convert.ToInt32(Console.ReadLine());

                //Remove os produtos através do método RemProd e refaz o cálculo do total do estoque.
                TV1.RemProd(QtdRem);
                TV1.VlTotEst = TV1.Quantidade * TV1.Preco;

                //Output do estoque atual do produto.
                Console.WriteLine("Produto removido com sucesso. Dados atualizados do produto:");
                Console.WriteLine("Nome do Produto: {0}", TV1.Nome);
                Console.WriteLine("Valor do Produto: {0:C2}", TV1.Preco);
                Console.WriteLine("Quantidade em Estoque: {0}", TV1.Quantidade);
                Console.WriteLine("Valor Total do Estoque: {0:C2}", TV1.VlTotEst);
                Console.WriteLine("--------------------------------------------");
            }

            else
            {
                //Finalização do programa.
                Console.WriteLine("Finalizando Programa!");
                break;
            }

            Console.WriteLine("Oque deseja fazer a seguir?");
            Console.WriteLine("1 - Adicionar Estoque, 2 - Remover Estoque, 3 - Sair.");
        }
    }
}