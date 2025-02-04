package com.cesar.fabrica;
import com.cesar.classe.Classe;
import com.cesar.raca.Raca;

public interface FabricaFaccoes {

    Raca escolherRaca();
    Classe escolherClasse();
}
