package org.example;

import java.io.Serializable;
import java.util.List;

public class JogadorProxy implements IAssinatura{

    private Jogador jogador;

    private String nickName;

    public JogadorProxy(String nickName) {
        this.nickName = nickName;
    }


    @Override
    public List<Serializable> infoJogador() {
        if (this.jogador == null) {
            this.jogador = new Jogador(this.nickName);
        }
        return this.jogador.infoJogador();
    }

    @Override
    public List<Serializable> infoJogadorPremium(JogadorPremium jogadorPremium) {
        if (!jogadorPremium.isAssinatura()) {
            throw new IllegalArgumentException("Jogador não autorizado a visualizar a skin do oponente");
        }
        if (this.jogador == null) {
            this.jogador = new Jogador(this.nickName);
        }
        return this.jogador.infoJogadorPremium(jogadorPremium);
    }
}
