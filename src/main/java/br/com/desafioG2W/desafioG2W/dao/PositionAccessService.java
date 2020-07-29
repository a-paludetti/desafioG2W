package br.com.desafioG2W.desafioG2W.dao;

import br.com.desafioG2W.desafioG2W.model.Position;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository("position")
public class PositionAccessService implements PositionDao {

    @Override
    public void addCargo(JSONObject object) {
        try {
            Position position = new Position();
            position.setCargo_nome(object.getString("Nome"));
            position.setTrail_id(object.getInt("trilha"));
            position.setCargo_missao(object.getString("cargo missao"));
            position.setData_atualizacao(Date.valueOf(object.getString("atualizacao")));
            //new CargoAPI().save(cargo);
        } catch (JSONException e) {

        }
    }

    @Override
    public void updateCargo(JSONObject object) {
        try {
            Position position = new Position();
            position.setCargo_nome(object.getString("Nome"));
//            cargo.setTrilha_id(new CargoApi().getTrilha(object.get("trilha")));
            position.setCargo_missao(object.getString("cargo missao"));
            position.setData_atualizacao(Date.valueOf(object.getString("atualizacao")));
            //new CargoAPI().update(cargo);
        } catch (JSONException e) {

        }
    }

    @Override
    public JSONArray listCargo() {
//        return new CargoApi().getList();
        return null;
    }
}
