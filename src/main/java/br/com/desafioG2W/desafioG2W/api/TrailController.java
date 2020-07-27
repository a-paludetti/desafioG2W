package br.com.desafioG2W.desafioG2W.api;

import br.com.desafioG2W.desafioG2W.service.TrailService;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class TrailController {

    private final TrailService trailService;

    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }

    public void addTrail(JSONObject object){
        trailService.addTrail(object);
    }

    public void updateTrail(JSONObject object){
        trailService.updateTrail(object);
    }

    public JSONArray listTrail(){
        return trailService.listTrail();
    }
}
