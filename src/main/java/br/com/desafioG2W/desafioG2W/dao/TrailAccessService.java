package br.com.desafioG2W.desafioG2W.dao;

import br.com.desafioG2W.desafioG2W.model.Trail;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository("trail")
public class TrailAccessService implements TrailDao {
    @Override
    public void addTrail(JSONObject object) {
        try {
            Trail trail = new Trail();
            trail.setTrilha_nome(object.getString("nome"));
            trail.setDiretoria(object.getString("diretoria"));
            trail.setMissao_formal(object.getString("missao formal"));
            trail.setMissao_alternativa(object.getString("missao alternativa"));
            trail.setData_atualizacao(Date.valueOf(object.getString("atualizacao")));
//            new TrailAPI().saveTrail(trail);
        } catch (JSONException e) {
        }
    }

    @Override
    public void updateTrail(JSONObject object) {
        try {
            Trail trail = new Trail();
            trail.setTrilha_nome(object.getString("nome"));
            trail.setDiretoria(object.getString("diretoria"));
            trail.setMissao_formal(object.getString("missao formal"));
            trail.setMissao_alternativa(object.getString("missao alternativa"));
            trail.setData_atualizacao(Date.valueOf(object.getString("atualizacao")));
//            new TrailAPI().updateTrail(trail);
        } catch (JSONException e) {
        }
    }

    @Override
    public JSONArray listTrail() {
        return null;
    }
}
