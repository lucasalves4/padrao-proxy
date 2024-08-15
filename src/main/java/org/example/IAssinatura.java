package org.example;

import java.io.Serializable;
import java.util.List;

public interface IAssinatura {

    List<Serializable> infoJogador();
    List<Serializable> infoJogadorPremium(JogadorPremium jogadorPremium);
}
