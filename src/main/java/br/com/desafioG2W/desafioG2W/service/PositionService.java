package br.com.desafioG2W.desafioG2W.service;

import br.com.desafioG2W.desafioG2W.dao.PositionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class PositionService {
    private final PositionDao positionDao;

    @Autowired
    public PositionService(@Qualifier("MySQL") PositionDao positionDao) {
        this.positionDao = positionDao;
    }

    public void addPosition(JSONObject object) {
        positionDao.addCargo(object);
    }

    public void updatePosition(JSONObject object) {
        positionDao.updateCargo(object);
    }

    public JSONArray listPosition() {
        return positionDao.listCargo();
    }
}
