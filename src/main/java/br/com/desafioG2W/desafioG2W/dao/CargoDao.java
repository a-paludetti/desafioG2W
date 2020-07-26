package br.com.desafioG2W.desafioG2W.dao;

import br.com.desafioG2W.desafioG2W.model.Cargo;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public interface CargoDao {

    void inserirCargo(JSONObject object);

    void atualizarCargo(JSONObject object);

    JSONArray listarCargo();
    //listar, inserir e atualizar informações no banco de dados,
}
