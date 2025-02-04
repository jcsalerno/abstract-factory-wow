package com.cesar.fabrica;
import com.cesar.classe.Classe;
import com.cesar.classe.Guerreiro;
import com.cesar.raca.Orc;
import com.cesar.raca.Raca;

public class FabricaHorda implements FabricaFaccoes {

    @Override
    public Raca escolherRaca() {
        return new Orc();
    }

    @Override
    public Classe escolherClasse() {
        return new Guerreiro();
    }
}
