/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package sothreadsprimos;

import functions.Processador;

/**
 *
 * @author aayan
 */
public class SOThreadsPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //cores para o console
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        //criando classe que verifica os numeros do 1 ao 33333
        //mostrando no console todos os primos encontrados
        Processador lista1 = new Processador("1 - Thread", 1, 33333, ANSI_GREEN);
        lista1.start();

        Processador lista2 = new Processador("2 - Thread", 33333, 66666, ANSI_BLUE);
        lista2.start();

        Processador lista3 = new Processador("3 - Thread", 66666, 99999, ANSI_BLACK);
        lista3.start();
    }

}
