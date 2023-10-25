package ucu.edu.apps.flowerstoreContinue.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucu.edu.apps.flowerstoreContinue.Flower;
import ucu.edu.apps.flowerstoreContinue.FlowerColor;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower(){
        return List.of(new Flower( 11, 11, FlowerColor.RED));
    }
}
