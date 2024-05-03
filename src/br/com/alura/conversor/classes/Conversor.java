package br.com.alura.conversor.classes;

import br.com.alura.conversor.Controllers.ApiController;

import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversor {
    private String cotacao;
    private String target;

    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.
                    LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();



    public Conversor(String cot, String targ){
        this.cotacao = cot;
        this.target = targ;
    }

    public float calcula(float valor) throws IOException, InterruptedException {
        float resposta = 0;
            ApiController apiController = new ApiController();
            String json = apiController.connect(cotacao + "/" + target, valor);
            Moeda moeda = gson.fromJson(json, Moeda.class);
            resposta = Float.parseFloat(moeda.conversion_result());
            return resposta;
    }

    public String getCotacao() {
        return cotacao;
    }

    public String getTarget() {
        return target;
    }
}
