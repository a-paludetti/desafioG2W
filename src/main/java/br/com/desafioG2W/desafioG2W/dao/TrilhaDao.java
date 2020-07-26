package br.com.desafioG2W.desafioG2W.dao;

import br.com.desafioG2W.desafioG2W.model.Trilha;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public interface TrilhaDao {

    void inserirTrilha(JSONObject trilha);

    JSONArray listarTrilha();

    void atualizarTrilha(JSONObject trilha);
}
