package kongkin.bbu.edu.wepapitestingdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WepApiTestingDeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(WepApiTestingDeployApplication.class, args);
    }

    @GetMapping("")
    public String greeting(){
        return "Welcome to web api";
    }

    @GetMapping("/api")
    public String testApi(){
        return "Web api application working";
    }
}
