package org.example;

public class JogadorPremium {

    private String nickName;
    private boolean assinatura;

    public JogadorPremium(String nickName, boolean assinatura) {
        this.nickName = nickName;
        this.assinatura = assinatura;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isAssinatura() {
        return assinatura;
    }

    public void setAssinatura(boolean assinatura) {
        this.assinatura = assinatura;
    }
}
