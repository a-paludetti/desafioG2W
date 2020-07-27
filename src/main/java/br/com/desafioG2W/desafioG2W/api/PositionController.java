package br.com.desafioG2W.desafioG2W.api;

import br.com.desafioG2W.desafioG2W.service.PositionService;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService){
        this.positionService = positionService;
    }

    public void addPosition(JSONObject object){
        positionService.addPosition(object);
    }

    public void updatePosition(JSONObject object){
        positionService.updatePosition(object);
    }

    public JSONArray listPosition(){
        return positionService.listPosition();
    }
}
