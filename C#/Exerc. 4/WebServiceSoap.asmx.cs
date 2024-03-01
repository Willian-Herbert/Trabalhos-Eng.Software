//Geração padrão do arquivo .asmx.
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace Exerc._4
{
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    public class WebServiceSoap : System.Web.Services.WebService
    {
        //Inicia o Web Método que faz o print do Nome e RU do aluno.
        [WebMethod]
        public string Aluno()
        {
            return "Nome: Willian Gustavo Herbert, RU: 3782182";
        }

        //Web Metodo que possui entrada dos coeficientes "a" e "b" e aplica o Teorema de Pitágoras.
        [WebMethod]
        public double Pitágoras(int a, int b)
        {
            //Faz o cálculo do teorema, multiplica o "a" e o "b" por ele mesmo e depois soma. Após isso faz a raiz da soma dos mesmos e retorna o "c" como resultado.
            double c = Math.Sqrt((a * a) + (b * b));

            return c;
        }
    }
}