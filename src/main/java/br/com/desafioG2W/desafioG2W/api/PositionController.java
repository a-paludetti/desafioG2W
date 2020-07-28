package br.com.desafioG2W.desafioG2W.api;

import br.com.desafioG2W.desafioG2W.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RequestMapping("g2w/position")
@RestController
public class PositionController {

    private final PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService){
        this.positionService = positionService;
    }

    @PostMapping("/addPosition/")
    public void addPosition(@RequestBody JSONObject object){
        positionService.addPosition(object);
    }

    @PostMapping("/updatePosition/")
    public void updatePosition(@RequestBody JSONObject object){
        positionService.updatePosition(object);
    }

    @GetMapping("/listPosition/")
    public JSONArray listPosition(){
        return positionService.listPosition();
    }
}
