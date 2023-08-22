package com.peso.IMC.Model;

public class M_resposta {

    private String resposta;
    private double imc;

    public M_resposta(String resposta, double imc) {
        this.resposta = resposta;
        this.imc = imc;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
