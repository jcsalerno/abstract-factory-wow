package com.cesar;
import com.cesar.classe.Classe;
import com.cesar.fabrica.FabricaAlianca;
import com.cesar.fabrica.FabricaHorda;
import com.cesar.raca.Raca;
import com.cesar.fabrica.FabricaFaccoes;

public class Main {
    public static void main(String[] args) {

        FabricaFaccoes fabricaHorda = new FabricaHorda();
        Raca racaHorda = fabricaHorda.escolherRaca();
        Classe classeHorda = fabricaHorda.escolherClasse();
        System.out.println("Você escolheu a facção Horda da raça " + racaHorda.mostrarRaca() + " da classe " + classeHorda.mostrarClasse() + ".");

        FabricaFaccoes fabricaAlianca = new FabricaAlianca();
        Raca racaAlianca = fabricaAlianca.escolherRaca();
        Classe classeAlianca = fabricaAlianca.escolherClasse();
        System.out.println("Você escolheu a facção Aliança da raça " + racaAlianca.mostrarRaca() + " da classe " + classeAlianca.mostrarClasse() + ".");
    }
}