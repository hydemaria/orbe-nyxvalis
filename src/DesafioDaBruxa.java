

/* Desafio 1:
3 Bruxas Aprendizes da Ordem de Nyxvalis com seus respectivos Feitiços de Provação */

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class DesafioDaBruxa {
    public static void main(String[] args) {
        String bruxa1 = "Lyria das Névoas";
        int idadeBruxa1 = 19; // ver como colocar a idade como 14 ciclos lunares,etc
        String missaoBruxa1 = "Chama do Véu Lunar";
        String nivelBruxa1 = "B";


        System.out.println("Bruxas com menos de 15 ciclos lunares **só podem concluir feitiços de nível C ou D**.");
        System.out.println("Bruxas com 15 ou mais **podem realizar qualquer nível**.");
        System.out.println();
        System.out.println("**** Ficha Mistica das Bruxas ****");
        System.out.println();
        System.out.println("Nome da Bruxa: " + bruxa1);
        System.out.println("Idade: " + idadeBruxa1 + " ciclos lunares");
        System.out.println("Missão: " + bruxa1 + " é " + missaoBruxa1);
        System.out.println("Nivel da missão: " + nivelBruxa1);

        if (idadeBruxa1> 15) {
            System.out.println("Status da missão: concluída");
        } else {
            System.out.println("Status da missão: não concluída");

        }

        System.out.println();
        System.out.println("****************************************************");

        String bruxa2 = "Thalindra Sombria";
        int idadeBruxa2 = 17;
        String missaoBruxa2 = "Sussurros de Nyx";
        String nivelBruxa2 = "A";

        System.out.println("Nome da Bruxa: " + bruxa2);
        System.out.println("Idade: " + idadeBruxa2 + " ciclos lunares");
        System.out.println("Missão: " + bruxa2 + " é " + missaoBruxa2);
        System.out.println("Nivel da missão: " + nivelBruxa2);

        if (idadeBruxa2> 15) {
            System.out.println("Status da missão: concluída");
        } else {
            System.out.println("Status da missão: não concluída");
        }


        System.out.println();
        System.out.println("****************************************************");

        String bruxa3 = "Maelin do Orvalho Azul";
        int idadeBruxa3 = 13;
        String missaoBruxa3 = "Brilho Calmante da Lua Nova";
        String nivelBruxa3 = "C";


        System.out.println("Nome da Bruxa: " + bruxa3);
        System.out.println("Idade: " + idadeBruxa3 + " ciclos lunares");
        System.out.println("Missão: " + bruxa3 + " é " + missaoBruxa3);
        System.out.println("Nivel da missão: " + nivelBruxa3);

        if (idadeBruxa3> 15) {
            System.out.println("Status da missão: concluída");
        } else {
            System.out.println("Status da missão: não concluída");
        }


    }
}











// nome, idade e feitiço


