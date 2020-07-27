package br.com.desafioG2W.desafioG2W.service;

import br.com.desafioG2W.desafioG2W.dao.TrailDao;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class TrailService {
    private final TrailDao trailDao;

    public TrailService(TrailDao trailDao){
        this.trailDao = trailDao;
    }

    public void addTrail(JSONObject object){
        trailDao.addTrail(object);
    }

    public void updateTrail(JSONObject object){
        trailDao.updateTrail(object);
    }

    public JSONArray listTrail(){
        return trailDao.listTrail();
    }
}
