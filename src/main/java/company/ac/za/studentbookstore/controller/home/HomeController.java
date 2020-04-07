package company.ac.za.studentbookstore.controller.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("")
    public String domain(){
        return "Welcome to Student Book Store";
    }
    @GetMapping("/sts")
    public String home(){
        return "Welcome Home of Student Book Store";
    }
}
