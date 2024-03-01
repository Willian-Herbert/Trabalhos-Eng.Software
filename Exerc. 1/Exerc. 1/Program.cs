//Introdução para o programa.
Console.WriteLine("Olá!");
Console.WriteLine("Seja bem vindo(a) a calculadora de bhaskara. Por favor, informe os coeficientes para fazer o cálculo.");

//Input dos coeficientes.
Console.WriteLine("Coeficiente a:");
int CoeA = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Coeficiente b:");
int CoeB = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Coeficiente c:");
int CoeC = Convert.ToInt32(Console.ReadLine());

//Calculo da Bhaskara.
double Delta = ((CoeB * CoeB) - 4 * CoeA * CoeC);
double x1 = ((-CoeB) + (Math.Sqrt(Delta))) / (2 * CoeA);
double x2 = ((-CoeB) - (Math.Sqrt(Delta))) / (2 * CoeA);

//Condição de falha do cálculo.
if (CoeA == 0 || Delta < 0)
    Console.WriteLine("Impossível calcular.");

//Caso esteja tudo certo, Output dos resultados.
else
{
    Console.WriteLine("As raízes da equação são:");
    Console.WriteLine("X1 = " + x1);
    Console.WriteLine("X2 = " + x2);
}