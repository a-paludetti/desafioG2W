package br.com.desafioG2W.desafioG2W.api;

import br.com.desafioG2W.desafioG2W.service.TrailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RequestMapping("g2w/trail")
@RestController
public class TrailController {

    private final TrailService trailService;

    @Autowired
    public TrailController(TrailService trailService) {
        this.trailService = trailService;
    }

    @PostMapping("/addTrail/")
    public void addTrail(@RequestBody  JSONObject object){
        trailService.addTrail(object);
    }

    @PostMapping("/updateTrail/")
    public void updateTrail(@RequestBody JSONObject object){
        trailService.updateTrail(object);
    }

    @GetMapping("/listTrail/")
    public JSONArray listTrail(){
        return trailService.listTrail();
    }
}
