package org.example;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Jogador implements IAssinatura{

    private String skin;
    private String nickName;
    private float ranque;

    public Jogador(String nickName) {
        this.nickName = nickName;
        Jogador objeto = BD.getJogador(nickName);
        this.ranque = objeto.ranque;
        this.skin = objeto.skin;
    }

    public Jogador(String nickName, float ranque, String skin) {
        this.nickName = nickName;
        this.ranque = ranque;
        this.skin = skin;
    }

    public String getNickName() {
        return nickName;
    }



    @Override
    public List<Serializable> infoJogador() {
        return Arrays.asList(this.nickName, this.ranque);
    }

    @Override
    public List<Serializable> infoJogadorPremium(JogadorPremium jogadorPremium) {
        return Arrays.asList(this.nickName, this.ranque, this.skin);
    }
}
