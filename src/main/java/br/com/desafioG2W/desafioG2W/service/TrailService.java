package br.com.desafioG2W.desafioG2W.service;

import br.com.desafioG2W.desafioG2W.dao.TrailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class TrailService {
    private final TrailDao trailDao;

    @Autowired
    public TrailService(@Qualifier("MySQL") TrailDao trailDao) {
        this.trailDao = trailDao;
    }

    public void addTrail(JSONObject object) {
        trailDao.addTrail(object);
    }

    public void updateTrail(JSONObject object) {
        trailDao.updateTrail(object);
    }

    public JSONArray listTrail() {
        return trailDao.listTrail();
    }
}
