/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package functions;

/**
 *
 * @author aayan
 */
public class Processador extends Thread {

    //Propriedades da classe
    //que sera uma thread
    //analogia:
    //seria uma pessoa feita para fazer o que o metedo run pede
    private final String nome;
    private final int inicio;
    private final int fim;
    private final String cor;

    //Construtor
    public Processador(String nome, int inicio, int fim, String cor) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
        this.cor = cor;
    }

    //Medoto da classe Thread sendo reescrito
    @Override
    public void run() {
        //funcao de validar o numero

        //variaveis usadas
        int atual = inicio;
        int ehPrimo = 0;

        //enquanto o numero atual for menor que o numero final
        while (atual < fim) {

            //laço que percorre os numeros ate o valor atual
            //com i sendo o contador
            for (int i = 1; i < atual; i++) {

                //se o numero atual dividido por i for igual a zero
                //e o atual for diferente de 1(validacao para funcionamento
                //correto do metodo)
                if (atual % i == 0 && atual != 1) {
                    //entao o identificador de primo recebe +1
                    //obs: primos sao apenas divisiveis por 1 e por ele mesmo
                    ehPrimo++;
                }
            }
            //apos percorrer todos os numeros anteriores ao atual sai do laço
            

            //se o indentificador de primos NAO for maior que 1
            //ou seja se o numero atual for divisivel por qualquer outro numero
            //anterior a ele EXCETO o 1(citado na verificacao acima)
            //o identificador de primos seria maior que 1
            //logo o numero atual nao seria um primo
            if (!(ehPrimo > 1)) {
                //visualisacao no console
                System.out.println(cor + "(" + nome + ")" + " Numero Primo: " + atual + "\u001B[0m");
            }
            
            //zerando o identificador
            ehPrimo = 0;
            
            //proximo numero da contagem de inicio ao fim
            //atributos/propriedades da classe
            atual++;
        }
        //apos terminar de verificar todos os numeros do incio ao fim
        //o while sera terminado e o metodo sera finalizado
    }

}
