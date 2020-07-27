package br.com.desafioG2W.desafioG2W.dao;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public interface TrailDao {

    void addTrail(JSONObject trilha);

    void updateTrail(JSONObject trilha);

    JSONArray listTrail();
}
