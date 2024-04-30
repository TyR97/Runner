package gde.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/results")
public class ResultRestController {

    @Autowired
    private ResultService resultService;

    @PostMapping("/addresult")
    public ResponseEntity<?> addResult(@RequestBody ResultEntity resultEntity){
        ResultEntity savedResultEntity = resultService.addResult(resultEntity);
        return ResponseEntity.ok(savedResultEntity);
    }
}
