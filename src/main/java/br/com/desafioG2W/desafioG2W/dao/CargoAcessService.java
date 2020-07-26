package br.com.desafioG2W.desafioG2W.dao;

import br.com.desafioG2W.desafioG2W.model.Cargo;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class CargoAcessService implements CargoDao{

    @Override
    public void inserirCargo(JSONObject object) {
        Cargo cargo = new Cargo();

    }

    @Override
    public void atualizarCargo(JSONObject object) {

    }

    @Override
    public JSONArray listarCargo() {
        return null;
    }
}
