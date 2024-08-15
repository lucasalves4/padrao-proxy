package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JogadorProxyTest {

    @BeforeEach
    void setUp() {
        BD.addJogador(new Jogador("Mandynha0102", 1f, "Assassina"));
        BD.addJogador(new Jogador("GuguMatador", 3f, "Fadinha"));
    }

    @Test
    void deveRetornarDadosPessoaisJogador() {
        JogadorProxy jogador= new JogadorProxy("GuguMatador");

        assertEquals(Arrays.asList("GuguMatador", 3f), jogador.infoJogador());
    }

    @Test
    void deveMostrarSkinsJogador() {
        JogadorPremium jogadorPremium = new JogadorPremium("RayRayDoEuroTruck", true);
        JogadorProxy jogador = new JogadorProxy("GuguMatador");

        assertEquals(Arrays.asList("GuguMatador", 3f, "Fadinha"), jogador.infoJogadorPremium(jogadorPremium));
    }

    @Test
    void deveRetonarExcecaoJogadorNaoAutorizadoConsultarInfoJogador() {
        try {
            JogadorPremium jogadorPremium = new JogadorPremium("MariconaDoBosque03", false);
            JogadorProxy jogador = new JogadorProxy("Mandynha0102");

            jogador.infoJogadorPremium(jogadorPremium);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Jogador não autorizado a visualizar a skin do oponente", e.getMessage());
        }
    }

}