package com.cesar.fabrica;
import com.cesar.classe.Classe;
import com.cesar.classe.Paladino;
import com.cesar.raca.Humano;
import com.cesar.raca.Raca;

public class FabricaAlianca  implements FabricaFaccoes{

    @Override
    public Raca escolherRaca() {
        return new Humano();
    }

    @Override
    public Classe escolherClasse() {
        return new Paladino();
    }
}
