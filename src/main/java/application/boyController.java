package application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boyController {

    @RequestMapping("/test")
    public  String tohome(){

        return "index";
    }
}
