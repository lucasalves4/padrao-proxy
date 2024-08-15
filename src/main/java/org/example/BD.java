package org.example;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<String, Jogador> jogadores = new HashMap<>();

    public static Jogador getJogador(String nickName) {
        return jogadores.get(nickName);
    }

    public static void addJogador(Jogador jogador) {
        jogadores.put(jogador.getNickName(), jogador);
    }
}
