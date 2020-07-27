package br.com.desafioG2W.desafioG2W.dao;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public interface PositionDao {

    void addCargo(JSONObject object);

    void updateCargo(JSONObject object);

    JSONArray listCargo();
    //listar, inserir e atualizar informações no banco de dados,
}
