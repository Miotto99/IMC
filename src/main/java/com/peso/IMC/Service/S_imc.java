package com.peso.IMC.Service;

import com.peso.IMC.Model.M_imc;
import com.peso.IMC.Model.M_resposta;
import org.springframework.stereotype.Service;

@Service
public class S_imc {

    public static M_resposta calImc(double altura, double peso){
        altura = altura/100;
        double resul = peso / (altura * altura);
        String resposta = "";
        if(resul < 18.5){
            resposta += "Abaixo do peso";
        }else if(resul >= 18.5 && resul<24.9){
            resposta += "Peso ideal";
        }else if(resul >= 24.9 && resul < 30){
            resposta += "Sobrepeso";
        }else if(resul >=30 && resul <34.9){
            resposta += "Obesidade Grau 1";
        }else if(resul >= 34.9 && resul < 40){
            resposta += "Obesidade Grau 2 (Severa)";
        }else{
            resposta += "Obesidade Grau 3 (Mórbida)";
        }
        M_resposta m_resposta = new M_resposta(resposta, resul);
        return m_resposta;
    }
}
