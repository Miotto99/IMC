package com.peso.IMC.Controller;

import com.peso.IMC.Model.M_imc;
import com.peso.IMC.Model.M_resposta;
import com.peso.IMC.Service.S_imc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_imc {
    @GetMapping("/")
    public String Hello() {
        return "/index";
    }

    @PostMapping("/")
    public String postIMC(@RequestParam("altura") double altura,
                          @RequestParam("peso") double peso,
                          Model model){
        M_resposta resposta = S_imc.calImc(altura, peso);
        String numRedondo = String.format("%.2f",Double.parseDouble(String.valueOf(resposta.getImc())));

        model.addAttribute("numRedondo",numRedondo);
        model.addAttribute("resposta",resposta.getResposta());
        return "index";
    }
}
